package com.psantana.escuela.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.psantana.escuela.entity.Alumno;
import com.psantana.escuela.entity.Curso;
import com.psantana.escuela.entity.Matricula;
import com.psantana.escuela.repository.AlumnoRepository;
import com.psantana.escuela.repository.CursoRepository;
import com.psantana.escuela.repository.MatriculaRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EscuelaService {

    private final AlumnoRepository alumnoRepository;
    private final MatriculaRepository matriculaRepository;
    private final CursoRepository cursoRepository;

    // ============ MÉTODOS ALUMNO ============

    public void saveAlumno(Alumno alumno) {
        alumnoRepository.save(alumno);
    }

    public Alumno findAlumnoById(String id) {
        return alumnoRepository.findById(id).orElseThrow(() -> new RuntimeException("Alumno no encontrado"));
    }

    public List<Alumno> getAllAlumnos() {
        return alumnoRepository.findAll();
    }

    public void deleteAlumnoById(String id) {
        alumnoRepository.deleteById(id);
    }

    public Alumno getAlumnoReferenceById(String id) {
        return alumnoRepository.getReferenceById(id);
    }

    public List<Matricula> getMatriculasByAlumnoId(String alumnoId) {
        return alumnoRepository.findMatriculasByAlumnoId(alumnoId);
    }

    // ============ MÉTODOS MATRICULA ============

    public void saveMatricula(Matricula matricula) {
        matriculaRepository.save(matricula);
    }

    public Matricula findMatriculaById(String id) {
        return matriculaRepository.findById(id).orElseThrow(() -> new RuntimeException("Matrícula no encontrada"));
    }

    public List<Matricula> getAllMatriculas() {
        return matriculaRepository.findAll();
    }

    public void deleteMatriculaById(String id) {
        matriculaRepository.deleteById(id);
    }

    // ============ MÉTODOS CURSO ============

    public Curso getCursoReferenceById(String id) {
        return cursoRepository.getReferenceById(id);
    }

}
