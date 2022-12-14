package com.idat.pe.ef.OscarMunoz.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.pe.ef.OscarMunoz.dto.ReservaDTO;
import com.idat.pe.ef.OscarMunoz.model.Reserva;
import com.idat.pe.ef.OscarMunoz.repository.ReservaRepository;

@Service
public class ReservaServiceImp implements ReservaService{
	
	@Autowired
	private ReservaRepository repository;
	
	@Override
	public List<ReservaDTO> listar() {
		// TODO Auto-generated method stub
		
		List<ReservaDTO> listadto = new ArrayList<>();
		ReservaDTO dto = null;
				
		for (Reserva reserva : repository.findAll()) {
			dto = new ReservaDTO();
			dto.setId(reserva.getIdReserva());
			dto.setCosto(reserva.getCosto());
			listadto.add(dto);
		}

		return listadto;
	}

	@Override
	public void guardar(ReservaDTO reserva) {
		// TODO Auto-generated method stub
		
		Reserva reser = new Reserva();
		reser.setIdReserva(reserva.getId());
		reser.setCosto(reserva.getCosto());
		
		repository.save(reser);
		
	}

}
