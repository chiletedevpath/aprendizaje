public class RetoProducto {
    static class Producto {
        private final String nombre;
        private final double precio;

        Producto(String nombre, double precio) {
            if (precio < 0) throw new IllegalArgumentException("El precio no puede ser negativo");
            this.nombre = nombre;
            this.precio = precio;
        }
        String ficha() { return nombre + " - S/ " + precio; }
    }
    public static void main(String[] args) {
        System.out.println(new Producto("Teclado", 80).ficha());
    }
}
