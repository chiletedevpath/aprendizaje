import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class MinHeap {
    private final List<Integer> datos = new ArrayList<>();

    public void agregar(int valor) {
        datos.add(valor);
        subir(datos.size() - 1);
    }

    public int extraerMinimo() {
        if (datos.isEmpty()) throw new NoSuchElementException("Heap vacío");
        int minimo = datos.get(0);
        int ultimo = datos.remove(datos.size() - 1);
        if (!datos.isEmpty()) { datos.set(0, ultimo); bajar(0); }
        return minimo;
    }

    private void subir(int i) {
        while (i > 0) {
            int padre = (i - 1) / 2;
            if (datos.get(padre) <= datos.get(i)) break;
            intercambiar(i, padre); i = padre;
        }
    }

    private void bajar(int i) {
        while (true) {
            int izq = 2 * i + 1, der = 2 * i + 2, menor = i;
            if (izq < datos.size() && datos.get(izq) < datos.get(menor)) menor = izq;
            if (der < datos.size() && datos.get(der) < datos.get(menor)) menor = der;
            if (menor == i) break;
            // El intercambio restaura la propiedad de min-heap.
            intercambiar(i, menor); i = menor;
        }
    }

    private void intercambiar(int a, int b) {
        int tmp = datos.get(a); datos.set(a, datos.get(b)); datos.set(b, tmp);
    }
}
