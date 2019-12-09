package com.spring.idat.gym.app.models.entity;

import java.util.Date;

import lombok.Data;

@Data
public class Horario {

	private int id;
	
	private Date dia;
	
	private int hora;
	
	private String turno;
	
	private byte estado;
	
}
