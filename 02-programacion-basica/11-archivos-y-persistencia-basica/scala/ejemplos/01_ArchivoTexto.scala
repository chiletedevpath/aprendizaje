import java.nio.file.{Files, Path}

@main def archivoTexto(): Unit =
  val archivo = Path.of("devpath-demo.txt")

  // Files.writeString persiste texto en una ruta del sistema.
  Files.writeString(archivo, "Programación básica")
  val contenido = Files.readString(archivo)
  println(contenido)
  Files.deleteIfExists(archivo)
