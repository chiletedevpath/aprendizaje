
-- =============================================
-- MODELO LÓGICO RELACIONAL (SQL Server - SSMS 21)
-- SISTEMA DE MUNICIPIO
-- =============================================
USE Ejercicio02_Municipio;
GO
-- Primero eliminamos si existen, para evitar errores
DROP TABLE IF EXISTS OBRAS;
DROP TABLE IF EXISTS CIUDADANO;
DROP TABLE IF EXISTS MUNICIPIO;
DROP TABLE IF EXISTS CIUDAD;
GO

-- ==============================
-- TABLA CIUDAD
-- ==============================
CREATE TABLE CIUDAD (
    Cod_Ciu INT PRIMARY KEY,               -- Código único de la ciudad
    Nombre NVARCHAR(100) NOT NULL,         -- Nombre de la ciudad
    Tipo_Zona NVARCHAR(50),                -- Tipo de zona (urbana, rural, etc.)
    Zonas_Urbanas NVARCHAR(50)             -- Detalle de zona urbana
);
GO

-- ==============================
-- TABLA MUNICIPIO
-- Relación 1:1 con CIUDAD
-- ==============================
CREATE TABLE MUNICIPIO (
    Cod_Mun INT PRIMARY KEY,               -- Código único del municipio
    Descripcion NVARCHAR(200),             -- Descripción del municipio
    Cod_Ciu INT UNIQUE,                    -- Relación 1:1 con CIUDAD
    FOREIGN KEY (Cod_Ciu) REFERENCES CIUDAD(Cod_Ciu)
);
GO

-- ==============================
-- TABLA CIUDADANO
-- Relación N:1 con CIUDAD
-- ==============================
CREATE TABLE CIUDADANO (
    DNI CHAR(8) PRIMARY KEY,               -- DNI del ciudadano
    Nombres NVARCHAR(100) NOT NULL,        -- Nombre completo
    Direccion NVARCHAR(200),               -- Dirección del ciudadano
    Zona_Urbana NVARCHAR(50),              -- Zona urbana donde vive
    Telefono NVARCHAR(15),                 -- Teléfono
    Cod_Ciu INT NOT NULL,                  -- Ciudad de residencia
    FOREIGN KEY (Cod_Ciu) REFERENCES CIUDAD(Cod_Ciu)
);
GO

-- ==============================
-- TABLA OBRAS
-- Relación N:1 con MUNICIPIO
-- ==============================
CREATE TABLE OBRAS (
    Cod_Obra INT PRIMARY KEY,              -- Código único de la obra
    Zona_Urbana NVARCHAR(50),              -- Zona donde se ejecuta
    Residente NVARCHAR(100),               -- Responsable residente
    Financiamiento NVARCHAR(100),          -- Fuente de financiamiento
    Fec_Inicio DATE,                       -- Fecha de inicio
    Fec_Fin DATE,                          -- Fecha de fin
    Cod_Mun INT NOT NULL,                  -- Municipio que ejecuta
    FOREIGN KEY (Cod_Mun) REFERENCES MUNICIPIO(Cod_Mun)
);
GO
