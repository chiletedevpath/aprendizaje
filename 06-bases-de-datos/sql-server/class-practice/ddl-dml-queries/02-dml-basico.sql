--*********************************************************************************************
--                                   SEMANA 07 - SESION 01 
--*********************************************************************************************


-----------------------------------------------------------------------------------------------
--                              DML (INSER, UPDATE, SELECT Y DELETE)
-----------------------------------------------------------------------------------------------
-- USAMOS EL FOCO DE NUESTRA BASE DE DATOS
USE EMPRESAVENTAS;
GO
-----------------------------------------------------------------------------------------------


-----------------------------------------------------------------------------------------------
-- INSERT:
--		INSERTA REGISTROS EN LAS TABLAS DE LA BASE DE DATOS

-- VERIFICAR CONTENIDO DE LAS TABLAS DE MI BD
SELECT * FROM Items_pedido;
GO

-- INSERTAR REGISTROS EN LA TABLA CLIENTES
INSERT INTO Clientes(ID_cliente, Nombre_cliente, Correo, Telefono)
VALUES
(1, 'Ana Torres', 'ana.torres@gmail.com', 945834043),
(2, 'Carlos Perez', 'carlos.perez@gmail.com', 900789256),
(3, 'Lucia Ramirez', 'lucia.ramirez@gmail.com', 987458159);       
GO

-- INSERTAR REGISTROS EN LA TABLA Pedidos
INSERT INTO Pedidos(ID_pedido, ID_cliente, Estado)
VALUES
(101,1, 'Pendiente'),
(102,2, 'Enviado'),
(103,3, 'Pendiente');
GO

INSERT INTO Pedidos(ID_pedido, ID_cliente, Estado)
VALUES
(104,2, 'Pendiente');
GO

-- INSERTAR REGISTROS EN LA TABLA Items_pedidos 
INSERT INTO Items_pedido(ID_detalle, ID_pedido, Producto, Cantidad, Precio)
VALUES 
(1001, 101, 'Laptop Lenovo', 1, 2500.00),
(1002, 102, 'Mouse Inalambrico', 2, 75.50),
(1003, 103, 'Impresora HP', 1, 1500.00), 
(1004, 104, 'Teclado Inalambrico', 2, 440.00);
GO
-----------------------------------------------------------------------------------------------


-----------------------------------------------------------------------------------------------
-- UPDATE:
--		MODIFICA LOS DATOS EXISTENTES EN LAS TABLAS DE LA BASE DE DATOS	

-- VERIFICAR CONTENIDO DE LAS TABLAS DE MI BD
SELECT*FROM Items_pedido;
GO

-- ACTUALIZAR UN TELEFONO DE LA TABLA CLIENTES
UPDATE Clientes 
SET Telefono = 999000777
WHERE ID_cliente = 2;
GO

-- ACTUALIZAR UN ESTADO DE LA TABLA PEDIDOS
UPDATE Pedidos 
SET Estado = 'Entregado'
WHERE ID_pedido = 101;
GO
-----------------------------------------------------------------------------------------------

-----------------------------------------------------------------------------------------------
--	CONSULTAS BASICAS:

-- A) EL COMODIN "*" MUESTRA TODOS LOS DATOS DE LAS TABLAS

-- EJECUTA LAS TABLAS DE LA BASE DE DATOS UNA POR UNA 
SELECT*FROM Clientes;
SELECT*FROM Items_pedido;
SELECT*FROM Pedidos;
GO

-- B) sp_helpconstraint AYUDA PARA VER LAS RESTRICCIONES DE LAS TABLAS
EXEC sp_helpconstraint 'Clientes';
EXEC sp_helpconstraint 'Items_pedido';
EXEC sp_helpconstraint 'Pedidos';
GO
-----------------------------------------------------------------------------------------------



--*********************************************************************************************
--                                   SEMANA 07 - SESION 02
--*********************************************************************************************

-- C) SELECT PARA CONSULTAR ALGUNAS COLUMNAS
SELECT Producto, Precio
FROM Items_pedido;
GO

SELECT Nombre_cliente, Telefono
FROM Clientes;
GO
-----------------------------------------------------------------------------------------------


-----------------------------------------------------------------------------------------------
--	OTROS COMODINES

-- A) COMODIN "%"

-- TODOS LOS DATOS DE LA COLUMNA NOMBRE DE CLIENTE QUE INICIEN CON C
SELECT ID_Cliente, Nombre_cliente, Correo
FROM Clientes
WHERE Nombre_cliente LIKE 'C%';
GO

