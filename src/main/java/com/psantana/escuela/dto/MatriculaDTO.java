package com.psantana.escuela.dto;

public class MatriculaDTO {

    private String id;
    private String nombre;
    private String cursoId;
    private String alumnoId;

    public MatriculaDTO() {
    }

    public MatriculaDTO(String id, String nombre, String cursoId, String alumnoId) {
        this.id = id;
        this.nombre = nombre;
        this.cursoId = cursoId;
        this.alumnoId = alumnoId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCursoId() {
        return cursoId;
    }

    public void setCursoId(String cursoId) {
        this.cursoId = cursoId;
    }

    public String getAlumnoId() {
        return alumnoId;
    }

    public void setAlumnoId(String alumnoId) {
        this.alumnoId = alumnoId;
    }

}
