public class EjecutarComprobante {
    public static void main(String[] args) {

        String[] productos = { "Cuaderno 100h", "Colores x24", "Plumones Jumbo", "Mochila", "Papel Bond A4" };
        double[] precios = { 8.65, 25.5, 29.4, 122.6, 16.0 };
        int[] unidades = { 12, 2, 2, 2, 4 };

        Comprobante comprobante1 = new Comprobante(productos, precios, unidades);

        System.out.printf("Subtotal: %9.2f\n", comprobante1.getSubtotal());
        System.out.printf("IGV     : %9.2f\n", comprobante1.getIgv());
        System.out.printf("Total   : %9.2f", comprobante1.getTotal());
    }

}

