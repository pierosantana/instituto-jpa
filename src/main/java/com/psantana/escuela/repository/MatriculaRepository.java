package com.psantana.escuela.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.psantana.escuela.entity.Matricula;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, String> {

}
