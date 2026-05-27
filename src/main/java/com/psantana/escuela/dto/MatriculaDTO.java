package com.psantana.escuela.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MatriculaDTO {

    private String id;
    private String nombre;
    private String cursoId;
    private String alumnoId;

    

    public MatriculaDTO(String nombre, String cursoId, String alumnoId) {
        this.nombre = nombre;
        this.cursoId = cursoId;
        this.alumnoId = alumnoId;
    }



    public MatriculaDTO(String id, String nombre, String cursoId, String alumnoId) {
        this.id = id;
        this.nombre = nombre;
        this.cursoId = cursoId;
        this.alumnoId = alumnoId;
    }

}
