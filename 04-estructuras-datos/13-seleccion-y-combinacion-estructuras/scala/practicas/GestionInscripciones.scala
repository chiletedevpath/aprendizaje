case class Inscripcion(est:String,curso:String)
object GestionInscripciones:
  def main(args:Array[String]):Unit =
    val orden=Vector(Inscripcion("U1","S1")); val porEst=orden.groupBy(_.est); val cursos=orden.map(_.curso).toSet; println((orden,porEst,cursos))
