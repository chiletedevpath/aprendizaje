object OperadoresYPrecedencia:
  def main(args: Array[String]): Unit =
    val a = 8
    val b = 3

    val porPrecedencia = a + b * 2
    val conParentesis = (a + b) * 2
    val condicion = a > b && b != 0

    println(s"Precedencia: $porPrecedencia")
    println(s"Con paréntesis: $conParentesis")
    println(s"Condición: $condicion")
