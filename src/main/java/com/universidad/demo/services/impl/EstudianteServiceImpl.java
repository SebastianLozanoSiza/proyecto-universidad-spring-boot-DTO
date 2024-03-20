package com.universidad.demo.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.universidad.demo.config.EstudianteDTOConverte;
import com.universidad.demo.dto.EstudianteDTO;
import com.universidad.demo.repository.EstudianteRepository;
import com.universidad.demo.repository.entities.EstudianteEntity;
import com.universidad.demo.services.EstudianteService;

@Service
public class EstudianteServiceImpl implements EstudianteService{
    
    @Autowired
    private EstudianteRepository estudianteRepository;

    @Autowired
    private EstudianteDTOConverte convert;


    @Override
    @Transactional
    public List<EstudianteDTO> findAll() {
        List<EstudianteEntity> estudiantesEntity= (List<EstudianteEntity>) estudianteRepository.findAll();
        List<EstudianteDTO> estudiantesDTO=new ArrayList<>();       

           for(EstudianteEntity  estudiante  :estudiantesEntity){
                estudiantesDTO.add(convert.converEstudianteDTO(estudiante));
          }
          return estudiantesDTO;

        
       
    }

}
