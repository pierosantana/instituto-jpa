package com.psantana.escuela.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.psantana.escuela.dto.MatriculaDTO;
import com.psantana.escuela.entity.Matricula;
import com.psantana.escuela.mapper.MatriculaMapper;
import com.psantana.escuela.service.EscuelaService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/matriculas")
@AllArgsConstructor
public class MatriculaController {

    private final EscuelaService escuelaService;
    private final MatriculaMapper matriculaMapper;
    
    @GetMapping
    public List<MatriculaDTO> getMatriculas() {
        return escuelaService.getAllMatriculas().stream()
            .map(matriculaMapper::toDTO)
            .toList();
    }

    @GetMapping("/{id}")
    public ResponseEntity<MatriculaDTO> getMatricula(@PathVariable("id") String id) {
        Matricula matricula = escuelaService.findMatriculaById(id);
        if (matricula == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(matriculaMapper.toDTO(matricula));
    }

    @PostMapping
    public ResponseEntity<Void> saveMatricula(@RequestBody MatriculaDTO matriculaDTO) {
        escuelaService.saveMatricula(matriculaMapper.toEntity(matriculaDTO));
        return ResponseEntity.status(201).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMatricula(@PathVariable("id") String id) {
        escuelaService.deleteMatriculaById(id);
        return ResponseEntity.noContent().build();
    }

}
