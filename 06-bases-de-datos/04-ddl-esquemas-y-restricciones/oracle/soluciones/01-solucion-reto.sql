-- Solución de referencia: compárala después de intentar el reto.
-- DDL básico en Oracle Database.

CREATE TABLE categorias (
    id NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    nombre VARCHAR2(80) NOT NULL UNIQUE
);

CREATE TABLE productos (
    id NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    codigo VARCHAR2(20) NOT NULL UNIQUE,
    nombre VARCHAR2(120) NOT NULL,
    categoria_id NUMBER NOT NULL,
    precio NUMBER(10,2) NOT NULL CHECK (precio >= 0),
    stock NUMBER DEFAULT 0 NOT NULL CHECK (stock >= 0),
    activo NUMBER(1) DEFAULT 1 NOT NULL CHECK (activo IN (0, 1)),
    CONSTRAINT fk_productos_categorias FOREIGN KEY (categoria_id) REFERENCES categorias(id)
);
