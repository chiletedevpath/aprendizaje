object Practica01:
  def esPrimo(n: Int): Boolean =
    if n < 2 then false
    else !(2 to math.sqrt(n).toInt).exists(n % _ == 0)
  @main def ejecutar(): Unit = println(esPrimo(97))
