package com.psantana.escuela.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.psantana.escuela.entity.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, String> {

}
