object FibonacciDinamico:
  def tabular(n:Int): BigInt =
    if n <= 1 then n
    else
      val dp=Array.fill[BigInt](n+1)(0); dp(1)=1
      for i <- 2 to n do dp(i)=dp(i-1)+dp(i-2)
      dp(n)
  @main def ejecutar(): Unit = println(tabular(40))
