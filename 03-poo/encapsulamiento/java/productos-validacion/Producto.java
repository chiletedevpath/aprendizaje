public final class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = validarNombre(nombre);
        this.precio = validarPrecio(precio);
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = validarNombre(nombre);
    }

    public void setPrecio(double precio) {
        this.precio = validarPrecio(precio);
    }

    private static String validarNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre del producto es obligatorio.");
        }
        return nombre.trim();
    }

    private static double validarPrecio(double precio) {
        if (precio <= 0) {
            throw new IllegalArgumentException("El precio debe ser mayor que cero.");
        }
        return precio;
    }

    public void mostrar() {
        System.out.printf("Producto: %s - S/ %.2f%n", nombre, precio);
    }
}

