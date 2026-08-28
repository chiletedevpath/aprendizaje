/*
 * SQL Server - DML y consultas
 *
 * Prerrequisito: ejecutar 01-ddl-basico.sql.
 * Los datos son ficticios y reservados para esta práctica.
 */

USE EMPRESAVENTAS;
GO

INSERT INTO dbo.Clientes (ID_cliente, Nombre_cliente, Correo, Telefono)
VALUES
    (1, 'Cliente Uno', 'cliente.uno@example.test', '900000001'),
    (2, 'Cliente Dos', 'cliente.dos@example.test', '900000002'),
    (3, 'Cliente Tres', 'cliente.tres@example.test', '900000003'),
    (4, 'Cliente Cuatro', 'cliente.cuatro@example.test', NULL);
GO

INSERT INTO dbo.Pedidos (ID_pedido, ID_cliente, Estado)
VALUES
    (101, 1, 'Pendiente'),
    (102, 2, 'Enviado'),
    (103, 3, 'Pendiente'),
    (104, 2, 'Pendiente');
GO

INSERT INTO dbo.Items_pedido
    (ID_detalle, ID_pedido, Producto, Cantidad, Precio)
VALUES
    (1001, 101, 'Laptop de práctica', 1, 2500.00),
    (1002, 102, 'Mouse inalámbrico', 2, 75.50),
    (1003, 103, 'Impresora de demostración', 1, 1500.00),
    (1004, 104, 'Teclado inalámbrico', 2, 220.00);
GO

-- Lectura básica y filtros.
SELECT ID_cliente, Nombre_cliente, Correo, Telefono
FROM dbo.Clientes
ORDER BY ID_cliente;

SELECT ID_cliente, Nombre_cliente
FROM dbo.Clientes
WHERE Nombre_cliente LIKE 'Cliente T%';

SELECT ID_cliente, Nombre_cliente, Fecha_registro
FROM dbo.Clientes
WHERE Fecha_registro = CAST(GETDATE() AS DATE);
GO

-- Consulta relacional con total calculado.
SELECT
    pedido.ID_pedido,
    cliente.Nombre_cliente,
    pedido.Estado,
    SUM(item.Cantidad * item.Precio) AS total_pedido
FROM dbo.Pedidos AS pedido
INNER JOIN dbo.Clientes AS cliente
    ON cliente.ID_cliente = pedido.ID_cliente
INNER JOIN dbo.Items_pedido AS item
    ON item.ID_pedido = pedido.ID_pedido
GROUP BY pedido.ID_pedido, cliente.Nombre_cliente, pedido.Estado
ORDER BY pedido.ID_pedido;
GO

-- Actualización controlada y verificación.
UPDATE dbo.Clientes
SET Telefono = '900000020'
WHERE ID_cliente = 2;

UPDATE dbo.Pedidos
SET Estado = 'Entregado'
WHERE ID_pedido = 101;

SELECT ID_cliente, Nombre_cliente, Telefono
FROM dbo.Clientes
WHERE ID_cliente = 2;

SELECT ID_pedido, Estado
FROM dbo.Pedidos
WHERE ID_pedido = 101;
GO

-- Eliminación de un registro sin dependencias.
DELETE FROM dbo.Clientes
WHERE ID_cliente = 4;

SELECT ID_cliente, Nombre_cliente
FROM dbo.Clientes
ORDER BY ID_cliente;
GO

-- Demostración segura: la transacción se revierte.
BEGIN TRANSACTION;

DELETE FROM dbo.Items_pedido
WHERE ID_pedido = 103;

DELETE FROM dbo.Pedidos
WHERE ID_pedido = 103;

DELETE FROM dbo.Clientes
WHERE ID_cliente = 3;

SELECT ID_cliente, Nombre_cliente
FROM dbo.Clientes
ORDER BY ID_cliente;

ROLLBACK TRANSACTION;
GO
