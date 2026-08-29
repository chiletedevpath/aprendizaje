import java.time.LocalDate
import scala.util.Random

object BibliotecaEstandar:
  def main(args: Array[String]): Unit =
    val valores = Array(8, 3, 12, 5)
    val ordenados = valores.sorted
    val random = new Random(42)

    println(s"Raíz de 81: ${math.sqrt(81)}")
    println(s"Fecha: ${LocalDate.now()}")
    println(s"Aleatorio reproducible: ${random.nextInt(10)}")
    println(s"Ordenados: ${ordenados.mkString("[", ", ", "]")}")
