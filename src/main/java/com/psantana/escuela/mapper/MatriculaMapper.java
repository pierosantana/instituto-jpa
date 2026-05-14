package com.psantana.escuela.mapper;

import org.springframework.stereotype.Component;

import com.psantana.escuela.dto.MatriculaDTO;
import com.psantana.escuela.entity.Matricula;

@Component
public class MatriculaMapper {

    public MatriculaDTO toDTO(Matricula matricula) {
        return new MatriculaDTO(
            matricula.getId(),
            matricula.getNombre(),
            matricula.getCurso() != null ? matricula.getCurso().getId() : null,
            matricula.getAlumno() != null ? matricula.getAlumno().getId() : null
        );
    }

}
