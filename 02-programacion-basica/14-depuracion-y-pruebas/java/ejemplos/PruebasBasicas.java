public class PruebasBasicas {
    public static void main(String[] args) {
        verificar("positivo par", true, esPar(8));
        verificar("positivo impar", false, esPar(7));
        verificar("cero", true, esPar(0));
        verificar("negativo", true, esPar(-4));
    }

    static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    // Comparar esperado y obtenido permite detectar regresiones sin una librería externa.
    static void verificar(String caso, boolean esperado, boolean obtenido) {
        String estado = esperado == obtenido ? "OK" : "ERROR";
        System.out.printf("%s -> %s%n", caso, estado);
    }
}
