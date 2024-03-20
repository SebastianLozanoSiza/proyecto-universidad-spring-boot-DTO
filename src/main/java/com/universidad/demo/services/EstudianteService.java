package com.universidad.demo.services;

import java.util.List;

import com.universidad.demo.dto.EstudianteDTO;

public interface EstudianteService {

    List<EstudianteDTO> findAll();
    
}