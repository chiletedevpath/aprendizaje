object NumerosPares {
  def main(args: Array[String]): Unit = {
    val numeros = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val pares = numeros.filter(numero => numero % 2 == 0)

    println("Números pares: " + pares)
  }
}