-- TODOS LOS DATOS DE LA COLUMNA NOMBRE DE CLIENTE QUE TERMINEN CON Z
SELECT Nombre_cliente, Correo
FROM Clientes
WHERE Nombre_cliente LIKE '%Z';
GO


-- B) COMODIN "[]%": BUSCA NOMBRES QUE COMIENCEN CON LAS LETRAS A O L.
SELECT ID_Cliente, Nombre_cliente, Correo
FROM Clientes
WHERE Nombre_cliente LIKE '[AL]%';
GO


-- C) COMODIN "[-]%": BUSCA NOMBRES QUE COMIENCEN CON CUALQUIER LETRA ENTRE A Y L (INCLUYENDO AMBAS)
SELECT ID_Cliente, Nombre_cliente, Correo
FROM Clientes
WHERE Nombre_cliente LIKE '[C-L]%';
GO 


-- D) CONSULTA POR FECHA DE REGISTRO DE LA TABLA DE CLIENTES

-- INSERTO UN NUEVO REGISTRO EN LA TABLA CLIENTES
INSERT INTO Clientes(ID_cliente, Nombre_cliente, Correo, Telefono)
VALUES
(4, 'Alexandra Meza', 'ale.meza@gmail.com', 900500100);
GO

SELECT ID_cliente, Nombre_cliente, Fecha_registro
FROM Clientes
WHERE Fecha_registro = '2025-11-12';
GO

-- E) "^": ESPECIFICA CARACTERES QUE NO DEBEN COINCIDIR
SELECT ID_Cliente, Nombre_cliente, Correo
FROM Clientes
WHERE Nombre_cliente LIKE '[^L]%';
GO

-- F) "%e%": BUSCAR UN CARACTER EN CUALQUIER POSICION
SELECT ID_Cliente, Nombre_cliente, Correo
FROM Clientes
WHERE Nombre_cliente LIKE '%c%';
GO
-----------------------------------------------------------------------------------------------


-----------------------------------------------------------------------------------------------
-- DELETE:
--		ELIMINA FILAS DE UNA TABLA	

-- BORRAR UN CLIENTE NO REFERENCIADO 
DELETE FROM Clientes
WHERE ID_cliente = 4;
GO
-----------------------------------------------------------------------------------------------

