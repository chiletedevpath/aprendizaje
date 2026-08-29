import scala.collection.mutable.HashMap

object HashMapBasico:
  def main(args: Array[String]): Unit =
    val intentos = HashMap("ana" -> 2, "luis" -> 1)
    // HashMap usa el hash de la clave para organizar el acceso interno.
    println(intentos("ana"))
