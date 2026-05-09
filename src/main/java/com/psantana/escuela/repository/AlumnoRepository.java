package com.psantana.escuela.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.psantana.escuela.entity.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, String> {

}
