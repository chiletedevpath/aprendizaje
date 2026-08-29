import java.util.Arrays;

public class QuickSort {
    static void ordenar(int[] datos, int izquierda, int derecha) {
        if (izquierda >= derecha) return;
        int pivote = particionar(datos, izquierda, derecha);
        ordenar(datos, izquierda, pivote - 1);
        ordenar(datos, pivote + 1, derecha);
    }

    static int particionar(int[] datos, int izquierda, int derecha) {
        int pivote = datos[derecha];
        int menor = izquierda - 1;
        for (int i = izquierda; i < derecha; i++) {
            if (datos[i] <= pivote) {
                menor++;
                int tmp = datos[menor]; datos[menor] = datos[i]; datos[i] = tmp;
            }
        }
        int tmp = datos[menor + 1]; datos[menor + 1] = datos[derecha]; datos[derecha] = tmp;
        // El pivote queda en su posición final; cada lado se procesa de forma independiente.
        return menor + 1;
    }

    public static void main(String[] args) {
        int[] datos = {9, 4, 7, 3, 10, 5};
        ordenar(datos, 0, datos.length - 1);
        System.out.println(Arrays.toString(datos));
    }
}
