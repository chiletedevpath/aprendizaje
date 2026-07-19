# Base Conceptual

Antes de aprender la sintaxis de un lenguaje, conviene entender qué hace una solución informática y cómo se construye una respuesta ordenada frente a un problema.

Este material no requiere experiencia previa ni contiene código. Su propósito es preparar el razonamiento que se aplicará en pseudocódigo y programación.

## 1. Datos, información y soluciones

Un **dato** es una representación básica de un hecho: un nombre, una cantidad, una fecha o una respuesta.

La **información** aparece cuando los datos se organizan y adquieren significado. Por ejemplo, `18`, `20` y `17` son datos; al indicar que son notas de tres prácticas y calcular su promedio, obtenemos información útil para evaluar un avance.

Una solución informática recibe datos, aplica reglas y produce un resultado. No todo problema necesita software, pero todo software debe responder a una necesidad concreta.

### Ejemplo

Una biblioteca quiere saber si puede prestar un libro.

- Datos: estado del libro, cantidad disponible y situación del usuario.
- Reglas: debe existir una copia disponible y el usuario no debe estar suspendido.
- Resultado: préstamo autorizado o rechazado, con un motivo comprensible.

## 2. Problema, objetivo y resultado esperado

Un **problema** describe una situación que debe cambiar, resolverse o comprenderse. Antes de proponer pasos, hay que delimitarlo.

Una definición útil responde:

- ¿Qué sucede actualmente?
- ¿A quién afecta?
- ¿Qué resultado se necesita?
- ¿Qué condiciones deben cumplirse?
- ¿Qué queda fuera de la solución?

El **objetivo** expresa el cambio que se busca. El **resultado esperado** permite comprobar si la solución realmente cumplió ese objetivo.

### Ejemplo

Problema impreciso:

> Hay que organizar las tareas.

Problema delimitado:

> Un estudiante registra tareas en notas separadas y olvida algunas fechas. Necesita ordenar cada tarea por curso, fecha límite y estado.

Resultado esperado:

> Poder consultar las tareas pendientes y reconocer cuáles vencen primero.

## 3. Requisitos, reglas, restricciones y supuestos

Estos conceptos evitan resolver un problema distinto al planteado:

- **Requisito:** capacidad que la solución debe ofrecer.
- **Regla:** condición que determina cómo debe comportarse.
- **Restricción:** límite que no puede ignorarse.
- **Supuesto:** condición que se acepta como verdadera mientras no exista información contraria.

### Ejemplo

Para calcular el costo de una compra:

- Requisito: obtener el total a pagar.
- Regla: multiplicar cada precio por su cantidad.
- Restricción: una cantidad no puede ser negativa.
- Supuesto: los precios ya incluyen la moneda correcta.

Los supuestos deben declararse. Ocultarlos puede producir soluciones aparentemente correctas que fallan al usarse en otro contexto.

## 4. Pensamiento computacional

El pensamiento computacional ayuda a convertir un problema en una secuencia comprensible. No consiste en pensar como una computadora, sino en organizar el razonamiento para que una solución pueda explicarse, verificarse y, más adelante, programarse.

### Descomposición

Consiste en dividir un problema en partes manejables.

Para registrar una venta se puede separar:

1. Identificar el producto.
2. Verificar la cantidad disponible.
3. Calcular el subtotal.
4. Actualizar el inventario.
5. Informar el resultado.

### Reconocimiento de patrones

Busca similitudes entre problemas o situaciones. Si varias operaciones necesitan validar que una cantidad sea positiva, existe un patrón que puede resolverse de manera consistente.

Reconocer patrones no significa copiar una solución. Significa identificar qué razonamiento puede reutilizarse y qué parte cambia según el contexto.

### Abstracción

Consiste en conservar los datos y reglas relevantes, dejando fuera detalles que no afectan la solución actual.

Para calcular el costo de envío puede importar el peso, el destino y el tipo de entrega. El color del paquete probablemente no sea relevante.

