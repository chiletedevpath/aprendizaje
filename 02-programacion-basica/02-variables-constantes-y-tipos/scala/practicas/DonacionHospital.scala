import scala.io.StdIn.readDouble

object DonacionHospital {

  def main(args: Array[String]): Unit = {

    // readDouble() lee un valor decimal desde la entrada estándar.
    print("Ingrese el monto total de la donacion: S/ ")
    val donacionTotal = readDouble()

    // 0.45 representa 45% en formato decimal.
    val medicinaGeneral = donacionTotal * 0.45

    // El segundo cálculo usa como base el resultado anterior.
    val ginecologia = medicinaGeneral * 0.80

    // Los paréntesis fijan qué suma se calcula antes de aplicar el porcentaje.
    val pediatria = (medicinaGeneral + ginecologia) * 0.20

    // El área restante se obtiene restando todos los montos ya asignados.
    val traumatologia =
      donacionTotal - medicinaGeneral - ginecologia - pediatria

    println(s"Pediatria recibe: S/ $pediatria")
    println(s"Medicina General recibe: S/ $medicinaGeneral")
    println(s"Ginecologia recibe: S/ $ginecologia")
    println(s"Traumatologia recibe: S/ $traumatologia")
  }
}
