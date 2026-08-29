-- Concepto: INSERT repetible mediante ON CONFLICT.

INSERT INTO aprendizaje.categorias (nombre)
VALUES ('Escritura'), ('Organizacion'), ('Temporal')
ON CONFLICT (nombre) DO NOTHING;

INSERT INTO aprendizaje.productos
    (codigo, nombre, categoria_id, precio, stock)
SELECT 'ESC-001', 'Cuaderno de practica', id, 12.50, 20
FROM aprendizaje.categorias WHERE nombre = 'Escritura'
ON CONFLICT (codigo) DO UPDATE
SET nombre = EXCLUDED.nombre, categoria_id = EXCLUDED.categoria_id,
    precio = EXCLUDED.precio, stock = EXCLUDED.stock, activo = TRUE;

INSERT INTO aprendizaje.productos
    (codigo, nombre, categoria_id, precio, stock)
SELECT 'ORG-001', 'Archivador de evidencias', id, 18.90, 8
FROM aprendizaje.categorias WHERE nombre = 'Organizacion'
ON CONFLICT (codigo) DO UPDATE
SET nombre = EXCLUDED.nombre, categoria_id = EXCLUDED.categoria_id,
    precio = EXCLUDED.precio, stock = EXCLUDED.stock, activo = TRUE;

INSERT INTO aprendizaje.productos
    (codigo, nombre, categoria_id, precio, stock)
SELECT 'TMP-001', 'Producto temporal', id, 5.00, 1
FROM aprendizaje.categorias WHERE nombre = 'Temporal'
ON CONFLICT (codigo) DO UPDATE
SET nombre = EXCLUDED.nombre, categoria_id = EXCLUDED.categoria_id,
    precio = EXCLUDED.precio, stock = EXCLUDED.stock, activo = TRUE;

SELECT codigo, nombre, precio, stock
FROM aprendizaje.productos
ORDER BY codigo;
