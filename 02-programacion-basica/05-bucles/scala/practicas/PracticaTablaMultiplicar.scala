@main def practicaTablaMultiplicar(): Unit =
  val numero = 7
  // El rango 1 to 12 define una cantidad conocida de repeticiones.
  for i <- 1 to 12 do
    println(s"$numero x $i = ${numero * i}")
