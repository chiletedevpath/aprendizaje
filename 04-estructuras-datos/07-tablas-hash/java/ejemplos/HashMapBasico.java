import java.util.HashMap;
import java.util.Map;

public class HashMapBasico {
    public static void main(String[] args) {
        Map<String, Integer> intentos = new HashMap<>();

        // HashMap calcula una ubicación interna a partir del hash de la clave.
        intentos.put("ana", 2);
        intentos.put("luis", 1);

        // get consulta el valor asociado a la clave sin recorrer explícitamente toda la colección.
        System.out.println("Intentos de ana: " + intentos.get("ana"));
    }
}
