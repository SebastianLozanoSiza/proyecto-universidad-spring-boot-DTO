package com.universidad.demo.services;

import java.util.List;

import com.universidad.demo.dto.MatriculaDTO;

public interface MatriculaService {

    MatriculaDTO save(MatriculaDTO matricula);

    List<MatriculaDTO> findAll();
    
}