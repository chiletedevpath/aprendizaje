public class RetoCompraIgv {
    public static void main(String[] args) {
        double precio = 25.0;
        int cantidad = 3;
        final double IGV = 0.18;

        double subtotal = precio * cantidad;
        // La constante expresa una regla que no cambia durante el cálculo.
        double impuesto = subtotal * IGV;
        double total = subtotal + impuesto;

        System.out.printf("Subtotal: %.2f | IGV: %.2f | Total: %.2f%n", subtotal, impuesto, total);
    }
}
