import scala.collection.mutable
object VentanaDeslizante:
  def longitud(s:String):Int =
    val set=mutable.Set[Char](); var izq=0; var mejor=0
    for der <- s.indices do
      while set.contains(s(der)) do set.remove(s(izq)); izq += 1
      set.add(s(der)); mejor=math.max(mejor, der-izq+1)
    mejor
  @main def ejecutar():Unit = println(longitud("chilete"))
