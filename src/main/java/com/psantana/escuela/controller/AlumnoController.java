package com.psantana.escuela.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.*;

import com.psantana.escuela.dto.AlumnoDTO;
import com.psantana.escuela.entity.Alumno;
import com.psantana.escuela.mapper.AlumnoMapper;
import com.psantana.escuela.service.AlumnoService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/alumnos")
@AllArgsConstructor
public class AlumnoController {

    private final AlumnoService alumnoService;
    private final AlumnoMapper alumnoMapper;


    @GetMapping
    public List<AlumnoDTO> getAlumnos() {
        return alumnoService.getAll().stream()
        .map(alumnoMapper::toDTO)
        .toList();
    }

    @PostMapping
    public void saveAlumno(@RequestBody AlumnoDTO alumnoDTO) {
        alumnoService.save(alumnoMapper.toEntity(alumnoDTO));
    }

    @GetMapping("/{id}")
    public AlumnoDTO getAlumno(@PathVariable("id") String id) {
        return alumnoMapper.toDTO(alumnoService.findById(id));
    }

    @DeleteMapping("/{id}")
    public void deleteAlumno(@PathVariable("id") String id) {
        alumnoService.deleteById(id);
    }

}
