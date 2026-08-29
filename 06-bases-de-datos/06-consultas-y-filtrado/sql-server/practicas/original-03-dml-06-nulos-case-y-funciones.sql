/* Conceptos: NULL, CASE y funciones comunes de texto, fecha y numeros. */
USE EMPRESAVENTAS;
GO
SELECT ID_cliente,
       UPPER(Nombre_cliente) AS nombre_mayusculas,
       COALESCE(Telefono, 'Sin telefono') AS telefono,
       DATEDIFF(DAY, Fecha_registro, CAST(GETDATE() AS DATE)) AS dias_registrado,
       CASE WHEN Telefono IS NULL THEN 'Incompleto' ELSE 'Completo' END AS estado_contacto
FROM dbo.Clientes
ORDER BY ID_cliente;
GO
