# Guía didáctica de pseudocódigo

Esta guía conecta los conceptos con el banco de algoritmos resueltos y con la práctica autónoma. El objetivo no es memorizar la sintaxis de PSeInt, sino aprender a elegir una estructura, seguir el valor de las variables y comprobar el resultado.

## Método de trabajo

Para cada bloque:

1. comprende qué problema resuelve la estructura;
2. revisa el ejemplo guiado indicado;
3. realiza la prueba de escritorio propuesta;
4. ejecuta otros algoritmos del banco resuelto;
5. intenta el reto correspondiente sin consultar su solución;
6. prueba un caso normal, uno límite y uno inválido;
7. explica por qué elegiste esa estructura.

Las soluciones de los retos están separadas en `practica/soluciones-retos/`. Deben consultarse después de realizar y probar un primer intento.

## 1. Secuencia, variables y expresiones

Una secuencia ejecuta instrucciones en el orden en que fueron escritas. Es adecuada cuando todas las operaciones deben realizarse una vez y no existen decisiones ni repeticiones.

Una solución secuencial normalmente sigue este flujo:

```text
leer entradas
calcular resultados intermedios
calcular resultado final
mostrar salida
```

Antes de escribir:

- identifica qué datos deben ingresar;
- asigna un tipo coherente a cada variable;
- revisa las unidades;
- separa los cálculos para poder comprobarlos;
- evita leer una variable después de necesitarla.

### Ejemplo guiado

Revisa `pseint/01-secuenciales/promedio-calificaciones.psc`.

El algoritmo recibe tres notas, aplica pesos de 20 %, 30 % y 50 %, y suma los aportes ponderados.

Prueba de escritorio:

| Variable | Valor |
|---|---:|
| `not1` | 20 |
| `not2` | 10 |
| `not3` | 15 |
| `prom1` | 4 |
| `prom2` | 3 |
| `prom3` | 7.5 |
| `promF` | 14.5 |

La suma de los pesos debe ser 100 %. Si los pesos cambiaran, también tendría que cambiar el cálculo.

### Errores frecuentes

- usar `Entero` cuando el resultado puede contener decimales;
- mezclar minutos, horas u otras unidades sin convertirlas;
- sobrescribir un dato antes de terminar de usarlo;
- aplicar porcentajes como si fueran números enteros;
- mostrar una variable que todavía no fue calculada.

Reto: `practica/retos.md`, bloque 1.

## 2. Decisiones con `Si`

`Si` permite ejecutar una acción cuando una condición es verdadera. `SiNo` representa el camino alternativo.

```text
Si condicion Entonces
    acciones cuando se cumple
SiNo
    acciones cuando no se cumple
FinSi
```

Una condición se construye con operadores relacionales como `>`, `<`, `>=`, `<=`, `=` y `<>`. Los operadores `Y`, `O` y `NO` permiten combinar o negar condiciones.

Usa `Si` cuando:

- existen dos caminos principales;
- debe validarse un rango;
- una operación depende de una regla;
- las condiciones no son una lista fija de opciones equivalentes.

### Ejemplo guiado

Revisa `pseint/02-condicionales/costo-descuento.psc`.

La condición `pre >= 200` incluye el límite de 200. Por eso deben probarse al menos estos valores:

| Precio | Resultado esperado |
|---:|---|
| 250 | descuento de 15 % |
| 200 | descuento de 15 % |
| 199.99 | descuento de 5 % |
| -10 | el enunciado no define una validación; debe identificarse como caso pendiente |

El último caso muestra que ejecutar no significa necesariamente que el algoritmo esté completo frente a datos inválidos.

### Errores frecuentes

- confundir `>` con `>=`;
- escribir condiciones que dejan valores sin atender;
- repetir el mismo cálculo en ambas ramas;
- validar después de procesar un dato;
- crear variables distintas para resultados que representan lo mismo.

Reto: `practica/retos.md`, bloque 2.

## 3. Selección múltiple con `Segun`

`Segun` es apropiado cuando una sola expresión puede tomar varias opciones discretas: un número de menú, una categoría o un símbolo.

```text
Segun opcion Hacer
    1:
        acciones
    2:
        acciones
    De Otro Modo:
        informar opcion invalida
FinSegun
```

No reemplaza todas las decisiones. Si se comparan rangos, condiciones combinadas o reglas independientes, normalmente `Si` expresa mejor la intención.

### Ejemplo guiado

Revisa `pseint/03-segun/calculadora-basica.psc`.

`Segun` selecciona la operación y un `Si` interno protege la división entre cero. Esto muestra que las estructuras pueden combinarse cuando cumplen responsabilidades diferentes.

Casos mínimos:

| Entradas | Resultado esperado |
|---|---|
| `8`, `2`, `+` | 10 |
| `8`, `2`, `/` | 4 |
| `8`, `0`, `/` | advertencia de división inválida |
| `8`, `2`, `%` | operación incorrecta |

