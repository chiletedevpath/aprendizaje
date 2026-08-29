import scala.io.StdIn.readLine

object HolaEntradaSalida:
  def main(args: Array[String]): Unit =
    // readLine obtiene texto desde la entrada estándar.
    val nombre = readLine("Nombre del aprendiz: ").trim
    println(s"Bienvenido, $nombre. El entorno Scala funciona correctamente.")
