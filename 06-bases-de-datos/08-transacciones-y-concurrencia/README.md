# 08 · Transacciones y concurrencia

Una transacción agrupa cambios que deben mantenerse coherentes incluso cuando existe error o concurrencia.

## Qué debes dominar

- ACID
- BEGIN / COMMIT / ROLLBACK
- SAVEPOINT
- Dirty, non-repeatable y phantom reads
- Niveles de aislamiento

## Reto del tema

Descuenta stock dentro de una transacción y revierte la operación si el producto no existe o no tiene unidades suficientes.

## Para avanzar

Mantener consistencia ante operaciones múltiples y comprender los principales problemas de concurrencia.

## Motores

Compara la implementación en `sql-server/`, `postgresql/` y `oracle/`. El concepto es común, pero el dialecto y las herramientas pueden cambiar.
