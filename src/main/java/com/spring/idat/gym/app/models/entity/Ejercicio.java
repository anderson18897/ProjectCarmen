package com.spring.idat.gym.app.models.entity;

import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

//La anotacion @Data nos proporciona los metodos Getters y Setters sin la necesidad de implementarlos en nuestro
//codigo haciendo que nuestra lineas de codigo sean menos.Para hacer uso de ello tenemos que inyectar la dependencia
//Lombok
@Data
public class Ejercicio {

	//La anotacion @Id informa al compilador que este atributo funciona como Id o clave primaria
		@Id
		private int id;
		
		//La anotacion @NotEmpty no permite que el atributo se ingresen datos vacios.
		@NotEmpty
		private String nombre;
		
		@NotEmpty
		private String musculo;
	
}
