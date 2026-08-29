import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IndicePorClave {
    record Cliente(String dni, String nombre) {}

    public static void main(String[] args) {
        List<Cliente> archivo = List.of(new Cliente("100", "Ana"), new Cliente("200", "Luis"));
        Map<String, Integer> indice = new HashMap<>();

        // El índice guarda la posición del registro asociada a su clave.
        for (int i = 0; i < archivo.size(); i++) indice.put(archivo.get(i).dni(), i);

        int posicion = indice.get("200");
        System.out.println(archivo.get(posicion));
    }
}
