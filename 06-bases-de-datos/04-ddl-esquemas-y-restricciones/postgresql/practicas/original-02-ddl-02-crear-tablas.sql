-- Concepto: crear tablas relacionadas y restricciones de integridad.

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

SELECT table_name
FROM information_schema.tables
WHERE table_schema = 'aprendizaje'
  AND table_type = 'BASE TABLE'
ORDER BY table_name;
