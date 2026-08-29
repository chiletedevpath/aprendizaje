public class VariablesYConstantes {
    public static void main(String[] args) {
        // final indica que la referencia IGV no puede reasignarse.
        final double IGV = 0.18;
        double subtotal = 100.0;

        double impuesto = subtotal * IGV;
        double total = subtotal + impuesto;

        System.out.printf("Subtotal: %.2f | IGV: %.2f | Total: %.2f%n", subtotal, impuesto, total);
    }
}