-----------------------------------------------------------------------------------------------
-- BORRAR UN CLIENTE REFERENCIADO (INICIALMENTE NO SE PUEDE PORQUE NO ESTA EN DELETE CASCADE
DELETE FROM Clientes
WHERE ID_cliente = 3;
GO

-- 1.- MODIFICAR LAS RESTRICCIONES DE LA TABLA ITEMS_PEDIDO PARA PODER ELIMINAR EL CLIENTE CON ID 3
ALTER TABLE Items_pedido 
DROP CONSTRAINT FK_DetallesPedido_Pedidos;
GO

ALTER TABLE Items_pedido
ADD CONSTRAINT FK_DetallesPedido_Pedidos
FOREIGN KEY(ID_pedido)
REFERENCES Pedidos(ID_Pedido)
ON DELETE CASCADE;
GO

EXEC sp_helpconstraint 'Items_pedido';


-- 2.- MODIFICAR LAS RESTRICCIONES DE LA TABLA PEDIDOS PARA PODER ELIMINAR EL CLIENTE CON ID 3
ALTER TABLE Pedidos 
DROP CONSTRAINT FK_Pedidos_Clientes;
GO

ALTER TABLE Pedidos
ADD CONSTRAINT FK_Pedidos_Clientes
FOREIGN KEY(ID_cliente)
REFERENCES Clientes(ID_cliente)
ON DELETE CASCADE;
GO

EXEC sp_helpconstraint 'Pedidos';

-- SE VUELVER A EJECUTAR EL BORRADO DEL ID_CLIENTE 3 PORQUE YA ESTA EN DELETE CASCADE
DELETE FROM Clientes
WHERE ID_cliente = 3;
GO
-----------------------------------------------------------------------------------------------



-----------------------------------------------------------------------------------------------
--									  DCL (GRANT Y REVOKE)

-- VER USUARIOS A NIVEL DE BASE DE DATOS
SELECT name AS Usuario, type_desc AS Tipo
FROM sys.database_principals
WHERE type in ('S','U','G');
GO

-- VER USUARIOS A NIVEL DE SERVIDOR
SELECT name AS LoginName, type_desc, create_date
FROM sys.server_principals
WHERE type in ('S','U','G');
GO

-- SIMULAR USUARIOS PARA GRANT Y REVOKE
SELECT USER_NAME ();
GO

USE EMPRESAVENTAS;
GO

-- CREAR UN USUARIO SIMULADO
CREATE USER Usuario_demo WITHOUT LOGIN;
GO

-- PONERLO EN EJECUCION
EXECUTE AS USER = 'Usuario_demo';
GO

-- BUSQUEDA: NO CORRE PORQUE NO TIENE PERMISOS
SELECT * FROM Clientes;
GO

-- PARA DAR PERMISOS DEBO REGRESAR A MI USUARIO PRINCIPAL
REVERT;
GO

-- AHORA SI DOY PRIVILEGIOS DE LECTURA SOBRE LA TABLA CLIENTES
GRANt SELECT ON CLientes TO Usuario_demo
GO

-- PONERLO EN EJECUCION NUEVAMENTE 
EXECUTE AS USER = 'Usuario_demo';
GO

SELECT USER_NAME();

-- BUSQUEDA CON EL GRANT DE BUSQUEDA PERMITIDO
SELECT * FROM Clientes;
GO

-- PARA QUITAR PERMISOS DEBO REGRESAR A MI USUARIO PRINCIPAL
REVERT;
GO

-- REVOCAR EL PRIVILEGIO CONCEDIDO
REVOKE SELECT ON Clientes FROM Usuario_demo;
GO

-- PARA ELIMINAR MI USUARIO SIMULADO "USUARIO_DEMO"
REVERT;
GO

DROP USER Usuario_demo;
GO
-----------------------------------------------------------------------------------------------



--*********************************************************************************************
--                             SEMANA 08 - SESION 01 | PARTE 1
--*********************************************************************************************


-----------------------------------------------------------------------------------------------
-- GESTION DE INDICES
--		HAZ CLIC EN "INCLUDE ACTUAL EXECUTION PLAN! ( O PRESIONA CTRL + M) ANTES DE EJECUTAR LA CONSULTA 
--		LUEGO EJECUTA LA CONSULTA Y VERAS UNA PESTAÑA ADICIONAL LLAMADA EXECUTION PLAN.

-- 1ra. FORMA

-- EJECUTAR LA CONSULTA
SELECT *
FROM Clientes
WHERE Nombre_cliente LIKE 'A%';
GO

--Crear el índice
CREATE NONCLUSTERED INDEX IX_Clientes_Nombre
ON Clientes (Nombre_cliente);
GO

--Consulta CON índice
SELECT *
FROM Clientes
WHERE Nombre_cliente LIKE 'A%';
GO

-----------------
--2DA FORMA
----------------

--Ver tiempo de ejecución, Antes de ejecutar tu consulta, activa las opciones:

--Comparar con y sin índice
--Primero sin índice:

DROP INDEX IF EXISTS IX_Clientes_Nombre ON Clientes;
GO

SET STATISTICS TIME ON;   -- Muestra el tiempo de ejecución
SET STATISTICS IO ON;     -- Muestra la cantidad de lecturas de disco
GO

SELECT *
FROM Clientes
WHERE Nombre_cliente LIKE 'A%';
GO

--Luego con índice:

CREATE NONCLUSTERED INDEX IX_Clientes_Nombre
ON Clientes (Nombre_cliente);
GO

SELECT *
FROM Clientes
WHERE Nombre_cliente LIKE 'A%';
GO

--------------
--3 FORMA:
--------------

-- Activar estadísticas
SET STATISTICS TIME ON;
SET STATISTICS IO ON;
GO

-- ==================================
-- 1. CONSULTA SIN ÍNDICE
-- ==================================
-- Eliminar índice si existe
DROP INDEX IF EXISTS IX_Clientes_Nombre ON Clientes;
GO



PRINT '---- CONSULTA SIN ÍNDICE ----';
SELECT *
FROM Clientes
WHERE Nombre_cliente LIKE 'A%';
GO

-- ==================================
-- 2. CONSULTA CON ÍNDICE
-- ==================================
-- Crear índice
CREATE NONCLUSTERED INDEX IX_Clientes_Nombre
ON Clientes (Nombre_cliente);
GO

PRINT ''
PRINT '-----------------------------'
PRINT '---- CONSULTA CON ÍNDICE ----';
SELECT *
FROM Clientes
WHERE Nombre_cliente LIKE 'A%';
GO

SELECT *
FROM Clientes
GO