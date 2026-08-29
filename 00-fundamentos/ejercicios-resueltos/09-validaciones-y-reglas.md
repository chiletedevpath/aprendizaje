# Solución 09 · Revisar una solución incompleta

[Volver al ejercicio](../ejercicios-propuestos/09-validaciones-y-reglas.md)

### Validaciones de datos

- el monto debe existir;
- debe ser numérico;
- debe ser mayor que cero.

### Reglas del negocio

- el saldo debe ser suficiente;
- el monto debe respetar las denominaciones disponibles;
- podría existir un límite diario;
- la cuenta debe estar habilitada.

### Resultados posibles

- retiro aprobado;
- saldo insuficiente;
- monto inválido;
- límite excedido;
- operación no disponible.

La secuencia original asume que todo retiro es válido y podría dejar un saldo incorrecto.

## Criterio clave

Validar datos y aplicar reglas debe ocurrir **antes** de producir efectos como restar saldo o entregar dinero.
