object CostosBasicos:
  def main(args: Array[String]): Unit =
    val valores = Vector(10, 20, 30, 40, 50)

    // Vector permite acceso indexado eficiente sin recorrer explícitamente la colección.
    println(s"Posición 3: ${valores(3)}")

    // contains puede revisar elementos hasta localizar el valor.
    println(s"Contiene 40: ${valores.contains(40)}")
