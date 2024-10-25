CREATE DATABASE clientes_postventa_db;

USE clientes_postventa_db;

CREATE TABLE cliente (
    id VARCHAR(36) PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL
);

CREATE TABLE mantenimiento (
    id VARCHAR(36) PRIMARY KEY,
    cliente_id VARCHAR(36) NOT NULL,
    tipo_servicio VARCHAR(50) NOT NULL,
    fecha DATE NOT NULL,
    FOREIGN KEY (cliente_id) REFERENCES cliente(id) ON DELETE CASCADE
);

INSERT INTO cliente (id, nombre) VALUES
('c1', 'Juan Pérez'),
('c2', 'María López'),
('c3', 'Carlos Sánchez');

