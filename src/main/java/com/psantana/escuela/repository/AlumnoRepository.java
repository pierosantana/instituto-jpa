package com.psantana.escuela.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.psantana.escuela.entity.Alumno;
import com.psantana.escuela.entity.Matricula;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, String> {

    @Query("SELECT m FROM Matricula m WHERE m.alumno.id = :alumnoId")
    List<Matricula> findMatriculasByAlumnoId(String alumnoId);

}
