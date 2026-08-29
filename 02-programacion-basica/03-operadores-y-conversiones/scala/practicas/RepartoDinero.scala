import scala.io.StdIn.readDouble

object RepartoDinero {
  def main(args: Array[String]): Unit = {
    print("Ingrese la cantidad de dinero a repartir: ")
    val montoTotal = readDouble()

    val juan = montoTotal * 0.45
    val pedro = juan * 0.60
    val luis = montoTotal - juan - pedro

    println(s"Juan recibe: S/ $juan")
    println(s"Pedro recibe: S/ $pedro")
    println(s"Luis recibe: S/ $luis")
  }
}
