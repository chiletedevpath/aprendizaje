import java.util.ArrayList;
import java.util.List;

public class TablaDispersion {
    private final List<Integer>[] tabla;

    @SuppressWarnings("unchecked")
    public TablaDispersion(int tamano) {
        if (tamano <= 0) {
            throw new IllegalArgumentException("El tamaño de la tabla debe ser positivo.");
        }
        tabla = (List<Integer>[]) new List<?>[tamano];

        for (int i = 0; i < tamano; i++) {
            tabla[i] = new ArrayList<>();
        }
    }

    public boolean insertar(int clave, int indice) {
        if (indice < 0 || indice >= tabla.length) {
            throw new IndexOutOfBoundsException("Índice fuera de la tabla: " + indice);
        }
        if (tabla[indice].contains(clave)) {
            return false;
        }
        tabla[indice].add(clave);
        return true;
    }

    public void mostrar() {
        for (int i = 0; i < tabla.length; i++) {
            // Cada posicion muestra las claves que colisionaron en ese indice.
            System.out.println(i + " -> " + tabla[i]);
        }
    }
}
