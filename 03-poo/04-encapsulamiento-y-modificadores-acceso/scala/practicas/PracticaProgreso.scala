class Progreso:
  private var valor=0
  def actualizar(nuevo: Int): Unit = { require(nuevo>=0 && nuevo<=100); valor=nuevo }
  def actual: Int = valor
@main def practicaProgreso(): Unit = { val p=new Progreso; p.actualizar(60); println(p.actual) }
