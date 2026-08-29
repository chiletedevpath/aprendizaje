object TiposYConversiones:
  def main(args: Array[String]): Unit =
    val textoEdad: String = "21"
    val edad: Int = textoEdad.toInt
    val promedio: Double = 17.75

    // toInt descarta la parte decimal; no realiza redondeo.
    val parteEntera: Int = promedio.toInt
    val mayorEdad: Boolean = edad >= 18

    println(s"Edad: $edad")
    println(s"Parte entera del promedio: $parteEntera")
    println(s"¿Es mayor de edad?: $mayorEdad")
