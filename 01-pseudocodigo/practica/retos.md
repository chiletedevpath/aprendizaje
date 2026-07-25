# Retos de pseudocódigo

Estos siete retos corresponden a los bloques de la guía didáctica. Deben resolverse en archivos `.psc` propios antes de consultar `soluciones-retos/`.

Para cada reto conserva evidencia de:

- análisis de entrada, proceso y salida;
- estructura elegida y justificación;
- prueba normal;
- prueba límite;
- prueba inválida;
- corrección realizada después de probar.

## Bloque 1: Conversión de duración

Una plataforma registra la duración de una sesión únicamente en segundos. Construye un algoritmo que convierta una cantidad no negativa de segundos a horas completas, minutos restantes y segundos restantes.

Ejemplo:

```text
Entrada: 7384 segundos
Salida: 2 horas, 3 minutos y 4 segundos
```

En esta etapa trabaja solamente con secuencia y operaciones aritméticas. Declara como precondición que la entrada no es negativa; la validación se añadirá en bloques posteriores.

Casos obligatorios: `0`, `59`, `60`, `3600` y `7384`.

## Bloque 2: Tarifa de estacionamiento

Un estacionamiento cobra:

- S/ 5.00 hasta dos horas, inclusive;
- S/ 2.00 por cada hora adicional;
- S/ 25.00 como máximo diario.

Lee una cantidad entera de horas entre 1 y 24. Valida el rango y calcula el total. Utiliza decisiones; todavía no uses bucles para volver a pedir el dato.

Casos obligatorios: `1`, `2`, `3`, `12`, `24`, `0` y `25`.

## Bloque 3: Menú de conversiones

Solicita un valor real y una opción:

1. kilómetros a metros;
2. metros a centímetros;
3. grados Celsius a Fahrenheit.

Muestra el resultado de la opción elegida. Atiende una opción inválida mediante `De Otro Modo`.

Casos obligatorios: una prueba válida por opción y una opción inexistente.

## Bloque 4: Resumen de calificaciones

Lee la cantidad de estudiantes. Si es válida, solicita una nota de 0 a 20 para cada estudiante y calcula:

- promedio del grupo;
- cantidad de notas aprobatorias, considerando 13 como mínimo;
- nota mayor;
- nota menor.

Usa `Para`. En este reto puedes informar una nota inválida y terminar; la repetición de validación se practicará después.

Casos obligatorios: un estudiante, varios estudiantes, todas las notas iguales, cantidad cero y una nota fuera de rango.

## Bloque 5: Ahorro hasta una meta

Lee una meta positiva y luego aportes positivos. Acumula los aportes mientras el total sea menor que la meta. Al terminar, muestra:

- total ahorrado;
- cantidad de aportes;
- cuánto se superó la meta, si corresponde.

Usa `Mientras`. Supón inicialmente que la meta y los aportes cumplen la precondición de ser positivos.

Casos obligatorios: alcanzar la meta exactamente, superarla y completarla con un solo aporte.

## Bloque 6: Clave con intentos limitados

La clave de práctica es `2468`. Solicítala hasta que sea correcta o se completen tres intentos.

Al finalizar, informa si el acceso fue concedido o bloqueado. Usa `Repetir` y una condición compuesta.

Casos obligatorios: clave correcta al primer intento, correcta al tercero y tres claves incorrectas.

## Bloque 7: Control de inventario

Una tienda procesa varios movimientos de un producto. Primero lee un stock inicial no negativo y la cantidad positiva de movimientos.

Por cada movimiento:

1. entrada de unidades;
2. salida de unidades.

Valida la opción y una cantidad positiva. Una salida solo se realiza cuando existe stock suficiente. Al final muestra:

- stock final;
- total de unidades ingresadas;
- total de unidades retiradas;
- cantidad de salidas rechazadas.

Integra `Repetir`, `Para`, `Segun`, `Si`, contadores y acumuladores.

Casos obligatorios: entrada válida, salida válida, salida sin stock suficiente, opción inválida y cantidad no positiva.

## Revisión antes de consultar soluciones

- ¿El nombre del algoritmo describe el problema?
- ¿Cada variable tiene un propósito claro?
- ¿Las condiciones incluyen correctamente sus límites?
- ¿Los acumuladores se inicializan antes del bucle?
- ¿La condición del bucle puede llegar a ser falsa?
- ¿La salida permite comprobar las reglas?
- ¿Registraste al menos tres resultados esperados antes de ejecutar?
