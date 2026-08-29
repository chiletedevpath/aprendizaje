import scala.io.StdIn.readLine
import scala.util.Try

@main def retoEvaluarCurso(): Unit =
  val nota = Try(readLine("Nota (0-20): ").trim.toInt).toOption
  val asistencia = Try(readLine("Asistencia (0-100): ").trim.toInt).toOption

  // El orden de las condiciones evita clasificar datos inválidos.
  val resultado = (nota, asistencia) match
    case (Some(n), Some(a)) if n < 0 || n > 20 || a < 0 || a > 100 => "Datos fuera de rango"
    case (Some(_), Some(a)) if a < 70 => "Desaprobado por asistencia"
    case (Some(n), Some(_)) if n < 11 => "Desaprobado por nota"
    case (Some(_), Some(_)) => "Aprobado"
    case _ => "Debe ingresar números enteros"

  println(resultado)
