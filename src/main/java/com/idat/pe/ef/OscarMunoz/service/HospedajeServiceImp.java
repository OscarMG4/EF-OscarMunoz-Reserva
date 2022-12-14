package com.idat.pe.ef.OscarMunoz.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.pe.ef.OscarMunoz.dto.HospedajeDTO;
import com.idat.pe.ef.OscarMunoz.model.Hospedaje;
import com.idat.pe.ef.OscarMunoz.repository.HospedajeRepository;

@Service
public class HospedajeServiceImp implements HospedajeService{
	
	@Autowired
	private HospedajeRepository repository;
	
	@Override
	public List<HospedajeDTO> listar() {
		
		List<HospedajeDTO> listadto = new ArrayList<>();
		HospedajeDTO dto = null;
				
		for (Hospedaje hospedaje : repository.findAll()) {
			dto = new HospedajeDTO();
			dto.setId(hospedaje.getIdHospedaje());
			dto.setNombre(hospedaje.getNombre());
			listadto.add(dto);
		}

		return listadto;
	}

	@Override
	public void guardar(HospedajeDTO hospedaje) {
		// TODO Auto-generated method stub
		
		Hospedaje hospe = new Hospedaje();
		hospe.setIdHospedaje(hospedaje.getId());
		hospe.setNombre(hospedaje.getNombre());
		
		repository.save(hospe);
		
	}

}
