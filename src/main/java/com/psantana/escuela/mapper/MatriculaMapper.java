package com.psantana.escuela.mapper;

import org.springframework.stereotype.Component;

import com.psantana.escuela.dto.MatriculaDTO;
import com.psantana.escuela.entity.Matricula;
import com.psantana.escuela.service.EscuelaService;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class MatriculaMapper {

    private final EscuelaService escuelaService;

    public MatriculaDTO toDTO(Matricula matricula) {
        return new MatriculaDTO(
            matricula.getId(),
            matricula.getNombre(),
            matricula.getCurso() != null ? matricula.getCurso().getId() : null,
            matricula.getAlumno() != null ? matricula.getAlumno().getId() : null
        );
    }

    public Matricula toEntity(MatriculaDTO matriculaDTO) {
        Matricula matricula = new Matricula();
        matricula.setNombre(matriculaDTO.nombre());

        matricula.setCurso(escuelaService.getCursoReferenceById(matriculaDTO.cursoId()));
        matricula.setAlumno(escuelaService.getAlumnoReferenceById(matriculaDTO.alumnoId()));

        return matricula;
    }

}
