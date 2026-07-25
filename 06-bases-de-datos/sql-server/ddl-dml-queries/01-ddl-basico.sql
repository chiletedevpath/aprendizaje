/*
 * SQL Server - preparación del entorno de práctica
 *
 * Ejecutar en SQL Server Management Studio con una instancia local.
 * El script crea EMPRESAVENTAS y reconstruye solamente sus tablas de práctica.
 * No debe ejecutarse sobre una base con información real.
 */

USE master;
GO

IF DB_ID(N'EMPRESAVENTAS') IS NULL
BEGIN
    CREATE DATABASE EMPRESAVENTAS;
END;
GO

USE EMPRESAVENTAS;
GO

DROP TABLE IF EXISTS dbo.Items_pedido;
DROP TABLE IF EXISTS dbo.Pedidos;
DROP TABLE IF EXISTS dbo.Clientes;
GO

CREATE TABLE dbo.Clientes (
    ID_cliente INT NOT NULL,
    Nombre_cliente VARCHAR(50) NOT NULL,
    Correo VARCHAR(100) NOT NULL,
    Telefono VARCHAR(20) NULL,
    Fecha_registro DATE NOT NULL
        CONSTRAINT DF_Clientes_FechaRegistro DEFAULT CAST(GETDATE() AS DATE),
    CONSTRAINT PK_Clientes PRIMARY KEY (ID_cliente),
    CONSTRAINT UQ_Clientes_Correo UNIQUE (Correo)
);
GO

CREATE TABLE dbo.Pedidos (
    ID_pedido INT NOT NULL,
    ID_cliente INT NOT NULL,
    Fecha DATETIME2(0) NOT NULL
        CONSTRAINT DF_Pedidos_Fecha DEFAULT SYSDATETIME(),
    Estado VARCHAR(20) NOT NULL
        CONSTRAINT DF_Pedidos_Estado DEFAULT 'Pendiente',
    CONSTRAINT PK_Pedidos PRIMARY KEY (ID_pedido),
    CONSTRAINT CK_Pedidos_Estado
        CHECK (Estado IN ('Pendiente', 'Enviado', 'Entregado')),
    CONSTRAINT FK_Pedidos_Clientes
        FOREIGN KEY (ID_cliente) REFERENCES dbo.Clientes(ID_cliente)
);
GO

CREATE TABLE dbo.Items_pedido (
    ID_detalle INT NOT NULL,
    ID_pedido INT NOT NULL,
    Producto VARCHAR(100) NOT NULL,
    Cantidad INT NOT NULL,
    Precio DECIMAL(10, 2) NOT NULL,
    CONSTRAINT PK_ItemsPedido PRIMARY KEY (ID_detalle),
    CONSTRAINT CK_ItemsPedido_Cantidad CHECK (Cantidad > 0),
    CONSTRAINT CK_ItemsPedido_Precio CHECK (Precio >= 0),
    CONSTRAINT FK_ItemsPedido_Pedidos
        FOREIGN KEY (ID_pedido) REFERENCES dbo.Pedidos(ID_pedido)
);
GO

SELECT
    tabla.name AS tabla,
    columna.name AS columna,
    tipo.name AS tipo,
    columna.max_length,
    columna.is_nullable
FROM sys.tables AS tabla
INNER JOIN sys.columns AS columna ON columna.object_id = tabla.object_id
INNER JOIN sys.types AS tipo ON tipo.user_type_id = columna.user_type_id
WHERE tabla.name IN ('Clientes', 'Pedidos', 'Items_pedido')
ORDER BY tabla.name, columna.column_id;
GO
