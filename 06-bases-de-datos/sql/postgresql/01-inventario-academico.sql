-- Laboratorio inicial de PostgreSQL
-- Contexto: inventario ficticio para practicar integridad, consultas y transacciones.
-- Ejecucion: psql -U USUARIO -d BASE_PRACTICA -f 01-inventario-academico.sql

BEGIN;

CREATE SCHEMA IF NOT EXISTS aprendizaje;

CREATE TABLE IF NOT EXISTS aprendizaje.categorias (
    id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    nombre VARCHAR(80) NOT NULL UNIQUE
);

CREATE TABLE IF NOT EXISTS aprendizaje.productos (
    id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    codigo VARCHAR(20) NOT NULL UNIQUE,
    nombre VARCHAR(120) NOT NULL,
    categoria_id BIGINT NOT NULL REFERENCES aprendizaje.categorias(id),
    precio NUMERIC(10, 2) NOT NULL CHECK (precio >= 0),
    stock INTEGER NOT NULL DEFAULT 0 CHECK (stock >= 0),
    activo BOOLEAN NOT NULL DEFAULT TRUE,
    creado_en TIMESTAMPTZ NOT NULL DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO aprendizaje.categorias (nombre)
VALUES ('Escritura'), ('Organizacion')
ON CONFLICT (nombre) DO NOTHING;

INSERT INTO aprendizaje.productos (codigo, nombre, categoria_id, precio, stock)
SELECT 'ESC-001', 'Cuaderno de practica', id, 12.50, 20
FROM aprendizaje.categorias
WHERE nombre = 'Escritura'
ON CONFLICT (codigo) DO UPDATE
SET nombre = EXCLUDED.nombre,
    categoria_id = EXCLUDED.categoria_id,
    precio = EXCLUDED.precio,
    stock = EXCLUDED.stock,
    activo = TRUE;

INSERT INTO aprendizaje.productos (codigo, nombre, categoria_id, precio, stock)
SELECT 'ORG-001', 'Archivador de evidencias', id, 18.90, 8
FROM aprendizaje.categorias
WHERE nombre = 'Organizacion'
ON CONFLICT (codigo) DO UPDATE
SET nombre = EXCLUDED.nombre,
    categoria_id = EXCLUDED.categoria_id,
    precio = EXCLUDED.precio,
    stock = EXCLUDED.stock,
    activo = TRUE;

CREATE INDEX IF NOT EXISTS idx_productos_categoria
    ON aprendizaje.productos (categoria_id);

CREATE OR REPLACE VIEW aprendizaje.vw_inventario AS
SELECT
    p.codigo,
    p.nombre AS producto,
    c.nombre AS categoria,
    p.precio,
    p.stock,
    p.precio * p.stock AS valor_inventario
FROM aprendizaje.productos p
JOIN aprendizaje.categorias c ON c.id = p.categoria_id
WHERE p.activo;

COMMIT;

-- Consultas de comprobacion
SELECT *
FROM aprendizaje.vw_inventario
ORDER BY categoria, producto;

SELECT
    categoria,
    COUNT(*) AS productos,
    SUM(stock) AS unidades,
    SUM(valor_inventario) AS valor_total
FROM aprendizaje.vw_inventario
GROUP BY categoria
ORDER BY categoria;
