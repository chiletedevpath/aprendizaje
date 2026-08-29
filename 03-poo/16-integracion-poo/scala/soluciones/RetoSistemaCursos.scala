case class ParticipanteReto(id: String, nombre: String)
case class CursoRetoIntegrado(codigo: String, titulo: String)
class InscripcionReto(val participante: ParticipanteReto,val curso: CursoRetoIntegrado):
  private var avance = 0
  def actualizarAvance(v: Int): Unit = { require(v >= 0 && v <= 100); avance = v }
  def progreso: Int = avance
class GestorReto:
  private var inscripciones = List.empty[InscripcionReto]
  def inscribir(p: ParticipanteReto,c: CursoRetoIntegrado): Unit = inscripciones ::= new InscripcionReto(p,c)
  def total: Int = inscripciones.size

@main def retoSistemaCursos(): Unit =
  val g = new GestorReto
  g.inscribir(ParticipanteReto("P1","Ana"),CursoRetoIntegrado("C1","POO"))
  println(g.total)
