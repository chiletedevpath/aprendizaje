--*********************************************************************************************
--                              SEMANA 06 - SESION 01 
--*********************************************************************************************


-----------------------------------------------------------------------------------------------
--                                   DDL (CREATE)
-----------------------------------------------------------------------------------------------
-- CREAR NUESTRA BASE DE DATOS
CREATE DATABASE EMPRESAVENTAS;
GO
-----------------------------------------------------------------------------------------------


-----------------------------------------------------------------------------------------------
-- USAMOS EL FOCO DE NUESTRA BASE DE DATOS
USE EMPRESAVENTAS;
GO
-----------------------------------------------------------------------------------------------


-----------------------------------------------------------------------------------------------
-- CREAR TABLA CLIENTES Y PEDIDOS
CREATE TABLE Clientes (
ID_cliente INT PRIMARY KEY,
Nombre VARCHAR (50) NOT NULL,
Correo VARCHAR (40) NOT NULL,
Telefono VARCHAR (20)
);
GO

CREATE TABLE Pedidos (
ID_pedido INT PRIMARY KEY,
Fecha DATETIME DEFAULT GETDATE(),
ID_cliente INT NOT NULL,
CONSTRAINT FK_Pedidos_Clientes FOREIGN KEY (ID_cliente) REFERENCES Clientes (ID_cliente)
);
GO
-----------------------------------------------------------------------------------------------



--*********************************************************************************************
--                              SEMANA 06 - SESION 02
--*********************************************************************************************

-----------------------------------------------------------------------------------------------
CREATE TABLE Detalles_Pedido (
ID_detalle INT PRIMARY KEY,
ID_pedido INT NOT NULL,
Producto VARCHAR (100) NOT NULL,
Cantidad INT NOT NULL,
Precio DECIMAL (10,2),
CONSTRAINT FK_DetallesPedido_Pedidos FOREIGN KEY (ID_pedido) REFERENCES Pedidos (ID_pedido)
);
GO
-----------------------------------------------------------------------------------------------


-----------------------------------------------------------------------------------------------
--                               DDL (ALTER / DROP)
-----------------------------------------------------------------------------------------------
--AGREGAR UNA COLUMNA A LA TABLA PEDIDOS
ALTER TABLE Pedidos ADD Estado VARCHAR (20) DEFAULT 'Pendiente';
GO
-----------------------------------------------------------------------------------------------


--------------------------------------------------------------
-- CAMBIAR EL TIPO DE DATO DE TELEFONO EN LA TABLA CLIENTES
ALTER TABLE Clientes ALTER COLUMN Telefono INT;
-----------------------------------------------------------------------------------------------


-----------------------------------------------------------------------------------------------
-- AGREGAR COLUMNA A TABLA DE CLIENTES
ALTER TABLE Clientes ADD Fecha_registro DATE DEFAULT GETDATE();
GO
-----------------------------------------------------------------------------------------------


-----------------------------------------------------------------------------------------------
-- VAMOS A COLOCAR UNA RESTRICCION A LA COLUMNA ESTADO EN LA TABLA PEDIDOS
ALTER TABLE Pedidos ADD CONSTRAINT CK_Estado CHECK (Estado IN ('Pendiente','Enviado', 'Entregado'));
GO
-----------------------------------------------------------------------------------------------


-----------------------------------------------------------------------------------------------
-- RENOMBRAR COLUMNA Nombre -> Nombre_cliente EN LA TABLA CLIENTES
EXEC sp_rename 'Clientes.Nombre', 'Nombre_cliente', 'COLUMN';
GO
-----------------------------------------------------------------------------------------------


-----------------------------------------------------------------------------------------------
-- RENOMBRAR EL NOMBRE A LA TABLA Detalles_Pedido
EXEC sp_rename 'Detalles_Pedido','Items_pedido';
GO
-----------------------------------------------------------------------------------------------


-- **************************** FIN DE LA CLASE DDL *******************************************


-----------------------------------------------------------------------------------------------
-- ELIMINAR LA COLUMNA TELEFONO DE CLIENTE
ALTER TABLE Clientes DROP COLUMN Telefono;
GO
-----------------------------------------------------------------------------------------------


-----------------------------------------------------------------------------------------------
-- DDL (DROP) ELIMINAR TABLAS Y DB
DROP TABLE Items_pedido;
GO

-- ANTES DE BORRAR LA BASE DE DATOS, SE CAMBIA EL FOCO
USE MASTER;
GO

DROP DATABASE EMPRESAVENTAS;
GO

-- CODIGO ADICIONAL EN CASO NO QUIERA SOLTAR LA BASE DE DATOS
ALTER DATABASE EMPRESAVENTAS SET SINGLE_USER WITH ROLLBACK IMMEDIATE;

DROP DATABASE EMPRESAVENTAS;
GO
-----------------------------------------------------------------------------------------------