package com.psantana.escuela.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.psantana.escuela.entity.Curso;
import com.psantana.escuela.repository.CursoRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CursoService{

    private final CursoRepository cursoRepository;
    

    public void save(Curso curso){
        cursoRepository.save(curso);
    }

    public List<Curso> getAll(){
        return cursoRepository.findAll();
    }

    public Curso findById(String id){
        return cursoRepository.findById(id).orElseThrow(() -> new RuntimeException("Curso no encontrado"));
    }

    public void deleteById(String id){
        cursoRepository.deleteById(id);
    }

    public Curso getReferenceById(String id) {
    return cursoRepository.getReferenceById(id);
}

}
