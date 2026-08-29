-- Solución de referencia: compárala después de intentar el reto.
-- La vista concentra una consulta reutilizable sin copiar datos.
CREATE OR REPLACE VIEW vw_productos_disponibles AS
SELECT codigo, nombre, precio, stock
FROM productos
WHERE stock > 0;

CREATE OR REPLACE PROCEDURE actualizar_stock(
    p_codigo IN VARCHAR2,
    p_cantidad IN NUMBER
)
AS
BEGIN
    UPDATE productos
    SET stock = stock + p_cantidad
    WHERE codigo = p_codigo
      AND stock + p_cantidad >= 0;

    IF SQL%ROWCOUNT = 0 THEN
        RAISE_APPLICATION_ERROR(-20002, 'Producto inexistente o stock resultante inválido');
    END IF;
END;
/
