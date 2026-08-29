def sumar(a: Int, b: Int): Int =
  // La última expresión de una función puede convertirse en su retorno.
  a + b

@main def funcionConRetorno(): Unit =
  println(s"Total: ${sumar(8, 4)}")
