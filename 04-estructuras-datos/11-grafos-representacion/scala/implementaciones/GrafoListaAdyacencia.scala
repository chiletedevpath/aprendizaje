import scala.collection.mutable

final class GrafoListaAdyacencia:
  private val adyacencias = mutable.Map.empty[String, mutable.Set[String]]

  def conectar(a: String, b: String): Unit =
    // Un grafo no dirigido registra la conexión en ambos sentidos.
    adyacencias.getOrElseUpdate(a, mutable.LinkedHashSet.empty) += b
    adyacencias.getOrElseUpdate(b, mutable.LinkedHashSet.empty) += a

  def vecinos(v: String): Set[String] = adyacencias.get(v).map(_.toSet).getOrElse(Set.empty)
