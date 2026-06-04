public class BuscarProductoInventario {

	public static void main(String[] args) {

		String productos[] = { "Monitor LG", "Teclado Logitech", "Mouse Genius", "Audifono JBL", "Impresora EPSON",
				"Laptop Lenovo" };
		int cantidad[] = { 2, 4, 6, 7, 8, 2 };
		double precio[] = { 850.20, 195.50, 80.30, 100, 605.25, 3650.85 };

		double total[] = new double[productos.length];
		double totalGeneral = 0;

		System.out.println("###################################################");
		System.out.println("BOLETA DE VENTA ELECTRONICA");
		System.out.println("###################################################");

		StringBuilder reporte = new StringBuilder();
		reporte.append(String.format("%-20s %-8s %-10s %-10s\n", "PRODUCTO", "CANT.", "PRECIO", "TOTAL"));
		reporte.append("###################################################\n");

		for (int i = 0; i < productos.length; i++) {
			total[i] = cantidad[i] * precio[i];
			totalGeneral += total[i];
			reporte.append(
					String.format("%-20s %-8d %8.2f %11.2f\n", productos[i], cantidad[i], precio[i], total[i]));
		}

		reporte.append("####################################################\n");
		reporte.append(String.format("%36s %13.2f\n", "TOTAL:", totalGeneral));
		reporte.append("####################################################");

		System.out.println(reporte.toString());
	}
}