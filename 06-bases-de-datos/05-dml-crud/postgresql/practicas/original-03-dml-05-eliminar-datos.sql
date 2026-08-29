-- Concepto: DELETE con RETURNING sobre datos creados para la demostracion.

DELETE FROM aprendizaje.productos
WHERE codigo = 'TMP-001'
RETURNING codigo, nombre;

DELETE FROM aprendizaje.categorias
WHERE nombre = 'Temporal'
  AND NOT EXISTS (
      SELECT 1 FROM aprendizaje.productos
      WHERE categoria_id = aprendizaje.categorias.id
  )
RETURNING id, nombre;
