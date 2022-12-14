package com.idat.pe.ef.OscarMunoz.service;

import java.util.List;

import com.idat.pe.ef.OscarMunoz.dto.HospedajeDTO;

public interface HospedajeService {
	
	List<HospedajeDTO> listar();
	void guardar(HospedajeDTO hospedaje);
	
}
