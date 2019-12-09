package com.spring.idat.gym.app.models.entity;

import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import com.sun.istack.NotNull;

import lombok.Data;

@Data
public class Clase {

	@Id
	private int id;
	
	@NotEmpty
	private String nombre;
	
	@NotEmpty
	private byte estado;
	
	@NotNull
	private int idHorario;
	
	@NotNull
	private int idEntrenador;
	
	@NotNull
	private int idCliente;
	
}
