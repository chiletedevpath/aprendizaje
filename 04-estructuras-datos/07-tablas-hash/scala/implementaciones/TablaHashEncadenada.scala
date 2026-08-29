import scala.collection.mutable.ArrayBuffer

final class TablaHashEncadenada[K, V](capacidad: Int):
  private val cubetas = Array.fill(capacidad)(ArrayBuffer.empty[(K, V)])

  private def indice(clave: K): Int = Math.floorMod(clave.##, capacidad)

  def put(clave: K, valor: V): Unit =
    val cubeta = cubetas(indice(clave))
    cubeta.indexWhere(_._1 == clave) match
      case -1 => cubeta += ((clave, valor))
      case i  => cubeta(i) = ((clave, valor))

  def get(clave: K): Option[V] =
    // La colisión se resuelve buscando la clave dentro de su cubeta.
    cubetas(indice(clave)).find(_._1 == clave).map(_._2)
