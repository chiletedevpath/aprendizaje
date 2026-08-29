/* Concepto: relacion muchos a muchos mediante una tabla puente. */
USE EMPRESAVENTAS;
GO
IF OBJECT_ID(N'dbo.Productos_catalogo', N'U') IS NULL
    CREATE TABLE dbo.Productos_catalogo (
        ID_producto INT PRIMARY KEY,
        Nombre VARCHAR(100) UNIQUE NOT NULL
    );
IF OBJECT_ID(N'dbo.Etiquetas', N'U') IS NULL
    CREATE TABLE dbo.Etiquetas (ID_etiqueta INT PRIMARY KEY, Nombre VARCHAR(50) UNIQUE NOT NULL);
IF OBJECT_ID(N'dbo.Productos_etiquetas', N'U') IS NULL
    CREATE TABLE dbo.Productos_etiquetas (
        ID_producto INT NOT NULL REFERENCES dbo.Productos_catalogo(ID_producto) ON DELETE CASCADE,
        ID_etiqueta INT NOT NULL REFERENCES dbo.Etiquetas(ID_etiqueta) ON DELETE CASCADE,
        CONSTRAINT PK_ProductosEtiquetas PRIMARY KEY (ID_producto, ID_etiqueta)
    );
MERGE dbo.Productos_catalogo AS destino
USING (VALUES (1, 'Laptop de practica'), (2, 'Mouse inalambrico')) AS origen(ID_producto, Nombre)
ON destino.ID_producto = origen.ID_producto
WHEN NOT MATCHED THEN INSERT (ID_producto, Nombre) VALUES (origen.ID_producto, origen.Nombre);
MERGE dbo.Etiquetas AS destino
USING (VALUES (1, 'Tecnologia'), (2, 'Oficina')) AS origen(ID_etiqueta, Nombre)
ON destino.ID_etiqueta = origen.ID_etiqueta
WHEN NOT MATCHED THEN INSERT (ID_etiqueta, Nombre) VALUES (origen.ID_etiqueta, origen.Nombre);
IF NOT EXISTS (SELECT 1 FROM dbo.Productos_etiquetas WHERE ID_producto=1 AND ID_etiqueta=1)
    INSERT dbo.Productos_etiquetas VALUES (1, 1);
SELECT producto.Nombre AS producto, etiqueta.Nombre AS etiqueta
FROM dbo.Productos_etiquetas puente
JOIN dbo.Productos_catalogo producto ON producto.ID_producto=puente.ID_producto
JOIN dbo.Etiquetas etiqueta ON etiqueta.ID_etiqueta=puente.ID_etiqueta;
GO
