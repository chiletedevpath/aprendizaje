import scala.io.StdIn.readLine
import scala.util.Try

object MiniRegistroNotas:
  def leerNota(indice: Int): Double =
    var notaValida: Option[Double] = None

    while notaValida.isEmpty do
      val entrada = readLine(s"Nota $indice (0-20): ")
      val candidata = Try(entrada.toDouble).toOption.filter(n => n >= 0 && n <= 20)
      notaValida = candidata

      if notaValida.isEmpty then
        println("Entrada inválida.")

    notaValida.get

  def main(args: Array[String]): Unit =
    val notas = (1 to 3).map(leerNota)
    val promedio = notas.sum / notas.size
    val estado = if promedio >= 11 then "Aprobado" else "Desaprobado"

    println(f"Promedio: $promedio%.2f | $estado")
