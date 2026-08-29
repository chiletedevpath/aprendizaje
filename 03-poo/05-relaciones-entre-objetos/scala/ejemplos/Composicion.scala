class Motor:
  def encender(): Unit = println("Motor encendido")
class Auto:
  private val motor = new Motor
  def encender(): Unit = motor.encender()

@main def composicion(): Unit = new Auto().encender()
