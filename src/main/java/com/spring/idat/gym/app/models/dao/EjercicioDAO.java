package com.spring.idat.gym.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.idat.gym.app.models.entity.Ejercicio;

public interface EjercicioDAO extends CrudRepository<Ejercicio, Integer>{

}
