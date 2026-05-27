package com.psantana.escuela.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.psantana.escuela.dto.CursoDTO;
import com.psantana.escuela.entity.Curso;
import com.psantana.escuela.mapper.CursoMapper;
import com.psantana.escuela.service.CursoService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/cursos")
@AllArgsConstructor
public class CursoController {

    private final CursoService cursoService;
    private final CursoMapper cursoMapper;

    @GetMapping
    public List<CursoDTO> getCursos() {
        return cursoService.getAll().stream()
                .map(cursoMapper::toDTO)
                .toList();
    }

    @GetMapping("/{id}")
    public CursoDTO getCurso(@PathVariable("id") String id) {
        return cursoMapper.toDTO(cursoService.findById(id));
    }

    @PostMapping
    public void saveCurso(@RequestBody CursoDTO cursoDTO) {
        cursoService.save(cursoMapper.toEntity(cursoDTO));
    }

    @DeleteMapping("/{id}")
    public void deleteCurso(@PathVariable("id") String id) {
        cursoService.deleteById(id);
    }

}
