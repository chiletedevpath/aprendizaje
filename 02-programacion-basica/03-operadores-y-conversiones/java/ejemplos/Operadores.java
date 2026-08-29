public class Operadores {
    public static void main(String[] args) {
        int a = 17;
        int b = 5;

        int suma = a + b;
        // % devuelve el residuo de una división.
        int residuo = a % b;
        boolean mayor = a > b;
        boolean rangoValido = a >= 0 && a <= 20;

        System.out.printf("suma=%d, residuo=%d, mayor=%s, rango=%s%n",
                suma, residuo, mayor, rangoValido);
    }
}
