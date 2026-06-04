import java.util.ArrayList;
import java.util.List;

public class DemoProductos {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();

        productos.add(new Producto("Arroz", 4.50));
        productos.add(new Producto("Atun", 6.00));
        productos.add(new Producto("Gaseosa", -3.00));

        double total = 0;

        // Valida que solo los productos con precio correcto formen parte del total.
        for (Producto p : productos) {
            if (p.getPrecio() > 0) {
                p.mostrar();
                total += p.getPrecio();
            }
        }

        System.out.println("Total: S/ " + total);
    }
}
