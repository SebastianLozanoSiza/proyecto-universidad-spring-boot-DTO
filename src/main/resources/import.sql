-- Inserts para la tabla universidad
INSERT INTO universidad (nombre) VALUES ('Universidad Nacional Autónoma de México');
INSERT INTO universidad (nombre) VALUES ('Universidad de Buenos Aires');
INSERT INTO universidad (nombre) VALUES ('Universidad de São Paulo');
INSERT INTO universidad (nombre) VALUES ('Universidad de Chile');
INSERT INTO universidad (nombre) VALUES ('Universidad de la República');
INSERT INTO universidad (nombre) VALUES ('Universidad de Costa Rica');
INSERT INTO universidad (nombre) VALUES ('Universidad Nacional de Colombia');
INSERT INTO universidad (nombre) VALUES ('Universidad Nacional de Córdoba');
INSERT INTO universidad (nombre) VALUES ('Universidad Central de Venezuela');
INSERT INTO universidad (nombre) VALUES ('Universidad Nacional Autónoma de Honduras');

-- Inserts para la tabla estudiantes
INSERT INTO estudiantes (nombre, universidad_id) VALUES ('María López', 1);
INSERT INTO estudiantes (nombre, universidad_id) VALUES ('Juan Pérez', 1);
INSERT INTO estudiantes (nombre, universidad_id) VALUES ('Carlos González', 2);
INSERT INTO estudiantes (nombre, universidad_id) VALUES ('Laura Martínez', 3);
INSERT INTO estudiantes (nombre, universidad_id) VALUES ('Pedro Sánchez', 4);
INSERT INTO estudiantes (nombre, universidad_id) VALUES ('Ana Díaz', 5);
INSERT INTO estudiantes (nombre, universidad_id) VALUES ('Miguel Rodríguez', 6);
INSERT INTO estudiantes (nombre, universidad_id) VALUES ('Sofía García', 7);
INSERT INTO estudiantes (nombre, universidad_id) VALUES ('Elena Hernández', 8);
INSERT INTO estudiantes (nombre, universidad_id) VALUES ('Javier Gómez', 9);

-- Inserts para la tabla matriculas
INSERT INTO matriculas (feed, estudainte_id) VALUES (100.0, 1);
INSERT INTO matriculas (feed, estudainte_id) VALUES (150.0, 2);
INSERT INTO matriculas (feed, estudainte_id) VALUES (200.0, 3);
INSERT INTO matriculas (feed, estudainte_id) VALUES (120.0, 4);
INSERT INTO matriculas (feed, estudainte_id) VALUES (180.0, 5);
INSERT INTO matriculas (feed, estudainte_id) VALUES (210.0, 6);
INSERT INTO matriculas (feed, estudainte_id) VALUES (130.0, 7);
INSERT INTO matriculas (feed, estudainte_id) VALUES (170.0, 8);
INSERT INTO matriculas (feed, estudainte_id) VALUES (190.0, 9);
INSERT INTO matriculas (feed, estudainte_id) VALUES (160.0, 10);
