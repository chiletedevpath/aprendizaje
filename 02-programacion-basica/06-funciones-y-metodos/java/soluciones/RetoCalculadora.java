public class RetoCalculadora {
    public static void main(String[] args) {
        System.out.println(sumar(8, 2));
        System.out.println(restar(8, 2));
        System.out.println(multiplicar(8, 2));
        System.out.println(dividir(8, 2));
    }

    static double sumar(double a, double b) { return a + b; }
    static double restar(double a, double b) { return a - b; }
    static double multiplicar(double a, double b) { return a * b; }

    static double dividir(double a, double b) {
        // Dividir entre cero no produce un resultado válido para este problema.
        if (b == 0) throw new IllegalArgumentException("Divisor igual a cero");
        return a / b;
    }
}
