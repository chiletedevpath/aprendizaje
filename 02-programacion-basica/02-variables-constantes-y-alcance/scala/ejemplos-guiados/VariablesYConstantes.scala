object VariablesYConstantes:
  def main(args: Array[String]): Unit =
    // val representa una referencia inmutable; es la opción preferida cuando no hay reasignación.
    val igv = 0.18
    val subtotal = 100.0
    val impuesto = subtotal * igv
    val total = subtotal + impuesto

    println(f"Subtotal: $subtotal%.2f | IGV: $impuesto%.2f | Total: $total%.2f")
