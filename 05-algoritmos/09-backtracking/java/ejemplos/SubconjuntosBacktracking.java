import java.util.ArrayList;
import java.util.List;

public class SubconjuntosBacktracking {
    static void generar(int[] datos, int indice, List<Integer> actual) {
        if (indice == datos.length) {
            System.out.println(actual);
            return;
        }
        actual.add(datos[indice]);
        generar(datos, indice + 1, actual);
        // Se deshace la decisión antes de explorar la alternativa sin el elemento.
        actual.remove(actual.size() - 1);
        generar(datos, indice + 1, actual);
    }

    public static void main(String[] args) {
        generar(new int[]{1,2,3}, 0, new ArrayList<>());
    }
}
