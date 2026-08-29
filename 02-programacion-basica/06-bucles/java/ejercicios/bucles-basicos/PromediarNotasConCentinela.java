import java.util.Scanner;

public class PromediarNotasConCentinela {

	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			int estudiantesAprobados = 0;
			int estudiantesDesaprobados = 0;
			double sumaNotas = 0;
			int cantidadNotas = 0;
			boolean continuar = true;

			while (continuar) {
				System.out.print("Ingrese una calificación de 0 a 20 (-1 para terminar): ");
				double nota = teclado.nextDouble();
				teclado.nextLine();

				if (nota == -1) {
					break;
				}

				if (nota < 0 || nota > 20) {
					System.out.println("La calificación debe estar entre 0 y 20.");
					continue;
				}

				cantidadNotas++;
				sumaNotas += nota;

				if (nota >= 11) {
					estudiantesAprobados++;
				} else {
					estudiantesDesaprobados++;
				}

				String respuesta;
				do {
					System.out.print("¿Desea ingresar otra calificación (sí/no)?: ");
					respuesta = teclado.nextLine().trim();

					if (!respuesta.matches("(?i)sí|si|no")) {
						System.out.println("Respuesta inválida. Escriba sí o no.");
					}
				} while (!respuesta.matches("(?i)sí|si|no"));

				continuar = respuesta.matches("(?i)sí|si");
			}

			if (cantidadNotas == 0) {
				System.out.println("No se ingresaron calificaciones válidas.");
				return;
			}

			double promedioGlobal = sumaNotas / cantidadNotas;
			System.out.println("___ RESULTADOS ___");
			System.out.printf("Promedio global: %.2f%n", promedioGlobal);
			System.out.printf("Estudiantes aprobados: %d%n", estudiantesAprobados);
			System.out.printf("Estudiantes desaprobados: %d%n", estudiantesDesaprobados);
		}
	}
}
