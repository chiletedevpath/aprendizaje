/*
 * Concepto: crear tablas y aplicar restricciones de integridad.
 * Prerrequisito: 01-entorno/01-crear-base-datos.sql.
 */

USE EMPRESAVENTAS;
GO

IF OBJECT_ID(N'dbo.Clientes', N'U') IS NULL
BEGIN
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
END;
GO

IF OBJECT_ID(N'dbo.Pedidos', N'U') IS NULL
BEGIN
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
END;
GO

IF OBJECT_ID(N'dbo.Items_pedido', N'U') IS NULL
BEGIN
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
END;
GO

SELECT tabla.name AS tabla, columna.name AS columna, tipo.name AS tipo,
       columna.max_length, columna.is_nullable
FROM sys.tables AS tabla
INNER JOIN sys.columns AS columna ON columna.object_id = tabla.object_id
INNER JOIN sys.types AS tipo ON tipo.user_type_id = columna.user_type_id
WHERE tabla.name IN ('Clientes', 'Pedidos', 'Items_pedido')
ORDER BY tabla.name, columna.column_id;
GO
