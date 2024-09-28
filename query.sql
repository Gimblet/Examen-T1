CREATE DATABASE BD1_VILLENA;
USE BD1_VILLENA;

CREATE TABLE cliente(
	id_cliente INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    direccion VARCHAR(150) NOT NULL
);

INSERT INTO cliente (nombre, direccion) VALUES 
('Diego', 'Calle los jacintos 123, Los Olivos'),
('Adrian', 'Calle los proceres S/N, Surquillo'),
('Valeska', 'Av naranjal 240, Los Olivos');

CREATE TABLE productos(
	id_prod INT PRIMARY KEY AUTO_INCREMENT,
    nom_prod VARCHAR(50) NOT NULL,
    precio INT NOT NULL,
    stock_actual INT NOT NULL
);

INSERT INTO productos (nom_prod, precio, stock_actual) VALUES 
('Gelatina', 25, 100),
('Yogurt', 39, 80),
('Stevia', 10, 5);

CREATE TABLE factura(
	nro_factura INT PRIMARY KEY AUTO_INCREMENT,
    fecha DATE NOT NULL,
    iestado VARCHAR(10) NOT NULL,
    d_cliente INT NOT NULL REFERENCES cliente(id_cliente),
    total INT NOT NULL
);

CREATE TABLE detallefact (
	nro_factura INT REFERENCES factura(nro_factura),
    id_prod INT REFERENCES productos(id_prod),
    cantidad INT NOT NULL,
    PRIMARY KEY(nro_factura, id_prod)
);