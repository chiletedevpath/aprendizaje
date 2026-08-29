import java.util.HashMap;
import java.util.Map;

public class Mapas {
    public static void main(String[] args) {
        // Map relaciona una clave única con un valor.
        Map<String, Integer> avances = new HashMap<>();
        avances.put("Java", 70);
        avances.put("Scala", 30);

        System.out.println("Java: " + avances.get("Java") + "%");
    }
}
