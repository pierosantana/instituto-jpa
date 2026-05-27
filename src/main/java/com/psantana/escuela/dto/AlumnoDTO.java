package com.psantana.escuela.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AlumnoDTO {

    private String id;
    private String nombre;

    public AlumnoDTO(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

}

