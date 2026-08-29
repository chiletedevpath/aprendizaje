public class ReporteProductosCodigos {
	/*
	 * CREAR UNA BOLETA CON DATOS INICIALIZADOS. IDENTIFICAR Y PROGRAMAR ARREGLOS
	 * PARALELOS PARA CALCULAR MONTO POR PRODUCTO, IGV E IMPORTE TOTAL.
	 */

	public static void main(String[] args) {

		String inicioCodigo = "77";
		String codigos[] = { "54125852147", "52563210489", "96525415" };
		String productos[] = { "CUADERNO DEVPATH", "LAPICERO CHILETE", "GUIA DE PRACTICA" };
		int cantidad[] = { 6, 2, 12 };
		double precio[] = { 3.25, 12.90, 30.50 };
		String nombres[] = { "Usuario Chilete", "Cliente DevPath" };

		System.out.println(String.format("%27s", "CHILETE STORE\n"));
		System.out.println(String.format("%29s", "RUC 00000000000"));
		System.out.println(String.format("%30s", "Chiclayo - Peru\n"));

		StringBuilder boleta = new StringBuilder();
		boleta.append("Cajero: ").append(nombres[0]).append("\n");

		String codigoCompleto[] = new String[3];
		for (int i = 0; i < 3; i++) {
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