### Errores frecuentes

- omitir `De Otro Modo`;
- usar `Segun` para intervalos continuos;
- olvidar validaciones particulares dentro de una opción;
- mezclar caracteres y números al leer la opción.

Reto: `practica/retos.md`, bloque 3.

## 4. Repetición conocida con `Para`

`Para` se utiliza cuando la cantidad de repeticiones se conoce antes de comenzar.

```text
Para i = 1 Hasta cantidad Hacer
    acciones
FinPara
```

Conceptos asociados:

- **contador:** registra una cantidad;
- **acumulador:** conserva una suma progresiva;
- **índice:** identifica la repetición actual;
- **inicialización:** establece el valor antes del bucle.

### Ejemplo guiado

Revisa `pseint/04-bucles-para/promedio-temperaturas.psc`.

Para `n = 3` y temperaturas `18`, `20` y `22`:

| Iteración | `temp` | `suma` |
|---:|---:|---:|
| inicial | — | 0 |
| 1 | 18 | 18 |
| 2 | 20 | 38 |
| 3 | 22 | 60 |

Después del bucle, `prom = 60 / 3 = 20`. La validación `n > 0` evita dividir entre cero.

### Errores frecuentes

- no inicializar el acumulador;
- reinicializarlo dentro del bucle;
- ejecutar una repetición adicional;
- dividir dentro del bucle cuando se necesita el total final;
- modificar accidentalmente la variable de control.

Reto: `practica/retos.md`, bloque 4.

## 5. Repetición condicionada con `Mientras`

`Mientras` comprueba la condición antes de ejecutar. Puede no ejecutarse ninguna vez.

```text
Mientras condicion Hacer
    acciones
    actualizar la condicion
FinMientras
```

Es adecuado cuando no se conoce la cantidad exacta de repeticiones y la continuación depende del estado actual.

### Ejemplo guiado

Revisa `pseint/05-bucles-mientras/conteo-cifras.psc`.

Para `num = 508`:

| Iteración | `num` después de dividir | `contador` |
|---:|---:|---:|
| inicial | 508 | 0 |
| 1 | 50 | 1 |
| 2 | 5 | 2 |
| 3 | 0 | 3 |

El valor cero requiere tratamiento especial porque el bucle no se ejecutaría, aunque cero tiene una cifra.

### Errores frecuentes

- no actualizar la variable de la condición;
- construir un bucle infinito;
- perder el valor original cuando después vuelve a necesitarse;
- no considerar que el cuerpo puede ejecutarse cero veces.

Reto: `practica/retos.md`, bloque 5.

## 6. Validación con `Repetir`

`Repetir` ejecuta primero y evalúa la condición al final. Por eso siempre se ejecuta al menos una vez.

```text
Repetir
    leer dato
Hasta Que dato sea valido
```

Es especialmente útil para solicitar un dato hasta que pertenezca a un rango o conjunto permitido.

### Ejemplo guiado

Revisa `pseint/06-bucles-repetir/validar-edad.psc`.

La condición permite edades entre 18 y 120, inclusive. Una prueba adecuada puede ingresar `15`, luego `121` y finalmente `30`. El algoritmo debe continuar solicitando hasta recibir `30`.

### Errores frecuentes

- escribir una condición de salida invertida;
- aceptar solo uno de los límites;
- no informar al usuario cuál es el rango válido;
- usar un rango distinto en el mensaje y en la condición.

Reto: `practica/retos.md`, bloque 6.

## 7. Integración de estructuras

Un problema completo puede necesitar:

- `Repetir` para validar datos;
- `Para` para procesar una cantidad conocida de registros;
- `Segun` para clasificar una opción;
- `Si` para aplicar una regla;
- contadores y acumuladores para construir un resumen.

Cada estructura debe tener una responsabilidad reconocible. Combinar estructuras no significa anidarlas sin límite.

### Ejemplo guiado

Revisa `pseint/07-practica-integrada/biblioteca-libros.psc`.

Identifica antes de ejecutarlo:

1. qué datos se validan con `Repetir`;
2. qué controla el `Para`;
3. qué clasifica el `Segun`;
4. qué regla aplica el `Si`;
5. qué variables son contadores;
6. qué variable es un acumulador.

Prueba mínima:

- un préstamo de ficción;
- dos días;
- estudiante;
- costo antes del descuento: S/ 1.00;
- descuento: S/ 0.20;
- costo esperado: S/ 0.80.

Reto: `practica/retos.md`, bloque 7. Después, desarrolla `practica/laboratorio-integrador.md`.

## Criterio de dominio

No basta con que el algoritmo termine. Debes poder:

- explicar por qué elegiste cada estructura;
- anticipar qué ocurre con datos límite e inválidos;
- realizar una prueba de escritorio;
- reconocer si una variable es entrada, control, contador, acumulador o resultado;
- corregir un error sin reemplazar toda la solución;
- comparar tu intento con la referencia y justificar las diferencias.
