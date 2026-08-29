-- Concepto: relacion muchos a muchos mediante una tabla puente.
CREATE TABLE IF NOT EXISTS aprendizaje.etiquetas (
    id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    nombre VARCHAR(50) UNIQUE NOT NULL
);
CREATE TABLE IF NOT EXISTS aprendizaje.productos_etiquetas (
    producto_id BIGINT NOT NULL REFERENCES aprendizaje.productos(id) ON DELETE CASCADE,
    etiqueta_id BIGINT NOT NULL REFERENCES aprendizaje.etiquetas(id) ON DELETE CASCADE,
    PRIMARY KEY (producto_id, etiqueta_id)
);
INSERT INTO aprendizaje.etiquetas(nombre) VALUES ('Practica'), ('Evidencia')
ON CONFLICT(nombre) DO NOTHING;
INSERT INTO aprendizaje.productos_etiquetas(producto_id, etiqueta_id)
SELECT producto.id, etiqueta.id
FROM aprendizaje.productos AS producto CROSS JOIN aprendizaje.etiquetas AS etiqueta
WHERE producto.codigo='ESC-001' AND etiqueta.nombre='Practica'
ON CONFLICT DO NOTHING;
SELECT producto.codigo, etiqueta.nombre
FROM aprendizaje.productos_etiquetas puente
JOIN aprendizaje.productos producto ON producto.id=puente.producto_id
JOIN aprendizaje.etiquetas etiqueta ON etiqueta.id=puente.etiqueta_id;
