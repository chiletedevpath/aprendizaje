class CupoAgotado extends Exception("Sin cupos")
class CursoCupo(private var cupos: Int):
  def inscribir(): Unit = if cupos<=0 then throw new CupoAgotado else cupos-=1
@main def practicaCupo(): Unit = try { val c=new CursoCupo(0); c.inscribir() } catch case e:CupoAgotado => println(e.getMessage)
