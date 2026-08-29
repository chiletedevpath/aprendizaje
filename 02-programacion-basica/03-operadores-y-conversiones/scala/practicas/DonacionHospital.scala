import scala.io.StdIn.readDouble

object DonacionHospital {
  def main(args: Array[String]): Unit = {
    print("Ingrese el monto total de la donación: S/ ")
    val donacionTotal = readDouble()

    val medicinaGeneral = donacionTotal * 0.45
    val ginecologia = medicinaGeneral * 0.80
    val pediatria = (medicinaGeneral + ginecologia) * 0.20
    val traumatologia = donacionTotal - medicinaGeneral - ginecologia - pediatria

    println(s"Pediatría recibe: S/ $pediatria")
    println(s"Medicina General recibe: S/ $medicinaGeneral")
    println(s"Ginecología recibe: S/ $ginecologia")
    println(s"Traumatología recibe: S/ $traumatologia")
  }
}
