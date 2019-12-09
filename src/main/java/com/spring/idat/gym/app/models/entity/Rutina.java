package com.spring.idat.gym.app.models.entity;

import java.util.Date;

import lombok.Data;

@Data
public class Rutina {

	private int id;
	
	private String descripcion;
	
	private Date fecha_inicio;
	
	private Date fecha_fin;
}
