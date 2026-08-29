# Solución 08 · Encontrar el error lógico

[Volver al ejercicio](../ejercicios-propuestos/08-error-logico.md)

Existe un **error lógico y de secuencia**. Dividir solamente la primera nota entre tres no equivale a dividir la suma completa.

Orden correcto:

1. Obtener las tres notas.
2. Sumar las notas.
3. Dividir la suma entre tres.
4. Mostrar el promedio.

Caso de prueba:

```txt
Notas: 12, 15, 18
Suma: 45
Promedio esperado: 15
```

## Criterio clave

Una corrección debe poder demostrarse con una prueba cuyo resultado esperado conozcamos de antemano.
