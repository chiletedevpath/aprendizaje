/* Concepto: trigger de auditoria posterior a UPDATE. */
USE EMPRESAVENTAS;
GO
IF OBJECT_ID(N'dbo.Auditoria_pedidos', N'U') IS NULL
    CREATE TABLE dbo.Auditoria_pedidos (
        ID_auditoria INT IDENTITY PRIMARY KEY,
        ID_pedido INT NOT NULL,
        Estado_anterior VARCHAR(20) NOT NULL,
        Estado_nuevo VARCHAR(20) NOT NULL,
        Fecha_cambio DATETIME2 NOT NULL DEFAULT SYSDATETIME()
    );
GO
CREATE OR ALTER TRIGGER dbo.TR_Pedidos_Auditoria ON dbo.Pedidos AFTER UPDATE AS
BEGIN
    SET NOCOUNT ON;
    INSERT dbo.Auditoria_pedidos (ID_pedido, Estado_anterior, Estado_nuevo)
    SELECT i.ID_pedido, d.Estado, i.Estado FROM inserted i JOIN deleted d ON d.ID_pedido=i.ID_pedido
    WHERE i.Estado <> d.Estado;
END;
GO
BEGIN TRANSACTION;
UPDATE dbo.Pedidos SET Estado='Enviado' WHERE ID_pedido=104;
SELECT ID_pedido, Estado_anterior, Estado_nuevo FROM dbo.Auditoria_pedidos WHERE ID_pedido=104;
ROLLBACK TRANSACTION;
GO
