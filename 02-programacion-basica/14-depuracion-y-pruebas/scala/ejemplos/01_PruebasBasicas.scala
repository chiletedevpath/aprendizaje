def esPar(numero: Int): Boolean = numero % 2 == 0

@main def pruebasBasicas(): Unit =
  // assert detiene la ejecución si una condición esperada resulta falsa.
  assert(esPar(8))
  assert(!esPar(7))
  assert(esPar(0))
  assert(esPar(-4))
  println("Pruebas completadas")
