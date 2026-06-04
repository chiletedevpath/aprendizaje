import java.util.ArrayList;
import java.util.List;

public class TablaDispersion {
    private List<Integer>[] tabla;

    @SuppressWarnings("unchecked")
    public TablaDispersion(int tamano) {
        tabla = (List<Integer>[]) new ArrayList[tamano];

        for (int i = 0; i < tamano; i++) {
            tabla[i] = new ArrayList<>();
        }
    }

    public void insertar(int clave, int indice) {
        tabla[indice].add(clave);
    }

    public void mostrar() {
        for (int i = 0; i < tabla.length; i++) {
            // Cada posicion muestra las claves que colisionaron en ese indice.
            System.out.println(i + " -> " + tabla[i]);
        }
    }
}
