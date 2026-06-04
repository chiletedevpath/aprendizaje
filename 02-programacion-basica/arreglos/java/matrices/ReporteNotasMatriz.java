public class ReporteNotasMatriz {

	public static void main(String[] args) {

		String[] nombres = { "ANA MARIELA TORRES LAZO", "CARLOS ALRBERTO ROJAS CHAN", "GABRIELA ROCIO ALVITES CH",
				"JUAN CARLOS GARCIA RODRIGUEZ", "ROSA INONAN FARRO" };
		int[] edad = { 25, 24, 25, 19, 22 };
		int[] grado = { 5, 5, 5, 5, 4 };

		int[][] notas = { { 20, 17, 18, 16 }, // PC1, PC2, PC3, EF
				{ 16, 18, 15, 12 }, { 20, 20, 14, 15 }, { 29, 19, 15, 17 }, { 20, 18, 12, 13 } };

		double[] promedio = new double[notas.length];
		double promTotal = 0;
		double sumaPromedioTotal = 0;

		for (int i = 0; i < notas.length; i++) {
			double sumaNotasFilas = 0;
			for (int j = 0; j < notas[i].length; j++) {
				sumaNotasFilas += notas[i][j];
			}
			promedio[i] = sumaNotasFilas / notas[i].length;
			sumaPromedioTotal += promedio[i];
			promTotal = sumaPromedioTotal / notas.length;
		}

		StringBuilder reporte = new StringBuilder();
		reporte.append(String.format("REPORTE DE NOTAS%n"));
		reporte.append(String.format("%s %s %s %s %s %s %s %s%n", "NOMBRE", "EDAD", "GRADO", "PC1", "PC2", "PC3", "EF",
				"PROMEDIO"));
		reporte.append(String
				.format("########################################################################################%n"));
		for (int i = 0; i < nombres.length; i++) {
			reporte.append(String.format("%-35s %-5d %-6d %-4d %-4d %-4d %-4d %-9.2f\n", nombres[i], edad[i], grado[i],
					notas[i][0], notas[i][1], notas[i][2], notas[i][3], promedio[i]));
		}
		reporte.append(String
				.format("########################################################################################%n"));
		reporte.append(String.format("PROMEDIO TOTAL: %.2f\n", promTotal));
		System.out.println(reporte.toString());

	}
}
