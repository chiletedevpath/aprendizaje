import java.util.ArrayList;
import java.util.List;

public class DemoProductos {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();

        productos.add(new Producto("Arroz", 4.50));
        productos.add(new Producto("Atun", 6.00));
        try {
            productos.add(new Producto("Gaseosa", -3.00));
        } catch (IllegalArgumentException error) {
            System.out.println("Producto rechazado: " + error.getMessage());
        }

        double total = 0;

        for (Producto p : productos) {
            p.mostrar();
            total += p.getPrecio();
        }

        System.out.printf("Total: S/ %.2f%n", total);
    }
}
