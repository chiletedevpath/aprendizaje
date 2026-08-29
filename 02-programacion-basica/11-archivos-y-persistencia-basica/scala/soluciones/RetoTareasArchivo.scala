import java.nio.file.{Files, Path}
import java.nio.charset.StandardCharsets
import scala.jdk.CollectionConverters.*

@main def retoTareasArchivo(): Unit =
  val archivo = Path.of("tareas-devpath.txt")
  val tareas = List("Estudiar Java", "Practicar Scala", "Revisar Git")

  // asJava adapta la colección Scala a la API de java.nio.
  Files.write(archivo, tareas.asJava, StandardCharsets.UTF_8)
  val guardadas = Files.readAllLines(archivo, StandardCharsets.UTF_8).asScala
  guardadas.zipWithIndex.foreach { case (tarea, i) => println(s"${i + 1}. $tarea") }
  Files.deleteIfExists(archivo)
