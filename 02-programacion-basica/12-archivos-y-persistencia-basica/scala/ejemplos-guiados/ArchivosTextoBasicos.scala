import java.nio.file.{Files, Path}
import java.nio.charset.StandardCharsets
import scala.jdk.CollectionConverters.*

object ArchivosTextoBasicos:
  def main(args: Array[String]): Unit =
    val archivo = Path.of("avance-demo.txt")
    val lineas = List("Java=70", "Scala=25")

    try
      Files.write(archivo, lineas.asJava, StandardCharsets.UTF_8)
      Files.readAllLines(archivo, StandardCharsets.UTF_8).asScala.foreach(println)
      Files.deleteIfExists(archivo)
    catch
      case e: Exception => println(s"No se pudo procesar el archivo: ${e.getMessage}")
