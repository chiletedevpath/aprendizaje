import scala.io.StdIn.readLine

@main def practicaFichaBasica(): Unit =
  // readLine devuelve texto; toInt convierte la edad cuando el formato es válido.
  val nombre = readLine("Nombre: ").trim
  val edad = readLine("Edad: ").trim.toInt
  println(s"$nombre tiene $edad años")
