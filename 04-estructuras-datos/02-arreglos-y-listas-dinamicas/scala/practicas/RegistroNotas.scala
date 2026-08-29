import scala.collection.mutable.ArrayBuffer
object RegistroNotas:
  def main(args:Array[String]):Unit =
    val notas=ArrayBuffer(14,16,18); notas += 20; println(notas.sum.toDouble/notas.size)
