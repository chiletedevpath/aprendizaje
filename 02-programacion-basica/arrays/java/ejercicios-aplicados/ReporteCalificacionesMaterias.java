import java.util.Scanner;

public class ReporteCalificacionesMaterias {
	/*
	 * CREAR UN PROGRAMA EN JAVA QUE REGISTRE LAS NOTAS DE 4 MATERIAS PARA UN
	 * ESTUDIANTE, DONDE POR CADA MATERIA EL USUARIO INGRESE 3 CALIFICACIONES
	 * PARCIALES; EL PROGRAMA DEBE CALCULAR EL PROMEDIO DE CADA MATERIA, DETERMINAR
	 * SI ESTÁ APROBADA (PROMEDIO >= 12) O REPROBADA, Y FINALMENTE IMPRIMIR UN REPORTE
	 * CON FORMATO DE TABLA QUE TAMBIÉN SE ALMACENE EN UNA CADENA USANDO
	 * STRINGBUILDER.
	 */
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("========================================================================================================");
		System.out.println("=============================== REGISTRO DE NOTAS - COLEGIO NO SE NADA =================================");

		int maxMateria = 4;
		int maxCalificaciones = 3;

		String[] materias = new String[maxMateria];
		double[][] matrizNotas = new double[maxMateria][maxCalificaciones];

		for (int i = 0; i < maxMateria; i++) {
			System.out.printf("%nIngrese el nombre de la materia %d: ", (i + 1));
			materias[i] = teclado.nextLine().toUpperCase();
			for (int j = 0; j < maxCalificaciones; j++) {
				System.out.printf("Ingrese calificacion parcial Nro. %d: ", (j + 1));
                matrizNotas[i][j] = Double.parseDouble(teclado.nextLine());
			}
		}
		teclado.close();

		StringBuilder reporteTable = new StringBuilder();

		reporteTable.append("\n============================================== REPORTE DE NOTAS ===========================================\n");
		reporteTable.append(String.format("%-20s | %-16s | %-16s | %-16s | %-16s | %-16s", "MATERIA", "CALIFICACION 1",
				"CALIFICACION 2", "CALIFICACION 3", "PROMEDIO", "ESTADO"));
		reporteTable.append("\n===========================================================================================================\n");

		for (int i = 0; i < maxMateria; i++) {
			double sumaTotal = 0;
			for (int j = 0; j < maxCalificaciones; j++) {
				sumaTotal += matrizNotas[i][j];
			}
			double promedio = sumaTotal / maxCalificaciones;
			String status = promedio >= 12 ? "APROBADA" : "REPROBADA";

			reporteTable.append(String.format("%-20s | %-16.2f | %-16.2f | %-16.2f | %-16.2f | %-16s\n", materias[i],
					matrizNotas[i][0], matrizNotas[i][1], matrizNotas[i][2], promedio, status));
		}
		System.out.println(reporteTable.toString());
	}
}
