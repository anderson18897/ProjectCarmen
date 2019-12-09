package com.spring.idat.gym.app.models.entity;

import java.util.Date;

import lombok.Data;

@Data
public class Inscripcion {

	private int id;
	
	private Date fecha;
	
	private String numero;
	
	private double igv;
	
	private double total;
	
	private byte estado;
	
	private int idCliente;
	
	private int idTrabajador;
	
	private int idMembresia;
	
}
