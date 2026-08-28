import scala.io.StdIn.readDouble

object RepartoDinero {

  def main(args: Array[String]): Unit = {

    // Ingresar el monto total
    print("Ingrese la cantidad de dinero a repartir: ")
    val montoTotal = readDouble()

    // Juan recibe el 45% del total
    val juan = montoTotal * 0.45

    // Pedro recibe el 60% de lo recibido por Juan
    val pedro = juan * 0.60

    // Luis recibe el dinero restante
    val luis = montoTotal - juan - pedro

    println(s"Juan recibe: S/ $juan")
    println(s"Pedro recibe: S/ $pedro")
    println(s"Luis recibe: S/ $luis")
  }
}
