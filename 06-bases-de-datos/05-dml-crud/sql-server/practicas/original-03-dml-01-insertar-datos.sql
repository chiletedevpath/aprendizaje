/* Concepto: insertar filas. Prerrequisito: 02-ddl/01-crear-tablas.sql. */

USE EMPRESAVENTAS;
GO

IF NOT EXISTS (SELECT 1 FROM dbo.Clientes WHERE ID_cliente = 1)
    INSERT INTO dbo.Clientes (ID_cliente, Nombre_cliente, Correo, Telefono)
    VALUES (1, 'Cliente Uno', 'cliente.uno@example.test', '900000001');
IF NOT EXISTS (SELECT 1 FROM dbo.Clientes WHERE ID_cliente = 2)
    INSERT INTO dbo.Clientes (ID_cliente, Nombre_cliente, Correo, Telefono)
    VALUES (2, 'Cliente Dos', 'cliente.dos@example.test', '900000002');
IF NOT EXISTS (SELECT 1 FROM dbo.Clientes WHERE ID_cliente = 3)
    INSERT INTO dbo.Clientes (ID_cliente, Nombre_cliente, Correo, Telefono)
    VALUES (3, 'Cliente Tres', 'cliente.tres@example.test', '900000003');
IF NOT EXISTS (SELECT 1 FROM dbo.Clientes WHERE ID_cliente = 4)
    INSERT INTO dbo.Clientes (ID_cliente, Nombre_cliente, Correo, Telefono)
    VALUES (4, 'Cliente Cuatro', 'cliente.cuatro@example.test', NULL);
GO

IF NOT EXISTS (SELECT 1 FROM dbo.Pedidos WHERE ID_pedido = 101)
    INSERT INTO dbo.Pedidos (ID_pedido, ID_cliente, Estado) VALUES (101, 1, 'Pendiente');
IF NOT EXISTS (SELECT 1 FROM dbo.Pedidos WHERE ID_pedido = 102)
    INSERT INTO dbo.Pedidos (ID_pedido, ID_cliente, Estado) VALUES (102, 2, 'Enviado');
IF NOT EXISTS (SELECT 1 FROM dbo.Pedidos WHERE ID_pedido = 103)
    INSERT INTO dbo.Pedidos (ID_pedido, ID_cliente, Estado) VALUES (103, 3, 'Pendiente');
IF NOT EXISTS (SELECT 1 FROM dbo.Pedidos WHERE ID_pedido = 104)
    INSERT INTO dbo.Pedidos (ID_pedido, ID_cliente, Estado) VALUES (104, 2, 'Pendiente');
GO

IF NOT EXISTS (SELECT 1 FROM dbo.Items_pedido WHERE ID_detalle = 1001)
    INSERT INTO dbo.Items_pedido (ID_detalle, ID_pedido, Producto, Cantidad, Precio)
    VALUES (1001, 101, 'Laptop de practica', 1, 2500.00);
IF NOT EXISTS (SELECT 1 FROM dbo.Items_pedido WHERE ID_detalle = 1002)
    INSERT INTO dbo.Items_pedido (ID_detalle, ID_pedido, Producto, Cantidad, Precio)
    VALUES (1002, 102, 'Mouse inalambrico', 2, 75.50);
IF NOT EXISTS (SELECT 1 FROM dbo.Items_pedido WHERE ID_detalle = 1003)
    INSERT INTO dbo.Items_pedido (ID_detalle, ID_pedido, Producto, Cantidad, Precio)
    VALUES (1003, 103, 'Impresora de demostracion', 1, 1500.00);
IF NOT EXISTS (SELECT 1 FROM dbo.Items_pedido WHERE ID_detalle = 1004)
    INSERT INTO dbo.Items_pedido (ID_detalle, ID_pedido, Producto, Cantidad, Precio)
    VALUES (1004, 104, 'Teclado inalambrico', 2, 220.00);
GO

SELECT @@ROWCOUNT AS filas_afectadas_ultimo_insert;
GO
