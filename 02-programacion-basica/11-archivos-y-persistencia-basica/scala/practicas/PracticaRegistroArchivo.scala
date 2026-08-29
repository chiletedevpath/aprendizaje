import java.nio.file.{Files, Path}
import java.nio.charset.StandardCharsets
import scala.jdk.CollectionConverters.*

@main def practicaRegistroArchivo(): Unit =
  val archivo = Path.of("registro-cursos.txt")
  val cursos = List("Java", "Scala", "Git")
  Files.write(archivo, cursos.asJava, StandardCharsets.UTF_8)
  // asScala adapta el resultado de la API Java para recorrerlo como colección Scala.
  Files.readAllLines(archivo, StandardCharsets.UTF_8).asScala.foreach(c => println(s"Curso: $c"))
  Files.deleteIfExists(archivo)
