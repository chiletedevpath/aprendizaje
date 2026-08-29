public class PruebasYDepuracionBasica {
    static int maximo(int a, int b) {
        return a >= b ? a : b;
    }

    static void comprobar(String caso, int esperado, int obtenido) {
        if (esperado != obtenido) {
            throw new AssertionError(caso + " | esperado=" + esperado + " obtenido=" + obtenido);
        }
        System.out.println("OK: " + caso);
    }

    public static void main(String[] args) {
        // Se prueban situaciones distintas; no solo el caso más común.
        comprobar("valores distintos", 9, maximo(9, 4));
        comprobar("empate", 7, maximo(7, 7));
        comprobar("negativos", -2, maximo(-2, -8));
    }
}
