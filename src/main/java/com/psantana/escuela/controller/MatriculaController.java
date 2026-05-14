package com.psantana.escuela.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.psantana.escuela.entity.Matricula;
import com.psantana.escuela.service.MatriculaService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/matriculas")
@AllArgsConstructor
public class MatriculaController {

    private final MatriculaService matriculaService;
    
    @GetMapping
    public List<Matricula> getMatriculas() {
        return matriculaService.getAll();
    }

    @GetMapping("/{id}")
    public Matricula getMatricula(@PathVariable("id") String id) {
        return matriculaService.findById(id);
    }
    
    @PostMapping
    public void saveMatricula(@RequestBody Matricula matricula) {
        matriculaService.save(matricula);
    }

    @DeleteMapping("/{id}")
    public void deleteMatricula(@PathVariable("id") String id) {
        matriculaService.deleteById(id);
    }

}
