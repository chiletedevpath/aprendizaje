trait Evaluable:
  def progreso: Double
case class Participante(nombre: String)
class Inscripcion(val participante: Participante) extends Evaluable:
  private var avance = 0.0
  def actualizar(valor: Double): Unit = { require(valor >= 0 && valor <= 100); avance = valor }
  def progreso: Double = avance
class CursoIntegrado(val titulo: String):
  private var inscripciones = List.empty[Inscripcion]
  def inscribir(p: Participante): Unit = inscripciones ::= new Inscripcion(p)
  def total: Int = inscripciones.size

@main def integracionCursos(): Unit =
  val c = new CursoIntegrado("POO")
  c.inscribir(Participante("Aprendiz"))
  println(c.total)
