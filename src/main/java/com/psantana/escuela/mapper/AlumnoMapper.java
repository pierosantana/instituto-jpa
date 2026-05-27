package com.psantana.escuela.mapper;

import org.springframework.stereotype.Component;

import com.psantana.escuela.dto.AlumnoDTO;
import com.psantana.escuela.entity.Alumno;

@Component
public class AlumnoMapper {

    public AlumnoDTO toDTO(Alumno alumno) {
        AlumnoDTO alumnoDTO = new AlumnoDTO();
        alumnoDTO.setId(alumno.getId());
        alumnoDTO.setNombre(alumno.getNombre());
        return alumnoDTO;
    }

	public Alumno toEntity(AlumnoDTO alumnoDTO) {
		Alumno alumno = new Alumno();
		alumno.setNombre(alumnoDTO.getNombre());
		return alumno;
	}

}
