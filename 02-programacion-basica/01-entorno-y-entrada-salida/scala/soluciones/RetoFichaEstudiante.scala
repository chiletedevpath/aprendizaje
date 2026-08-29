import scala.io.StdIn.readLine

@main def retoFichaEstudiante(): Unit =
  // readLine conecta la solución con la entrada estándar.
  val nombre = readLine("Nombre: ").trim
  val edad = readLine("Edad: ").trim.toInt
  val carrera = readLine("Carrera: ").trim
  println(s"\nNombre: $nombre\nEdad: $edad\nCarrera: $carrera")
