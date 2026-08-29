import scala.collection.mutable.ArrayDeque

object Pila:
  def main(args: Array[String]): Unit =
    val pila = ArrayDeque.empty[String]
    // prepend y removeHead permiten usar ArrayDeque como pila LIFO.
    pila.prepend("Inicio")
    pila.prepend("Cursos")
    println(pila.removeHead())
