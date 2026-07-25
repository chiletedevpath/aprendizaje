# Laboratorio integrador: seguimiento de pedidos

Este laboratorio cierra el módulo. No incluye una solución de referencia porque su propósito es demostrar que puedes analizar, construir, probar y explicar un algoritmo completo.

## Situación

Un pequeño negocio necesita resumir los pedidos preparados durante un turno. Cada pedido pertenece a una categoría:

1. recojo en tienda;
2. entrega local;
3. entrega extendida.

Las tarifas de entrega son:

- recojo en tienda: S/ 0;
- entrega local: S/ 5;
- entrega extendida: S/ 12.

Si el subtotal del pedido es igual o mayor a S/ 100, la tarifa de entrega tiene un descuento de 50 %. El subtotal no recibe descuento.

## Requisitos

El algoritmo debe:

1. solicitar una cantidad de pedidos mayor que cero;
2. validar para cada pedido un código entero positivo;
3. validar un subtotal mayor que cero;
4. validar una categoría entre 1 y 3;
5. calcular tarifa, descuento de entrega y total del pedido;
6. mostrar el resumen de cada pedido;
7. acumular el total facturado;
8. contar pedidos por categoría;
9. contar cuántos pedidos recibieron descuento;
10. identificar el pedido con mayor total;
11. mostrar un resumen final.

## Restricciones del ejercicio

- Usa pseudocódigo compatible con PSeInt.
- No uses arreglos, funciones ni subprocesos; pertenecen a etapas posteriores.
- Evita repetir el cálculo final en cada alternativa de `Segun`.
- Declara por separado contadores, acumuladores y datos del pedido.
- No aceptes una categoría inválida.

## Casos mínimos

Prepara resultados esperados antes de ejecutar:

1. un pedido de recojo con subtotal menor que S/ 100;
2. un pedido local con subtotal exactamente igual a S/ 100;
3. un pedido extendido con subtotal mayor que S/ 100;
4. una cantidad de pedidos igual a cero;
5. un código no positivo;
6. un subtotal no positivo;
7. una categoría fuera del rango.

Incluye también una prueba con al menos tres pedidos para comprobar contadores, acumulador y pedido de mayor total.

## Evidencia de entrega

Entrega:

- archivo `.psc`;
- tabla de entrada, proceso y salida;
- justificación de `Repetir`, `Para`, `Segun` y `Si`;
- prueba de escritorio de un pedido;
- tabla de casos ejecutados con resultado esperado y obtenido;
- explicación de un error encontrado y su corrección;
- captura o registro de la ejecución final en PSeInt.

## Rúbrica

| Criterio | Logrado | En proceso | Pendiente |
|---|---|---|---|
| Análisis | Entradas, reglas y salidas están completas | Existe una omisión menor | El problema no está delimitado |
| Estructuras | Cada estructura tiene una responsabilidad adecuada | Hay decisiones o repeticiones innecesarias | La estructura no representa el problema |
| Validación | Atiende todos los rangos solicitados | Falta un límite | Procesa datos inválidos |
| Cálculos | Tarifas, descuentos y totales son correctos | Falla un caso límite | Los resultados principales son incorrectos |
| Resumen | Contadores, acumulador y máximo coinciden | Un indicador falla | No existe resumen verificable |
| Pruebas | Incluye casos normales, límite e inválidos | Las pruebas son incompletas | Solo se probó un caso favorable |
| Explicación | Justifica decisiones y correcciones | Describe sin justificar completamente | No puede explicar la solución |

## Criterio de cierre

El laboratorio está logrado cuando los resultados coinciden con los casos esperados y puedes explicar el valor de las variables durante una iteración sin depender de copiar otra solución.
