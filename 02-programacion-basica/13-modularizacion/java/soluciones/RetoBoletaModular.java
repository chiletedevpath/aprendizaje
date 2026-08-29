public class RetoBoletaModular {
    public static void main(String[] args) {
        double subtotal = subtotal(25.0, 4);
        double descuento = descuento(subtotal);
        mostrar(subtotal, descuento, subtotal - descuento);
    }

    static double subtotal(double precio, int cantidad) { return precio * cantidad; }

    static double descuento(double subtotal) {
        return subtotal >= 100 ? subtotal * 0.10 : 0;
    }

    // La presentación se separa del cálculo para reducir responsabilidades mezcladas.
    static void mostrar(double subtotal, double descuento, double total) {
        System.out.printf("Subtotal: %.2f | Descuento: %.2f | Total: %.2f%n", subtotal, descuento, total);
    }
}
