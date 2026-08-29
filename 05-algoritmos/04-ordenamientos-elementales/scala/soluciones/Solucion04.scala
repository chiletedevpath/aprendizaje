object InsertionSort:
  def ordenar(a: Array[Int]): Unit =
    for i <- 1 until a.length do
      val actual = a(i); var j = i - 1
      while j >= 0 && a(j) > actual do
        a(j + 1) = a(j); j -= 1
      a(j + 1) = actual
  @main def ejecutar(): Unit = { val a=Array(8,3,5,1,7); ordenar(a); println(a.mkString(", ")) }
