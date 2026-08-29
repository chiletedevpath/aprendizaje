/* Solución de referencia: compárala después de intentar el reto. */
/* DDL básico en SQL Server. */

CREATE TABLE dbo.Categorias (
    id INT IDENTITY(1,1) PRIMARY KEY,
    nombre VARCHAR(80) NOT NULL UNIQUE
);

CREATE TABLE dbo.Productos (
    id INT IDENTITY(1,1) PRIMARY KEY,
    codigo VARCHAR(20) NOT NULL UNIQUE,
    nombre VARCHAR(120) NOT NULL,
    categoria_id INT NOT NULL,
    precio DECIMAL(10,2) NOT NULL CHECK (precio >= 0),
    stock INT NOT NULL DEFAULT 0 CHECK (stock >= 0),
    activo BIT NOT NULL DEFAULT 1,
    CONSTRAINT fk_productos_categorias FOREIGN KEY (categoria_id) REFERENCES dbo.Categorias(id)
);
