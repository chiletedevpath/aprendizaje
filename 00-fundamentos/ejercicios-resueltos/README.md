# Ejercicios Resueltos

Las soluciones no buscan ser la única respuesta correcta. Su objetivo es mostrar una forma clara de razonar.

## Solución 1: Entrada, proceso y salida

Actividad: calcular el costo de una compra.

- Entrada: precio de cada producto y cantidad comprada.
- Proceso: multiplicar precio por cantidad y sumar los resultados.
- Salida: total a pagar.

Aprendizaje: casi todo programa puede explicarse como entrada, proceso y salida.

## Solución 2: Pasos para resolver un problema

Problema: calcular gasto semanal según gasto diario promedio.

Pasos:

1. Identificar el gasto diario promedio.
2. Identificar que una semana tiene 7 días.
3. Multiplicar gasto diario por 7.
4. Mostrar el gasto semanal.

Fórmula:

```txt
gasto_semanal = gasto_diario * 7
```

## Solución 3: Casos de prueba

- Caso normal: gasto diario 10, resultado esperado 70.
- Caso con gasto cero: gasto diario 0, resultado esperado 0.
- Caso inválido: gasto diario -5, debe rechazarse porque el gasto no puede ser negativo.

Aprendizaje: probar solo el caso normal no es suficiente.

## Solución 4: Nombre profesional de carpetas

Nombres recomendados:

- `variables-basicas`
- `condicionales-simples`
- `bucles-basicos`
- `arreglos-introduccion`
- `poo-clases-objetos`

Aprendizaje: el nombre de una carpeta debe explicar su contenido sin abrirla.

## Solución 5: Lectura de errores

Error:

```txt
Variable no definida: total
```

Posibles causas:

- La variable `total` nunca fue creada.
- El nombre fue escrito de forma distinta.
- La variable existe, pero fuera del alcance donde se usa.

Primer lugar para revisar:

- La línea exacta del error y las líneas cercanas.

Cambio inicial:

- Verificar que `total` esté declarada antes de usarla.
