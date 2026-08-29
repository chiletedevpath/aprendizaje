import scala.io.StdIn.readLine
import scala.util.Try

@main def retoEdadValida(): Unit =
  var valida = false
  while !valida do
    val entrada = readLine("Edad: ").trim
  // Try convierte un posible fallo de conversión en un resultado que puede evaluarse.
    Try(entrada.toInt).toOption match
      case Some(edad) if edad >= 0 && edad <= 120 =>
        println(s"Edad válida: $edad")
        valida = true
      case Some(_) => println("Edad fuera de rango")
      case None => println("Debe ingresar un número entero")
