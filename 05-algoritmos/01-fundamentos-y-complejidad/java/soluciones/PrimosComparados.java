public class PrimosComparados {
    static boolean optimizado(int n) {
        if (n < 2) return false;
        // Probar hasta sqrt(n) es suficiente porque los factores aparecen en pares.
        for (int d = 2; d <= n / d; d++) if (n % d == 0) return false;
        return true;
    }
    public static void main(String[] args) { System.out.println(optimizado(97)); }
}
