-- Concepto: trigger de auditoria posterior a UPDATE.
CREATE TABLE IF NOT EXISTS aprendizaje.auditoria_productos (
    id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    producto_id BIGINT NOT NULL,
    stock_anterior INTEGER NOT NULL,
    stock_nuevo INTEGER NOT NULL,
    cambiado_en TIMESTAMPTZ NOT NULL DEFAULT CURRENT_TIMESTAMP
);
CREATE OR REPLACE FUNCTION aprendizaje.auditar_stock()
RETURNS trigger LANGUAGE plpgsql AS $$
BEGIN
    IF NEW.stock IS DISTINCT FROM OLD.stock THEN
        INSERT INTO aprendizaje.auditoria_productos(producto_id, stock_anterior, stock_nuevo)
        VALUES (NEW.id, OLD.stock, NEW.stock);
    END IF;
    RETURN NEW;
END;
$$;
DROP TRIGGER IF EXISTS tr_productos_auditoria ON aprendizaje.productos;
CREATE TRIGGER tr_productos_auditoria AFTER UPDATE OF stock ON aprendizaje.productos
FOR EACH ROW EXECUTE FUNCTION aprendizaje.auditar_stock();
BEGIN;
UPDATE aprendizaje.productos SET stock = stock - 1 WHERE codigo='ESC-001';
SELECT producto_id, stock_anterior, stock_nuevo FROM aprendizaje.auditoria_productos ORDER BY id DESC LIMIT 1;
ROLLBACK;
