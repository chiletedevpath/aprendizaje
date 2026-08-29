object Practica10:
  def formas(n:Int):BigInt =
    if n<=1 then 1
    else
      var a=BigInt(1); var b=BigInt(1)
      for _ <- 2 to n do { val c=a+b; a=b; b=c }
      b
  @main def ejecutar():Unit = println(formas(10))
