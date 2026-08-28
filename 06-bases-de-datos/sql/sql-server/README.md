# SQL Server

Este bloque contiene prácticas T-SQL ordenadas para ejecutarse sobre una instancia local de SQL Server.

## Propósito

Aplicar progresivamente definición de estructuras, manipulación y consulta, permisos mínimos, índices, procedimientos almacenados, transacciones y manejo de errores.

## Contexto de ejecución

- Herramienta recomendada: SQL Server Management Studio o `sqlcmd`.
- Autenticación: una cuenta local autorizada para crear bases y usuarios de práctica.
- Base creada por los scripts: `EMPRESAVENTAS`.
- Datos: exclusivamente ficticios.

Con autenticación integrada, cada archivo puede ejecutarse desde PowerShell:

```powershell
sqlcmd -S localhost -E -C -b -i ".\ddl-dml-queries\01-ddl-basico.sql"
```

Cambia `localhost` únicamente si tu instancia usa otro nombre. Conserva las comillas cuando la ruta contenga espacios.

## Orden obligatorio

1. `ddl-dml-queries/01-ddl-basico.sql`
2. `ddl-dml-queries/02-dml-basico.sql`
3. `ddl-dml-queries/03-seguridad-indices.sql`
4. `ddl-dml-queries/04-procedimientos-errores.sql`

`ddl-dml-queries/99-limpieza-opcional.sql` elimina la base completa y debe ejecutarse solo al finalizar.

## Validación realizada

La secuencia 01 a 04 fue ejecutada correctamente el 25/07/2026 sobre SQL Server `16.0.1190.2`, Developer Edition de 64 bits. Se verificaron 4 clientes, 4 pedidos y 4 ítems después de las prácticas; luego se ejecutó la limpieza opcional y se confirmó que `EMPRESAVENTAS` ya no estaba presente.

Antes de aprobar su publicación todavía debe completarse la revisión editorial del origen de los ejercicios.
