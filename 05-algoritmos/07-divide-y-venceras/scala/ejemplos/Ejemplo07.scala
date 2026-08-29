object MaximoDivideVenceras:
  def maximo(a: Array[Int], l: Int, r: Int): Int =
    if l == r then a(l)
    else
      val m=l+(r-l)/2
      math.max(maximo(a,l,m), maximo(a,m+1,r))
  @main def ejecutar(): Unit = { val a=Array(12,4,31,8,19,6); println(maximo(a,0,a.length-1)) }
