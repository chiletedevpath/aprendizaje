case class ClienteIndice(dni:String,n:String)
object IndiceDni:
  def main(args:Array[String]):Unit =
    val f=Vector(ClienteIndice("1","Ana"),ClienteIndice("2","Luis")); val i=f.zipWithIndex.map((c,p)=>c.dni->p).toMap; println(f(i("2")))
