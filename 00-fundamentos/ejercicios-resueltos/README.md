# Ejercicios Resueltos

Estas respuestas muestran un enfoque posible. Compáralas con tu razonamiento: una redacción diferente también puede ser válida si respeta el problema y justifica sus decisiones.

## Solución 1: Del dato a la información

Los valores no indican qué representan, por eso todavía son datos sin contexto.

Contexto posible: notas de cinco prácticas de un curso con escala de 0 a 20.

Información obtenida:

```txt
promedio = (12 + 18 + 15 + 10 + 20) / 5 = 15
```

Decisión posible: el promedio es aprobatorio si la nota mínima es 13.

La decisión solo es válida después de conocer la escala y la regla de aprobación.

## Solución 2: Delimitar una necesidad

Preguntas posibles:

- ¿Qué actividades necesita organizar?
- ¿Qué problema ocurre con el método actual?
- ¿Con qué frecuencia olvida o retrasa una actividad?
- ¿Necesita fechas, prioridades o recordatorios?
- ¿Usará la solución una sola persona?

Necesidad delimitada:

> Un estudiante registra tareas en mensajes y notas separadas, por lo que pierde fechas importantes. Necesita consultar sus tareas por curso, fecha límite y estado. La primera versión permitirá registrar y ordenar tareas, pero no enviará recordatorios automáticos.

La nueva versión permite reconocer el problema, el objetivo y el alcance inicial.

## Solución 3: Requisitos y límites

1. **Requisito:** registrar la fecha es una capacidad esperada.
2. **Regla:** la disponibilidad determina si el préstamo se autoriza.
3. **Restricción de alcance:** las notificaciones quedan fuera de la primera versión.
4. **Supuesto:** se acepta temporalmente que los códigos ya existen y son únicos.

Un supuesto debería comprobarse antes de depender de él en una solución real.

## Solución 4: Descomponer una reserva

Partes posibles:

1. Identificar a la persona.
2. Elegir especialidad o tipo de atención.
3. Consultar profesionales disponibles.
4. Consultar fechas y horarios.
5. Seleccionar un horario.
6. Verificar que continúe disponible.
7. Registrar la reserva.
8. Mostrar la confirmación.

La confirmación depende de que el horario siga disponible. La falta de datos de la persona, un horario ocupado o una fecha inválida pueden impedir la reserva.

## Solución 5: Elegir lo relevante

Necesarios:

- peso;
- destino;
- tipo de entrega.

Posiblemente necesarios:

- dimensiones;
- nivel de urgencia.

Irrelevantes para el cálculo planteado:

- color de la caja;
- nombre de quien preparó el paquete.

Falta conocer las tarifas y reglas aplicables. Sin ellas no se puede afirmar qué dato determina el precio.

## Solución 6: Entrada, proceso y salida

- Entradas: tres notas y nota mínima aprobatoria.
- Validaciones: todas las notas deben existir y pertenecer al rango permitido.
- Proceso: sumar las tres notas, dividir entre tres y comparar el promedio con la nota mínima.
- Salida: promedio y condición de aprobado o no aprobado.
- Reglas: la aprobación ocurre cuando el promedio alcanza la nota mínima.
- Supuesto por confirmar: las tres notas tienen el mismo peso.

Si las notas tuvieran porcentajes distintos, el proceso tendría que cambiar.

## Solución 7: Diseñar casos de prueba

| Tipo | Entrada | Resultado esperado |
|---|---:|---|
| Normal | S/ 125 | Envío gratuito |
| Normal | S/ 80 | Envío con costo |
| Límite | S/ 100 | Envío gratuito |
| Inválido | S/ -10 | Rechazar el total |
| Inválido | sin valor | Solicitar o informar el dato faltante |

El caso de S/ 100 comprueba el significado de “igual o mayor”.

## Solución 8: Encontrar el error lógico

Existe un error lógico y de secuencia. Dividir solo la primera nota no equivale a dividir la suma completa.

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

## Solución 9: Revisar una solución incompleta

Validaciones de datos:

- el monto debe existir;
- debe ser numérico;
- debe ser mayor que cero.

Reglas del negocio:

- el saldo debe ser suficiente;
- el monto debe respetar las denominaciones disponibles;
- podría existir un límite diario;
- la cuenta debe estar habilitada.

Resultados posibles:

- retiro aprobado;
- saldo insuficiente;
- monto inválido;
- límite excedido;
- operación no disponible.

La secuencia original asume que todo retiro es válido y puede dejar un saldo incorrecto.

## Solución 10: Explicar una práctica

Ejemplo usando el ejercicio 7:

- Problema: decidir si una compra recibe envío gratuito.
- Decisión: comparar el total válido con el límite de S/ 100.
- Supuesto: el total ya está expresado en soles.
- Dificultad: interpretar si exactamente S/ 100 recibe el beneficio.
- Corrección: considerar la expresión “igual o mayor”.
- Aprendizaje: un caso límite permite verificar una regla que podría interpretarse mal.

La evidencia explica el razonamiento y la corrección; no se limita a afirmar que el ejercicio fue completado.
