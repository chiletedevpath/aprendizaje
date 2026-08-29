import scala.collection.immutable.TreeSet

object ValoresOrdenados:
  def main(args: Array[String]): Unit =
    val valores = TreeSet(50, 30, 70, 20, 40)
    // TreeSet mantiene los elementos ordenados y evita duplicados.
    println(valores)
    println(s"Mínimo: ${valores.head}, máximo: ${valores.last}")
