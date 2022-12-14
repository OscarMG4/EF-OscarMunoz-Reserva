package com.idat.pe.ef.OscarMunoz.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "reservas")
public class Reserva {
	
	private Integer idReserva;
	private Double costo;
	
}
