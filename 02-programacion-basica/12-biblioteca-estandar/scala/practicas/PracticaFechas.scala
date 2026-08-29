import java.time.LocalDate
import java.time.temporal.ChronoUnit

@main def practicaFechas(): Unit =
  val inicio = LocalDate.of(2026, 8, 1)
  val fin = LocalDate.of(2026, 8, 31)
  // ChronoUnit.DAYS calcula la diferencia en días entre dos fechas.
  val dias = ChronoUnit.DAYS.between(inicio, fin)
  println(s"Diferencia: $dias días")