Abstraer bien requiere criterio: eliminar un dato necesario produce una solución incompleta; conservar todos los detalles produce ruido.

### Secuencia lógica

Ordena las acciones para que cada paso tenga la información que necesita. No se puede calcular un promedio antes de conocer las notas ni autorizar una reserva antes de comprobar disponibilidad.

## 5. Entrada, proceso y salida

El modelo **entrada, proceso y salida** permite explicar una solución de forma inicial:

- **Entrada:** datos que recibe la solución.
- **Proceso:** reglas y operaciones que transforman esos datos.
- **Salida:** resultado que se entrega.

### Ejemplo

Problema: calcular el promedio de tres notas.

- Entrada: tres notas válidas.
- Proceso: sumar las notas y dividir el total entre tres.
- Salida: promedio obtenido.

Este modelo es útil, pero no reemplaza el análisis. También deben considerarse validaciones, restricciones y casos de prueba.

## 6. Validación y casos de prueba

**Validar** significa comprobar que un dato cumple las condiciones necesarias antes de procesarlo.

Un **caso de prueba** combina datos de entrada y un resultado esperado. Sirve para verificar el comportamiento de una solución.

Conviene preparar al menos:

- un caso normal;
- un caso en un límite permitido;
- un dato inválido;
- un caso vacío o ausente, si corresponde.

### Ejemplo

Regla: una nota debe estar entre 0 y 20.

| Caso | Entrada | Resultado esperado |
|---|---:|---|
| Normal | 15 | Aceptar la nota |
| Límite inferior | 0 | Aceptar la nota |
| Límite superior | 20 | Aceptar la nota |
| Inválido | 25 | Rechazar la nota |
| Ausente | sin valor | Solicitar el dato |

Probar no consiste en confirmar solamente que la solución funciona. También busca descubrir en qué condiciones falla.

## 7. Tipos de error

Antes de programar ya pueden existir errores:

- **Error de comprensión:** se interpretó mal la necesidad.
- **Error de datos:** la entrada está incompleta, duplicada o fuera del rango permitido.
- **Error lógico:** los pasos no producen el resultado esperado.
- **Error de secuencia:** una acción ocurre antes de contar con la información necesaria.

Al programar aparecerán además errores de sintaxis y de ejecución. La primera habilidad no es memorizar mensajes, sino aprender a observar, formular una hipótesis y comprobar un cambio a la vez.

## 8. De la solución explicada al algoritmo

Una solución está preparada para convertirse en algoritmo cuando:

- el problema está delimitado;
- las entradas y salidas son claras;
- las reglas no se contradicen;
- los pasos tienen un orden;
- los datos inválidos están considerados;
- existen casos de prueba con resultados esperados;
- otra persona puede leer la explicación y seguirla.

En `01-pseudocodigo` estos pasos se expresarán con variables, decisiones y repeticiones. El objetivo no será decorar una respuesta con palabras técnicas, sino representar un razonamiento que ya fue comprendido.

## 9. Organización y control de cambios

Un ejercicio debe poder encontrarse y revisarse. Usa nombres que indiquen tema y propósito, por ejemplo:

- `calculo-promedio`
- `validacion-nota`
- `control-inventario`

Git permite registrar cambios y conservar el historial del trabajo. Un commit útil representa un avance concreto y explica qué cambió. El libro oficial [Pro Git](https://git-scm.com/book/es/v2/Inicio---Sobre-el-Control-de-Versiones-Acerca-del-Control-de-Versiones) amplía el propósito del control de versiones.

## Síntesis

Antes de resolver, pregunta:

1. ¿Cuál es el problema real?
2. ¿Qué resultado se espera?
3. ¿Qué datos entran?
4. ¿Qué reglas y límites existen?
5. ¿Cómo puedo dividirlo?
6. ¿Qué pasos transforman la entrada en salida?
7. ¿Con qué casos comprobaré la solución?
8. ¿Puedo explicarla sin depender de una copia?

Si estas respuestas son claras, ya existe una base para avanzar a pseudocódigo.
