-- ALUMNOS
INSERT INTO alumnos (id, nombre) VALUES
  ('ALU-1', 'Juan Pérez'),
  ('ALU-2', 'María López'),
  ('ALU-3', 'Carlos Sánchez');

-- CURSOS
INSERT INTO cursos (id, nombre) VALUES
  ('CUR-1', 'Matemáticas'),
  ('CUR-2', 'Historia'),
  ('CUR-3', 'Programación');

-- MATRICULAS
INSERT INTO matriculas (id, nombre, curso_id, alumno_id) VALUES
  ('MAT-1', 'Matrícula Juan en Matemáticas',    'CUR-1', 'ALU-1'),
  ('MAT-2', 'Matrícula María en Historia',      'CUR-2', 'ALU-2'),
  ('MAT-3', 'Matrícula Carlos en Programación', 'CUR-3', 'ALU-3');

