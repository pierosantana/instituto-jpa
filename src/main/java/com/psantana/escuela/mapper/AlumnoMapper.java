package com.psantana.escuela.mapper;

import org.springframework.stereotype.Component;

import com.psantana.escuela.dto.AlumnoDTO;
import com.psantana.escuela.entity.Alumno;

@Component
public class AlumnoMapper {

    public AlumnoDTO toDTO(Alumno alumno) {
        return new AlumnoDTO(alumno.getId(), alumno.getNombre());
    }

    public Alumno toEntity(AlumnoDTO alumnoDTO) {
        Alumno alumno = new Alumno();
        alumno.setNombre(alumnoDTO.nombre());
        return alumno;
    }

}
