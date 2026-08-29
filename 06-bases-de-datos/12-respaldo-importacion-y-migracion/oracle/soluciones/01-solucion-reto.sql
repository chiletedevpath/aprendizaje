-- Solución de referencia: compárala después de intentar el reto.
-- Data Pump se ejecuta con herramientas del sistema, no como SQL convencional.
-- expdp usuario/clave DIRECTORY=DATA_PUMP_DIR DUMPFILE=chilete.dmp SCHEMAS=USUARIO
-- impdp usuario/clave DIRECTORY=DATA_PUMP_DIR DUMPFILE=chilete.dmp REMAP_SCHEMA=USUARIO:USUARIO_RESTAURADO

SELECT COUNT(*) AS productos FROM productos;
