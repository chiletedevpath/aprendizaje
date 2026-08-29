@main def retoDuracion(): Unit =
  val minutosTotales = 145
  val horas = minutosTotales / 60
  // % conserva los minutos que no completan una hora.
  val minutos = minutosTotales % 60
  val superaDosHoras = minutosTotales > 120
  println(s"$horas h $minutos min | supera 2 h: $superaDosHoras")
