case class RecursoReto(c:String,cat:String)
object GestorRecursosReto:
  def main(args:Array[String]):Unit =
    val lista=Vector(RecursoReto("R1","Scala")); val idx=lista.map(r=>r.c->r).toMap; println(idx("R1"))
