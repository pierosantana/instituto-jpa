package com.psantana.escuela.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.psantana.escuela.entity.Curso;
import com.psantana.escuela.service.CursoService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class CursoController {

    private final CursoService cursoService;

    @GetMapping("/cursos")
    public List<Curso> getCursos() {
        return cursoService.getAll();
    }

    @GetMapping("/cursos/{id}")
    public Curso getCursoById(@PathVariable("id") String id) {
        return cursoService.findById(id);
    
    }

    @PostMapping("/cursos")
    public void saveCurso(@RequestBody Curso curso) {
        cursoService.save(curso);
    }

    @DeleteMapping("/cursos/{id}")
    public void deleteCurso(@PathVariable("id") String id) {
        cursoService.deleteById(id);
    }

}
