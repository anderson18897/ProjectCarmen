package com.spring.idat.gym.app.models.entity;

import java.util.Date;

import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import com.sun.istack.NotNull;

import lombok.Data;

//La anotacion @Data nos proporciona los metodos Getters y Setters sin la necesidad de implementarlos en nuestro
//codigo haciendo que nuestra lineas de codigo sean menos.Para hacer uso de ello tenemos que inyectar la dependencia
//Lombok
@Data
public class Boleta {
	
	//La anotacion @Id informa al compilador que este atributo funciona como Id o clave primaria
	@Id
	private int id;
	
	//La anotacion @NotEmpty no permite que el atributo se ingresen datos vacios.
	@NotEmpty
	private Date fecha;
	
	@NotEmpty
	private double total;
	
	@NotEmpty
	private byte estado;
	
	@NotNull
	private int idInscripcion;

}
