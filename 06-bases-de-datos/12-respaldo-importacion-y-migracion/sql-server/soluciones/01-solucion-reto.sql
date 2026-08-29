/* Solución de referencia: compárala después de intentar el reto. */
/* BACKUP DATABASE crea una copia recuperable administrada por SQL Server. */
-- Ajusta la ruta a un directorio permitido por tu instancia.
BACKUP DATABASE ChileteAprendizaje
TO DISK = 'C:\backup\ChileteAprendizaje.bak'
WITH INIT, CHECKSUM;
