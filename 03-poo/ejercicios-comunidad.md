# Retos de programación orientada a objetos

Cada bloque conecta un ejemplo resuelto con un reto nuevo. Modela primero en
papel o UML y consulta la referencia únicamente después de intentar tu solución.

## 1. Clases y objetos

Referencias:

- `clases-objetos/java/rectangulo-basico`
- `clases-objetos/java/libro-basico`

Reto: crea una clase `Curso` con título, duración y nivel, más un método que
devuelva su ficha. Prueba dos objetos con datos diferentes.

Casos: duración normal, duración mínima y valores inválidos que luego protegerás
en encapsulamiento.

## 2. Encapsulamiento

Referencia: `encapsulamiento/java/productos-validacion`.

Reto: crea `ProgresoAprendiz` y garantiza que el avance siempre esté entre 0 y
100. El constructor y cualquier actualización deben respetar la misma regla.

Casos: `0`, `50`, `100`, `-1` y `101`.

## 3. Herencia

Referencia: `herencia/java/jerarquia-personas`.

Reto: modela `UsuarioComunidad` como clase base y especialízala en `Aprendiz` y
`Mentor`. Sobrescribe un método que describa la responsabilidad de cada tipo.

Casos: procesa ambos objetos desde referencias `UsuarioComunidad` y explica qué
miembros se heredan.

## 4. Abstracción

Referencias:

- `abstraccion/java/figuras-abstractas`
- `abstraccion/java/interfaces-y-pagos`
- `abstraccion/java/interfaces-voladores`

Reto: crea una clase abstracta `Actividad` y una interfaz `Evaluable`. Implementa
una actividad teórica y otra práctica con distinto cálculo de puntaje.

Casos: puntaje mínimo, máximo y dato fuera de rango.

## 5. Polimorfismo

Referencias:

- `polimorfismo/java/notificaciones-polimorficas`
- `polimorfismo/java/publicaciones-feed`
- `polimorfismo/java/figuras-abstractas-interfaces`

Reto: guarda distintas actividades en un arreglo del tipo común y ejecuta el
mismo método en todas. No uses `if` para elegir el comportamiento.

Casos: al menos dos implementaciones y una tercera agregada sin modificar el
bucle que las procesa.

## 6. Enumeraciones y genéricos

Referencias:

- `clases-objetos/java/enumeraciones-aplicadas`
- `clases-objetos/java/caja-generica`

Reto: crea `NivelDificultad` como enum y una `Caja<T>` que pueda guardar un
recurso de cualquier tipo manteniendo seguridad de tipos.

Casos: caja de texto, caja de número e intento de asignar un tipo incompatible.

## 7. Cierre integrado

Resuelve `laboratorio-integrador.md`. La implementación de referencia está en
`mini-proyectos/java/seguimiento-aprendizaje`.

## Criterios de logro

- cada clase tiene una responsabilidad concreta;
- el objeto nunca queda en un estado inválido;
- la herencia representa una relación “es un” justificable;
- las interfaces expresan capacidades y no datos;
- el polimorfismo evita decisiones basadas en el tipo concreto;
- puedes defender el modelo y sus límites sin leer el código línea por línea.
