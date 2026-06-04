public class ReporteProductosCodigos {
	/*
	 * CREAR LA CLASE BOLETA: TODOS LOS DATOS DEBEN ESTAR INICIALIZADOS. IDENTIFICAR
	 * Y PROGRAMAR LOS ARREGLOS PARALELOS NECESARIOS. EL PROGRAMA DEBE CALCULAR EL
	 * MONTO POR CADA PRODUCTO, EL IGV Y EL IMPORTE TOTAL. EL REPORTE ASCII DEBE
	 * GENERARSE HACIENDO USO DE STRINGBUILDER.APPEND()
	 */

	public static void main(String[] args) {

		String inicioCodigo = "77";
		String codigos[] = { "54125852147", "52563210489", "96525415" };
		String productos[] = { "DETERGENTE ULTRA", "JAM.PIZZA", "LECHE EN CAJA" };
		int cantidad[] = { 6, 2, 12 };
		double precio[] = { 3.25, 12.90, 30.50 };
		String nombres[] = { "ROSA", "CARLOS" };

		System.out.println(String.format("%27s", "TIENDA ABC\n"));
		System.out.println(String.format("%29s", "RUC 21521458563"));
		System.out.println(String.format("%30s", "Chiclayo - Perú\n"));

		StringBuilder boleta = new StringBuilder();
		boleta.append("Cajero: ").append(nombres[0]).append("\n");

		String codigoCompleto[] = new String[3];
		for (int i = 0; i < 3; i++) { // NO USO ARRAY COPY PORQUE LOS DOS DEBEN SER ARRAYS
			codigoCompleto[i] = inicioCodigo + codigos[i];
		}

		double totalProductos[] = new double[3];
		double opGravada = 0;

		for (int i = 0; i < 3; i++) {

			totalProductos[i] = cantidad[i] * precio[i];

			boleta.append(String.format("%-14s %-5s\n", codigoCompleto[i], productos[i]));
			boleta.append(String.format("%14s %-4d X %9.2f %8.2f\n", "", cantidad[i], precio[i], totalProductos[i]));
			opGravada += totalProductos[i];
		}
		double igv = opGravada * 0.18;
		double importeTotal = opGravada + igv;

		boleta.append("\nOP. GRAVADA: ").append(opGravada).append("\n");
		boleta.append("I.G.V: ").append(igv).append("\n");
		boleta.append("\nIMPORTE TOTAL: ").append(importeTotal).append("\n");

		boleta.append("\n----------------------------------------\n");
		boleta.append("CLIENTE: ").append(nombres[1]);
		boleta.append("\n----------------------------------------\n");

		System.out.println(boleta.toString());
	}
}
