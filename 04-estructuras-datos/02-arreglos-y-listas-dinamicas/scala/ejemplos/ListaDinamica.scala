import scala.collection.mutable.ArrayBuffer

object ListaDinamica:
  def main(args: Array[String]): Unit =
    val cursos = ArrayBuffer.empty[String]
    // ArrayBuffer permite crecer y modificar una secuencia indexada.
    cursos += "Scala"
    cursos += "Java"
    println(cursos(1))
