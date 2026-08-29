object PruebasYDepuracionBasica:
  def maximo(a: Int, b: Int): Int =
    if a >= b then a else b

  def main(args: Array[String]): Unit =
    // assert detiene la ejecución si la condición comprobada es falsa.
    assert(maximo(9, 4) == 9, "valores distintos")
    assert(maximo(7, 7) == 7, "empate")
    assert(maximo(-2, -8) == -2, "negativos")

    println("Todos los casos pasaron correctamente.")
