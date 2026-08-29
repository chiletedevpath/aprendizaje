def convertirSolesADolares(soles: Double, tipoCambio: Double): Double =
  // require valida una precondición antes de ejecutar el cálculo.
  require(tipoCambio > 0, "Tipo de cambio inválido")
  soles / tipoCambio

@main def practicaConversorMoneda(): Unit =
  val resultado = convertirSolesADolares(100.0, 3.75)
  println(f"USD $resultado%.2f")
