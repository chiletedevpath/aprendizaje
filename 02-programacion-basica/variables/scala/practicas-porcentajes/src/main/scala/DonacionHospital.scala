import scala.io.StdIn.readDouble

object DonacionHospital {

  def main(args: Array[String]): Unit = {

    // Ingresar el monto total de la donacion
    print("Ingrese el monto total de la donacion: S/ ")
    val donacionTotal = readDouble()

    // Medicina General recibe el 45% de la donacion
    val medicinaGeneral = donacionTotal * 0.45

    // Ginecologia recibe el 80% de lo recibido por Medicina General
    val ginecologia = medicinaGeneral * 0.80

    // Pediatria recibe el 20% de la suma de Medicina General y Ginecologia
    val pediatria = (medicinaGeneral + ginecologia) * 0.20

    // Traumatologia recibe lo restante
    val traumatologia =
      donacionTotal - medicinaGeneral - ginecologia - pediatria

    println(s"Pediatria recibe: S/ $pediatria")
    println(s"Medicina General recibe: S/ $medicinaGeneral")
    println(s"Ginecologia recibe: S/ $ginecologia")
    println(s"Traumatologia recibe: S/ $traumatologia")
  }
}
