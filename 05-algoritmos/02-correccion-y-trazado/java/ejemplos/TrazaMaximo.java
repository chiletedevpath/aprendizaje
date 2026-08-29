public class TrazaMaximo {
    static int maximo(int[] datos) {
        if (datos.length == 0) throw new IllegalArgumentException("El arreglo no puede estar vacío.");
        int maximo = datos[0];

        for (int i = 1; i < datos.length; i++) {
            // Después de cada iteración, maximo representa el mayor valor visto hasta i.
            if (datos[i] > maximo) maximo = datos[i];
            System.out.printf("i=%d, maximo=%d%n", i, maximo);
        }
        return maximo;
    }

    public static void main(String[] args) {
        System.out.println("Resultado: " + maximo(new int[]{7, 3, 11, 5, 9}));
    }
}
