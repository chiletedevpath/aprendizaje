object ColisionHash:
  def main(args:Array[String]):Unit =
    val grupos=List(1,6,11).groupBy(_ % 5); println(grupos)
