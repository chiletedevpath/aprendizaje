import scala.io.StdIn.readLine

@main def leerNombre(): Unit =
  // readLine() obtiene texto desde la entrada estándar.
  val nombre = readLine("Nombre: ").trim
  println(s"Bienvenido, $nombre.")
