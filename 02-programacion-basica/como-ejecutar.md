# Cómo ejecutar los ejemplos

## Java

Los ejemplos no usan paquetes para mantener el foco en programación básica.

```bash
javac NombreArchivo.java
java NombreArchivo
```

También pueden ejecutarse desde IntelliJ IDEA creando una clase Java con el mismo nombre del archivo.

## Scala

Los ejemplos utilizan **Scala 3**. En IntelliJ IDEA puedes crear un proyecto Scala con `sbt` y colocar el archivo dentro de `src/main/scala`.

Con Scala CLI, si está disponible en el entorno:

```bash
scala-cli run NombreArchivo.scala
```

## Qué observar al ejecutar

No basta con obtener una salida. Para cada ejemplo identifica:

1. qué datos entran;
2. qué transformación realiza el programa;
3. qué resultado produce;
4. qué dato podría romper la solución;
5. qué parte pertenece al concepto y qué parte es sintaxis del lenguaje.
