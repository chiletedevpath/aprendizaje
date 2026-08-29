object Practica03:
  def lineal(a: Array[Int], x: Int): Int = a.indexWhere(_ == x)
  def binaria(a: Array[Int], x: Int): Int =
    var l=0; var r=a.length-1
    while l<=r do
      val m=l+(r-l)/2
      if a(m)==x then return m
      if a(m)<x then l=m+1 else r=m-1
    -1
  @main def ejecutar():Unit =
    val a=(0 until 1000).toArray
    println(s"lineal=${lineal(a,999)}, binaria=${binaria(a,999)}")
