package com.universidad.demo.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.universidad.demo.config.MatriculaDTOConverte;
import com.universidad.demo.dto.MatriculaDTO;
import com.universidad.demo.repository.EstudianteRepository;
import com.universidad.demo.repository.MatriculaRepository;
import com.universidad.demo.repository.entities.EstudianteEntity;
import com.universidad.demo.repository.entities.MatriculaEntity;
import com.universidad.demo.services.MatriculaService;

@Service
public class MatriculaServiceImpl implements MatriculaService{

    @Autowired
    private MatriculaRepository matriculaRepository;

    @Autowired
    private EstudianteRepository estudianteRepository;

    @Autowired
    private MatriculaDTOConverte convert;

    @Override
    @Transactional
    public MatriculaDTO save(MatriculaDTO matricula) {
        
        Optional<EstudianteEntity> estudianteOpcional = estudianteRepository.findById(matricula.getEstudianteId());

        if (estudianteOpcional.isPresent()) {

            MatriculaEntity matriculaEntity = convert.convertMatriculaEntity(matricula);
            matriculaEntity.setEstudiante(estudianteOpcional.get());
            matriculaRepository.save(matriculaEntity);
            return convert.converMatriculaDTO(matriculaEntity);
        }

        return null;
    }

    @Override
    @Transactional(readOnly= true)
    public List<MatriculaDTO> findAll() {

        List<MatriculaEntity> matriculaEntities = (List<MatriculaEntity>) matriculaRepository.findAll();
        return matriculaEntities.stream()
                                .map(matricula -> convert.converMatriculaDTO(matricula))
                                .toList();

    }
    
}
