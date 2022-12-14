package com.idat.pe.ef.OscarMunoz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.pe.ef.OscarMunoz.model.Hospedaje;

@Repository
public interface HospedajeRepository extends JpaRepository<Hospedaje, Integer> {

}
