import java.util.ArrayList;
import java.util.List;

public class ListaDinamica {
    public static void main(String[] args) {
        List<String> cursos = new ArrayList<>();

        // ArrayList permite agregar elementos sin definir un tamaño fijo al crear la lista.
        cursos.add("Java");
        cursos.add("Scala");
        cursos.add("Estructuras de datos");

        // get usa un índice para recuperar un elemento.
        System.out.println("Segundo curso: " + cursos.get(1));
        System.out.println("Total: " + cursos.size());
    }
}
