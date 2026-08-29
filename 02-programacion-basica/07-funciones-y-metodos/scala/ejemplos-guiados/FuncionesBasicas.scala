object FuncionesBasicas:
  def calcularPromedio(a: Double, b: Double, c: Double): Double =
    (a + b + c) / 3.0

  def clasificar(promedio: Double): String =
    if promedio >= 11 then "Aprobado" else "Desaprobado"

  def main(args: Array[String]): Unit =
    val promedio = calcularPromedio(14, 16, 18)
    println(f"Promedio: $promedio%.2f | ${clasificar(promedio)}")
