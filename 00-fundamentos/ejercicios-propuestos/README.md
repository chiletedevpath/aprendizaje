# Ejercicios Propuestos

Estos ejercicios permiten comprobar si puedes analizar un problema antes de escribir pseudocódigo. Responde con tus propias palabras y justifica tus decisiones.

No revises `../ejercicios-resueltos/` hasta terminar un primer intento.

## Bloque 1: Comprender el problema

### Ejercicio 1: Del dato a la información

Una lista contiene estos valores:

```txt
12, 18, 15, 10, 20
```

Responde:

- ¿Por qué estos valores, sin contexto, son solo datos?
- Agrega un contexto que permita interpretarlos.
- Obtén una información útil a partir de ellos.
- Indica una decisión que podría tomarse con esa información.

### Ejercicio 2: Delimitar una necesidad

Lee esta frase:

> Necesito una aplicación para organizarme mejor.

Formula al menos cinco preguntas que permitan descubrir el problema real. Después, reescribe la necesidad indicando:

- situación actual;
- persona afectada;
- objetivo;
- resultado esperado;
- aspecto que quedará fuera de la primera solución.

### Ejercicio 3: Requisitos y límites

Una biblioteca desea registrar préstamos de libros. Clasifica cada afirmación como requisito, regla, restricción o supuesto:

1. El sistema debe registrar la fecha del préstamo.
2. Solo se presta un libro si existe una copia disponible.
3. La primera versión no enviará notificaciones.
4. Se considera que cada libro ya tiene un código único.

Explica por qué elegiste cada categoría.

## Bloque 2: Organizar una solución

### Ejercicio 4: Descomponer una reserva

Una persona quiere reservar una cita en un centro de salud.

Divide el problema en partes pequeñas desde la solicitud hasta la confirmación. Identifica qué pasos dependen de otros y qué podría impedir la reserva.

### Ejercicio 5: Elegir lo relevante

Para calcular el precio de entrega de un paquete se conocen:

- peso;
- destino;
- tipo de entrega;
- color de la caja;
- nombre de quien preparó el paquete;
- dimensiones;
- nivel de urgencia.

Clasifica los datos en:

- necesarios;
- posiblemente necesarios;
- irrelevantes para este cálculo.

Explica qué información adicional necesitarías antes de decidir.

### Ejercicio 6: Entrada, proceso y salida

Analiza un sistema que determina si una persona aprueba un curso usando tres notas y una nota mínima aprobatoria.

Identifica:

- entradas;
- validaciones;
- proceso;
- salida;
- reglas;
- supuesto que debería confirmarse.

No escribas código ni pseudocódigo.

## Bloque 3: Comprobar el razonamiento

### Ejercicio 7: Diseñar casos de prueba

Una tienda aplica envío gratuito cuando el total de la compra es igual o mayor a S/ 100.

Propón:

- dos casos normales;
- un caso límite;
- dos casos inválidos;
- el resultado esperado para cada caso.

### Ejercicio 8: Encontrar el error lógico

Se propone esta secuencia para calcular el promedio de tres notas:

1. Dividir la primera nota entre tres.
2. Sumar las otras dos notas.
3. Mostrar el resultado.

Responde:

- ¿Qué tipo de error existe?
- ¿Por qué la secuencia no representa el cálculo correcto?
- ¿Cómo debería ordenarse?
- ¿Con qué caso de prueba demostrarías la corrección?

### Ejercicio 9: Revisar una solución incompleta

Una solución para retirar dinero de un cajero indica:

1. Leer el monto solicitado.
2. Restar el monto del saldo.
3. Entregar el dinero.

Identifica al menos cuatro condiciones que faltan. Diferencia entre validaciones de datos, reglas del negocio y posibles resultados.

## Bloque 4: Dejar evidencia

### Ejercicio 10: Explicar una práctica

Elige uno de los ejercicios anteriores y registra:

- problema con tus palabras;
- decisiones tomadas;
- supuesto utilizado;
- caso que reveló una dificultad;
- corrección realizada;
- aprendizaje final.

Usa `../plantilla-evidencia.md` solo si te ayuda a ordenar la respuesta.

## Criterio de revisión

Una respuesta está bien desarrollada cuando:

- no inventa reglas sin declararlas;
- diferencia datos, pasos y resultados;
- explica el porqué de cada decisión;
- considera más de un escenario;
- puede entenderse sin conocer la respuesta de antemano.
