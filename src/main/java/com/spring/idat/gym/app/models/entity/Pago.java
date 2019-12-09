package com.spring.idat.gym.app.models.entity;

import java.util.Date;

import lombok.Data;

@Data
public class Pago {

	private int id;
	
	private Date fecha;
	
	private String monto;
	
	private byte estado;
	
	private int idBoleta;
}
