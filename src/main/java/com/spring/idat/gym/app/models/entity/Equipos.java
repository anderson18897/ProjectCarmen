package com.spring.idat.gym.app.models.entity;

import lombok.Data;

@Data
public class Equipos {

	private int id;
	
	private String nombre;
	
	private int cantidad;
	
	private String descripcion;
	
	private byte estado;
}
