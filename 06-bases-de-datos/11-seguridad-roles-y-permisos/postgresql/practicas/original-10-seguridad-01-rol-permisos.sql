-- Concepto: rol sin inicio de sesion y privilegio minimo sobre una vista.
DO $$
BEGIN
    IF NOT EXISTS (SELECT 1 FROM pg_roles WHERE rolname = 'rol_lectura_inventario') THEN
        CREATE ROLE rol_lectura_inventario NOLOGIN;
    END IF;
END;
$$;
GRANT USAGE ON SCHEMA aprendizaje TO rol_lectura_inventario;
GRANT SELECT ON aprendizaje.vw_inventario TO rol_lectura_inventario;
SET ROLE rol_lectura_inventario;
SELECT COUNT(*) AS productos_visibles FROM aprendizaje.vw_inventario;
RESET ROLE;
REVOKE SELECT ON aprendizaje.vw_inventario FROM rol_lectura_inventario;
REVOKE USAGE ON SCHEMA aprendizaje FROM rol_lectura_inventario;
DROP ROLE rol_lectura_inventario;
