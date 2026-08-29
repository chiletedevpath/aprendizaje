object FactorialRecursivo:
  def factorial(n: Int): BigInt =
    require(n >= 0)
    // El caso base impide que la recursión continúe indefinidamente.
    if n <= 1 then 1 else n * factorial(n - 1)
  @main def ejecutar(): Unit = println(factorial(5))
