package com.psantana.escuela.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.*;

import com.psantana.escuela.dto.AlumnoDTO;
import com.psantana.escuela.dto.MatriculaDTO;
import com.psantana.escuela.entity.Alumno;
import com.psantana.escuela.mapper.AlumnoMapper;
import com.psantana.escuela.mapper.MatriculaMapper;
import com.psantana.escuela.service.EscuelaService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/alumnos")
@AllArgsConstructor
public class AlumnoController {

    private final EscuelaService escuelaService;
    private final AlumnoMapper alumnoMapper;
    private final MatriculaMapper matriculaMapper;


    @GetMapping
    public List<AlumnoDTO> getAlumnos() {
        return escuelaService.getAllAlumnos().stream()
        .map(alumnoMapper::toDTO)
        .toList();
    }

    @PostMapping
    public void saveAlumno(@RequestBody AlumnoDTO alumnoDTO) {
        escuelaService.saveAlumno(alumnoMapper.toEntity(alumnoDTO));
    }

    @GetMapping("/{id}/matriculas")
    public List<MatriculaDTO> getMatriculasByAlumno(@PathVariable("id") String id) {
        return escuelaService.getMatriculasByAlumnoId(id).stream()
            .map(matriculaMapper::toDTO)
            .toList();
    }

    @GetMapping("/{id}")
    public AlumnoDTO getAlumno(@PathVariable("id") String id) {
        return alumnoMapper.toDTO(escuelaService.findAlumnoById(id));
    }

    @DeleteMapping("/{id}")
    public void deleteAlumno(@PathVariable("id") String id) {
        escuelaService.deleteAlumnoById(id);
    }

}
