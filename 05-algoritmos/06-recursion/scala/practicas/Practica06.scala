object Practica06:
  def sumaDigitos(n:Int):Int =
    val x=math.abs(n)
    if x<10 then x else x%10+sumaDigitos(x/10)
  @main def ejecutar():Unit = println(sumaDigitos(2026))
