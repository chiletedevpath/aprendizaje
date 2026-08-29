import java.util.LinkedHashMap;
import java.util.Map;

public class PracticaInventarioColecciones {
    public static void main(String[] args) {
        // LinkedHashMap conserva el orden de inserción de las claves.
        Map<String, Integer> stock = new LinkedHashMap<>();
        stock.put("Teclado", 5);
        stock.put("Mouse", 8);
        stock.put("Monitor", 3);

        stock.replace("Mouse", stock.get("Mouse") - 2);

        for (var producto : stock.entrySet()) {
            System.out.printf("%s -> %d unidades%n", producto.getKey(), producto.getValue());
        }
    }
}
