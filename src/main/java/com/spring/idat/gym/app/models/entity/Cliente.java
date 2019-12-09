package com.spring.idat.gym.app.models.entity;

import lombok.Data;

@Data
public class Cliente {

	private int id;
	
	private String nombres;
	
	private String apellidos;
	
	private String correo;
	
	private String celular;
	
	private String dni;
	
	private String edad;
	
	private byte estado;
	
}
