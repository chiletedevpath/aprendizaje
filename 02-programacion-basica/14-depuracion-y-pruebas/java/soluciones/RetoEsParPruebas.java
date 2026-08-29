public class RetoEsParPruebas {
    public static void main(String[] args) {
        comprobar(8, true);
        comprobar(7, false);
        comprobar(0, true);
        comprobar(-4, true);
        comprobar(-3, false);
    }

    static boolean esPar(int numero) { return numero % 2 == 0; }

    static void comprobar(int numero, boolean esperado) {
        boolean obtenido = esPar(numero);
        // Un caso falla si el resultado obtenido no coincide con el esperado.
        System.out.printf("%d | esperado=%s | obtenido=%s | %s%n",
                numero, esperado, obtenido, esperado == obtenido ? "OK" : "ERROR");
    }
}
