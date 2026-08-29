import scala.util.Try

object ManejoErroresEntrada:
  def convertirEntero(texto: String): Option[Int] =
    // Try captura el posible fallo de conversión; toOption lo expresa sin usar null.
    Try(texto.trim.toInt).toOption

  def main(args: Array[String]): Unit =
    val entrada = "20x"

    convertirEntero(entrada) match
      case Some(valor) => println(s"Valor: $valor")
      case None        => println("Entrada inválida: se esperaba un entero.")
