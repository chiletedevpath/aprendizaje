public class SepararResponsabilidades {
    public static void main(String[] args) {
        double subtotal = calcularSubtotal(15.0, 3);
        double total = aplicarDescuento(subtotal, 0.10);
        mostrarResultado(subtotal, total);
    }

    // Cada método concentra una responsabilidad concreta.
    static double calcularSubtotal(double precio, int cantidad) {
        return precio * cantidad;
    }

    static double aplicarDescuento(double subtotal, double tasa) {
        return subtotal * (1 - tasa);
    }

    static void mostrarResultado(double subtotal, double total) {
        System.out.printf("Subtotal: %.2f | Total: %.2f%n", subtotal, total);
    }
}
