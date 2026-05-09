package com.psantana.escuela.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.psantana.escuela.entity.Alumno;
import com.psantana.escuela.repository.AlumnoRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AlumnoService {

    private final AlumnoRepository alumnoRepository;


    public void save(Alumno alumno){
        alumnoRepository.save(alumno);
    }

    public Alumno findById(String id){
        return alumnoRepository.findById(id).orElse(null);
    }

    public List<Alumno> getAll(){
        return alumnoRepository.findAll();
    }

    public void deleteById(String id){
        alumnoRepository.deleteById(id);
    }



}
