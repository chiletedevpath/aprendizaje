public class PracticaValidarPromedio {
    public static void main(String[] args) {
        comprobar(new int[]{10, 20}, 15.0);
        comprobar(new int[]{20}, 20.0);
        comprobar(new int[]{}, 0.0);
    }

    static double promedio(int[] valores) {
        if (valores.length == 0) return 0;
        int suma = 0;
        for (int valor : valores) suma += valor;
        return (double) suma / valores.length;
    }

    static void comprobar(int[] entrada, double esperado) {
        double obtenido = promedio(entrada);
        // Double.compare evita depender de una comparación directa poco clara entre decimales.
        boolean correcto = Double.compare(esperado, obtenido) == 0;
        System.out.printf("esperado=%.2f | obtenido=%.2f | %s%n",
                esperado, obtenido, correcto ? "OK" : "ERROR");
    }
}
