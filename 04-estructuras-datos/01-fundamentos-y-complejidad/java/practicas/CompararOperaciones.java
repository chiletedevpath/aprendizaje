import java.util.ArrayList;
import java.util.List;

public class CompararOperaciones {
    public static void main(String[] args) {
        List<Integer> datos = new ArrayList<>(List.of(10, 20, 30, 40));
        // Acceder por índice no exige recorrer explícitamente los elementos anteriores.
        System.out.println(datos.get(2));
        // Buscar por valor puede revisar varios elementos hasta encontrar una coincidencia.
        System.out.println(datos.contains(40));
        // Insertar al inicio desplaza los elementos existentes de ArrayList.
        datos.add(0, 5);
        System.out.println(datos);
    }
}
