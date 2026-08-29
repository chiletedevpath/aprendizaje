object CondicionalesBasicos:
  def main(args: Array[String]): Unit =
    val nota = 15
    val asistencia = 85

    // En Scala, if puede producir un valor y asignarse directamente.
    val estado =
      if nota < 0 || nota > 20 || asistencia < 0 || asistencia > 100 then
        "Datos inválidos"
      else if nota >= 11 && asistencia >= 70 then
        "Aprobado"
      else
        "Desaprobado"

    println(estado)
