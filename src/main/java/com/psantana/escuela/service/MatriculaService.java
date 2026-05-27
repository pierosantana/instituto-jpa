package com.psantana.escuela.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.psantana.escuela.entity.Matricula;
import com.psantana.escuela.repository.MatriculaRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MatriculaService {

    private final MatriculaRepository matriculaRepository;


    public void save(Matricula matricula){
        matriculaRepository.save(matricula);
    }

    public Matricula findById(String id){
        return matriculaRepository.findById(id).orElseThrow(() -> new RuntimeException("Matrícula no encontrada"));
    }

    public List<Matricula> getAll(){
        return matriculaRepository.findAll();
    }

    public void deleteById(String id){
        matriculaRepository.deleteById(id);
    }

}
