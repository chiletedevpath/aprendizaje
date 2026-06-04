-- =============================================
-- MODELO LÓGICO RELACIONAL (SQL Server - SSMS 21)
-- SISTEMA DE RESERVAS DE RESTAURANTE
-- =============================================

USE Ejercicio03_Restaurante;
GO

-- Eliminamos tablas si existen (en orden de dependencias)
IF OBJECT_ID('dbo.Pedido_Platillo', 'U') IS NOT NULL DROP TABLE dbo.Pedido_Platillo;
IF OBJECT_ID('dbo.Pedido', 'U') IS NOT NULL DROP TABLE dbo.Pedido;
IF OBJECT_ID('dbo.Reserva', 'U') IS NOT NULL DROP TABLE dbo.Reserva;
IF OBJECT_ID('dbo.Platillo', 'U') IS NOT NULL DROP TABLE dbo.Platillo;
IF OBJECT_ID('dbo.Mesa', 'U') IS NOT NULL DROP TABLE dbo.Mesa;
IF OBJECT_ID('dbo.Cliente', 'U') IS NOT NULL DROP TABLE dbo.Cliente;
GO

-- ================================
-- ENTIDAD: Cliente
-- ================================
CREATE TABLE Cliente (
  id_cliente     INT IDENTITY(1,1) PRIMARY KEY,
  nombre         VARCHAR(100) NOT NULL,
  correo         VARCHAR(100) UNIQUE,
  telefono       VARCHAR(20)
);
GO

-- ================================
-- ENTIDAD: Mesa
-- ================================
CREATE TABLE Mesa (
  id_mesa        INT IDENTITY(1,1) PRIMARY KEY,
  capacidad      INT NOT NULL CHECK (capacidad > 0),
  ubicacion      VARCHAR(50) NOT NULL CHECK (ubicacion IN ('interior', 'exterior'))
);
GO

-- ================================
-- ENTIDAD: Platillo
-- ================================
CREATE TABLE Platillo (
  id_platillo    INT IDENTITY(1,1) PRIMARY KEY,
  nombre         VARCHAR(100) NOT NULL,
  tipo           VARCHAR(30) NOT NULL CHECK (tipo IN ('entrada', 'plato principal', 'postre')),
  precio         DECIMAL(6,2) NOT NULL CHECK (precio >= 0)
);
GO

-- ================================
-- RELACIÓN: Reserva
-- ================================
CREATE TABLE Reserva (
  id_reserva      INT IDENTITY(1,1) PRIMARY KEY,
  id_cliente      INT NOT NULL,
  id_mesa         INT NOT NULL UNIQUE, -- Una mesa solo puede tener una reserva activa
  fecha_hora      DATETIME NOT NULL,
  numero_personas INT NOT NULL CHECK (numero_personas > 0),
  CONSTRAINT fk_reserva_cliente FOREIGN KEY (id_cliente) REFERENCES Cliente(id_cliente) ON DELETE CASCADE,
  CONSTRAINT fk_reserva_mesa FOREIGN KEY (id_mesa) REFERENCES Mesa(id_mesa) ON DELETE CASCADE
);
GO

-- ================================
-- RELACIÓN: Pedido
-- ================================
CREATE TABLE Pedido (
  id_pedido     INT IDENTITY(1,1) PRIMARY KEY,
  id_reserva    INT NOT NULL,
  precio_total  DECIMAL(8,2) CHECK (precio_total >= 0),
  CONSTRAINT fk_pedido_reserva FOREIGN KEY (id_reserva) REFERENCES Reserva(id_reserva) ON DELETE CASCADE
);
GO

-- ================================
-- RELACIÓN N:M: Pedido_Platillo
-- ================================
CREATE TABLE Pedido_Platillo (
  id_pedido    INT NOT NULL,
  id_platillo  INT NOT NULL,
  cantidad     INT NOT NULL CHECK (cantidad > 0),
  PRIMARY KEY (id_pedido, id_platillo),
  CONSTRAINT fk_pp_pedido FOREIGN KEY (id_pedido) REFERENCES Pedido(id_pedido) ON DELETE CASCADE,
  CONSTRAINT fk_pp_platillo FOREIGN KEY (id_platillo) REFERENCES Platillo(id_platillo) ON DELETE CASCADE
);
GO
