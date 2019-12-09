package com.spring.idat.gym.app.models.entity;

import com.sun.istack.NotNull;

import lombok.Data;

@Data
public class Cliente_Rutina {

	@NotNull
	private int idCliente;
	
	@NotNull
	private int idRutina;
	
}
