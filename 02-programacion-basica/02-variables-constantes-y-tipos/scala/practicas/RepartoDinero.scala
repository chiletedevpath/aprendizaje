import scala.io.StdIn.readDouble

object RepartoDinero {

  def main(args: Array[String]): Unit = {

    // readDouble() lee un valor decimal desde la entrada estándar.
    print("Ingrese la cantidad de dinero a repartir: ")
    val montoTotal = readDouble()

    // 0.45 representa 45% en formato decimal.
    val juan = montoTotal * 0.45

    // El segundo porcentaje se calcula sobre el monto de Juan, no sobre el total.
    val pedro = juan * 0.60

    // El resto se obtiene después de descontar los montos ya asignados.
    val luis = montoTotal - juan - pedro

    println(s"Juan recibe: S/ $juan")
    println(s"Pedro recibe: S/ $pedro")
    println(s"Luis recibe: S/ $luis")
  }
}
