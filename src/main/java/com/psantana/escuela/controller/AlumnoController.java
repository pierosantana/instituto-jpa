package com.psantana.escuela.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.*;

import com.psantana.escuela.entity.Alumno;
import com.psantana.escuela.service.AlumnoService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/alumnos")
@AllArgsConstructor
public class AlumnoController {

    private final AlumnoService alumnoService;


    @GetMapping
    public List<Alumno> getAlumnos() {
        return alumnoService.getAll();
    }

    @PostMapping
    public void saveAlumno(@RequestBody Alumno alumno) {
        alumnoService.save(alumno);
    }

    @GetMapping("/{id}")
    public Alumno getAlumno(@PathVariable String id) {
        return alumnoService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteAlumno(@PathVariable String id) {
        alumnoService.deleteById(id);
    }

}
