/* Práctica: adapta este script al reto del README usando solo datos ficticios. */
/* El índice compuesto favorece filtros que comienzan por categoria_id. */
CREATE INDEX ix_productos_categoria_precio
ON dbo.Productos(categoria_id, precio);
