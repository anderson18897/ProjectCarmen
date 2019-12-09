package com.spring.idat.gym.app.models.entity;

import java.util.Date;

import lombok.Data;

@Data
public class Trabajador_Equipo {

	private int idTrabajador;
	
	private int idEquipos;
	
	private Date fecha_inicio;
	
}
