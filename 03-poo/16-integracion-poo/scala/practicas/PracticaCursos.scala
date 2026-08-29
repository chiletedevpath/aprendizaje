case class ParticipanteFinal(nombre: String)
case class CursoFinal(titulo: String)
case class InscripcionFinal(participante: ParticipanteFinal,curso: CursoFinal)
@main def practicaCursos(): Unit = println(InscripcionFinal(ParticipanteFinal("Ana"),CursoFinal("POO")))
