package com.psantana.escuela.mapper;

import org.springframework.stereotype.Component;

import com.psantana.escuela.dto.MatriculaDTO;
import com.psantana.escuela.entity.Matricula;
import com.psantana.escuela.service.AlumnoService;
import com.psantana.escuela.service.CursoService;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class MatriculaMapper {

    private final CursoService cursoService;
    private final AlumnoService alumnoService;

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
        matricula.setNombre(matriculaDTO.getNombre());

        matricula.setCurso(cursoService.getReferenceById(matriculaDTO.getCursoId()));
        matricula.setAlumno(alumnoService.getReferenceById(matriculaDTO.getAlumnoId()));

        return matricula;
    }

}
