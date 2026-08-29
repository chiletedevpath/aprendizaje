@main def practicaConversorTemperatura(): Unit =
  val celsius = 25.0
  // 9.0 / 5.0 mantiene la operación en tipo decimal.
  val fahrenheit = celsius * 9.0 / 5.0 + 32
  println(f"$celsius%.1f °C = $fahrenheit%.1f °F")
