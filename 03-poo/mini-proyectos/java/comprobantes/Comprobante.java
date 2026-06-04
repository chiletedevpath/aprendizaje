public class Comprobante {
	 private final double _PORCENTAJE_IGV_ = 0.18;

	    private String[] productos;
	    private double[] precios;
	    private int[] unidades;

	    private double subtotal, igv, total;

	    public double getSubtotal() {
	        return subtotal;
	    }

	    public double getIgv() {
	        return igv;
	    }

	    public double getTotal() {
	        return total;
	    }

	    public Comprobante(String[] productos, double[] precios, int[] unidaddes) {
	        this.productos = productos;
	        this.precios = precios;
	        this.unidades = unidaddes;
	        subtotal = igv = total = 0;

	        calculaMontos();
	    }

	    private void calculaMontos() {
	        for (int i = 0; i < productos.length; i++) {
	            subtotal += unidades[i] * precios[i];
	        }

	        igv = subtotal * _PORCENTAJE_IGV_;
	        total = subtotal / igv * 100.0;
	    }


}

