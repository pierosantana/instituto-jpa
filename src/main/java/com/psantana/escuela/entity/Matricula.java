package com.psantana.escuela.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "matriculas")
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @EqualsAndHashCode.Include
    @ToString.Include
    private String id;

    @ToString.Include
    private String nombre;

    //hace refeerenca a la columna de la tabla matricula en ambos casos
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "curso_id")
  
    private Curso curso;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "alumno_id")
    
    private Alumno alumno;

    //metodos del negocio una matricula puede incluir alumno
    public void addAlumno(Alumno alumno) {
        this.alumno = alumno;
        if (alumno != null && !alumno.getMatriculas().contains(this)) {
            alumno.getMatriculas().add(this);
        }
    }

    public void removeAlumno() {
        if (this.alumno != null) {
            this.alumno.getMatriculas().remove(this);
            this.alumno = null;
        }
    }

}