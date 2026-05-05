DROP TABLE IF EXISTS matriculas;
DROP TABLE IF EXISTS alumnos;
DROP TABLE IF EXISTS cursos;

CREATE TABLE alumnos (
    id      VARCHAR(36) PRIMARY KEY,
    nombre  VARCHAR(255) NOT NULL
);

CREATE TABLE cursos (
    id      VARCHAR(36) PRIMARY KEY,
    nombre  VARCHAR(255) NOT NULL
);

CREATE TABLE matriculas (
    id         VARCHAR(36) PRIMARY KEY,
    nombre     VARCHAR(255) NOT NULL,
    curso_id   VARCHAR(36) NOT NULL,
    alumno_id  VARCHAR(36) NOT NULL,
    CONSTRAINT fk_matricula_curso
        FOREIGN KEY (curso_id) REFERENCES cursos(id),
    CONSTRAINT fk_matricula_alumno
        FOREIGN KEY (alumno_id) REFERENCES alumnos(id)
);
