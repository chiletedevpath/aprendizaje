public class FactorialRecursivo {
    static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("n no puede ser negativo.");
        // El caso base detiene nuevas llamadas recursivas.
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
