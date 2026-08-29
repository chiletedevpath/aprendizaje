@main def operadores(): Unit =
  val a = 17
  val b = 5

  // % devuelve el residuo de una división.
  val residuo = a % b
  val rangoValido = a >= 0 && a <= 20

  println(s"suma=${a + b}, residuo=$residuo, rango=$rangoValido")
