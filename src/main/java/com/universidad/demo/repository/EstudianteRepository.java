package com.universidad.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.universidad.demo.repository.entities.EstudianteEntity;

public interface EstudianteRepository extends CrudRepository<EstudianteEntity,Long>{
    
}