package com.spring.idat.gym.app.models.entity;

import lombok.Data;

@Data
public class Trabajador {

	private int id;
	
	private String nombres;
	
	private String apellidos;
	
	private String correo;
	
	private String celular;
	
	private String usuario;
	
	private String password;
	
	private String tipo;
	
	private byte estado;
	
}
