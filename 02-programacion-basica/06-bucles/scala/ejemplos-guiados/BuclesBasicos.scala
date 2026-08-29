object BuclesBasicos:
  def main(args: Array[String]): Unit =
    var suma = 0

    // El rango 1 to 5 incluye ambos extremos.
    for i <- 1 to 5 do
      suma += i

    var cuenta = 3
    while cuenta > 0 do
      println(s"Cuenta: $cuenta")
      cuenta -= 1

    println(s"Suma 1..5 = $suma")
