public final class Calculadora {
    public int dividir(int a, int b) {
        // El caso inválido se expresa de forma explícita para poder probarlo.
        if (b == 0) throw new IllegalArgumentException("Divisor inválido");
        return a / b;
    }
}
