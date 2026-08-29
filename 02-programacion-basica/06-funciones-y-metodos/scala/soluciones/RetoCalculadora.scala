def sumarReto(a: Double, b: Double): Double = a + b
def restarReto(a: Double, b: Double): Double = a - b
def multiplicarReto(a: Double, b: Double): Double = a * b
def dividirReto(a: Double, b: Double): Double =
  // require detiene la función si el divisor no cumple la precondición.
  require(b != 0, "Divisor igual a cero")
  a / b

@main def retoCalculadora(): Unit =
  println(sumarReto(8, 2))
  println(restarReto(8, 2))
  println(multiplicarReto(8, 2))
  println(dividirReto(8, 2))
