import java.time.LocalDate
import java.time.temporal.ChronoUnit
import scala.io.StdIn.readLine
import scala.util.Try

@main def retoBibliotecaEstandar(): Unit =
  val objetivo = Try(LocalDate.parse(readLine("Fecha objetivo (AAAA-MM-DD): ").trim)).toOption

  objetivo match
    case Some(fecha) =>
      // ChronoUnit.DAYS calcula la diferencia entre dos fechas en días completos.
      val dias = ChronoUnit.DAYS.between(LocalDate.now(), fecha)
      val numeros = List(8.5, 3.2, 9.1)
      println(s"Faltan $dias días | mínimo=${numeros.min} | máximo=${numeros.max}")
    case None => println("Fecha inválida. Usa el formato AAAA-MM-DD")
