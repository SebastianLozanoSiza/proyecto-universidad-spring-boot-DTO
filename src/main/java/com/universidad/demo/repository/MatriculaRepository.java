package com.universidad.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.universidad.demo.repository.entities.MatriculaEntity;

public interface MatriculaRepository extends CrudRepository<MatriculaEntity, Long>{
    
}
