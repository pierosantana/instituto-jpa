package com.psantana.escuela.mapper;

import org.springframework.stereotype.Component;

import com.psantana.escuela.dto.CursoDTO;
import com.psantana.escuela.entity.Curso;

@Component
public class CursoMapper {

    public CursoDTO toDTO(Curso curso) {
        CursoDTO cursoDTO = new CursoDTO();
        cursoDTO.setId(curso.getId());
        cursoDTO.setNombre(curso.getNombre());
        return cursoDTO;
    }

    public Curso toEntity(CursoDTO cursoDTO) {
        Curso curso = new Curso();
        curso.setNombre(cursoDTO.getNombre());
        return curso;
    }


}
