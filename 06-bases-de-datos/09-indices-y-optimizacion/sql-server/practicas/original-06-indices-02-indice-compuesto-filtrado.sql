/* Conceptos: indice compuesto, filtro, cobertura y plan de ejecucion. */
USE EMPRESAVENTAS;
GO
SET QUOTED_IDENTIFIER ON;
SET ANSI_NULLS ON;
GO
DROP INDEX IF EXISTS IX_Pedidos_EstadoFecha ON dbo.Pedidos;
CREATE NONCLUSTERED INDEX IX_Pedidos_EstadoFecha
ON dbo.Pedidos (Estado, Fecha)
INCLUDE (ID_cliente)
WHERE Estado = 'Pendiente';
GO
SET SHOWPLAN_TEXT ON;
GO
SELECT ID_pedido, ID_cliente, Fecha FROM dbo.Pedidos WHERE Estado = 'Pendiente';
GO
SET SHOWPLAN_TEXT OFF;
GO
