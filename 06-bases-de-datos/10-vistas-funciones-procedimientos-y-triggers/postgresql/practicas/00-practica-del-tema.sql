-- Práctica: adapta este script al reto del README usando solo datos ficticios.
-- La vista concentra una consulta reutilizable sin copiar datos.
CREATE OR REPLACE VIEW aprendizaje.vw_productos_disponibles AS
SELECT codigo, nombre, precio, stock
FROM aprendizaje.productos
WHERE stock > 0;

CREATE OR REPLACE FUNCTION aprendizaje.actualizar_stock(
    p_codigo VARCHAR,
    p_cantidad INTEGER
)
RETURNS VOID
LANGUAGE plpgsql
AS $$
BEGIN
    UPDATE aprendizaje.productos
    SET stock = stock + p_cantidad
    WHERE codigo = p_codigo
      AND stock + p_cantidad >= 0;

    IF NOT FOUND THEN
        RAISE EXCEPTION 'Producto inexistente o stock resultante inválido';
    END IF;
END;
$$;
