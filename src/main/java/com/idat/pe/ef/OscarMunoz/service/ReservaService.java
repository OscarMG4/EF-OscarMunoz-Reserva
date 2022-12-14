package com.idat.pe.ef.OscarMunoz.service;

import java.util.List;

import com.idat.pe.ef.OscarMunoz.dto.ReservaDTO;

public interface ReservaService {
	
	List<ReservaDTO> listar();
	void guardar(ReservaDTO reserva);
	
}
