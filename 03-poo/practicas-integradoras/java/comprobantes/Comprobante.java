public class Comprobante {
    private static final double PORCENTAJE_IGV = 0.18;

    private final String[] productos;
    private final double[] precios;
    private final int[] unidades;
    private double subtotal;
    private double igv;
    private double total;

    public Comprobante(String[] productos, double[] precios, int[] unidades) {
        validarDatos(productos, precios, unidades);
        this.productos = productos.clone();
        this.precios = precios.clone();
        this.unidades = unidades.clone();
        calcularMontos();
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getIgv() {
        return igv;
    }

    public double getTotal() {
        return total;
    }

    private void validarDatos(String[] productos, double[] precios, int[] unidades) {
        if (productos == null || precios == null || unidades == null) {
            throw new IllegalArgumentException("Los arreglos del comprobante son obligatorios.");
        }
        if (productos.length == 0 || productos.length != precios.length || productos.length != unidades.length) {
            throw new IllegalArgumentException("Los arreglos deben tener la misma longitud y no estar vacíos.");
        }

        for (int i = 0; i < productos.length; i++) {
            if (productos[i] == null || productos[i].isBlank() || precios[i] <= 0 || unidades[i] <= 0) {
                throw new IllegalArgumentException("Datos inválidos en el producto de posición " + i + ".");
            }
        }
    }

    private void calcularMontos() {
        for (int i = 0; i < productos.length; i++) {
            subtotal += unidades[i] * precios[i];
        }

        igv = subtotal * PORCENTAJE_IGV;
        total = subtotal + igv;
    }
}
