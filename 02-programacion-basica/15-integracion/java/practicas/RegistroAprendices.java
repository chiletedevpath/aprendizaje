import java.util.Scanner;

public class RegistroAprendices {
	private static final int CANTIDAD_NOTAS = 3;

	public static void main(String[] args) {
		// Scanner conecta el programa con la entrada estándar (teclado).
		try (Scanner teclado = new Scanner(System.in)) {
			int cantidadAprendices;

			do {
				System.out.print("Cantidad de aprendices (1 a 10): ");
				cantidadAprendices = teclado.nextInt();
				teclado.nextLine();

				if (cantidadAprendices < 1 || cantidadAprendices > 10) {
					System.out.println("La cantidad debe estar entre 1 y 10.");
				}
			} while (cantidadAprendices < 1 || cantidadAprendices > 10);

			String[] nombres = new String[cantidadAprendices];
			double[] promedios = new double[cantidadAprendices];
			String[] estados = new String[cantidadAprendices];
			double sumaPromedios = 0;

			for (int i = 0; i < cantidadAprendices; i++) {
				do {
					System.out.printf("Nombre del aprendiz %d: ", i + 1);
					nombres[i] = normalizarNombre(teclado.nextLine());

					if (nombres[i].isEmpty()) {
						System.out.println("El nombre no puede estar vacío.");
					}
				} while (nombres[i].isEmpty());

				double sumaNotas = 0;

				for (int j = 0; j < CANTIDAD_NOTAS; j++) {
					double nota;

					do {
						System.out.printf("Nota %d de %s: ", j + 1, nombres[i]);
						nota = teclado.nextDouble();

						if (nota < 0 || nota > 20) {
							System.out.println("La nota debe estar entre 0 y 20.");
						}
					} while (nota < 0 || nota > 20);

					sumaNotas += nota;
				}
				teclado.nextLine();

				promedios[i] = calcularPromedio(sumaNotas, CANTIDAD_NOTAS);
				estados[i] = clasificarPromedio(promedios[i]);
				sumaPromedios += promedios[i];
			}

			mostrarReporte(nombres, promedios, estados);
			System.out.printf("Promedio general: %.2f%n",
					calcularPromedio(sumaPromedios, cantidadAprendices));
		}
	}

	static String normalizarNombre(String nombre) {
		return nombre.trim().replaceAll("\\s+", " ");
	}

	static double calcularPromedio(double suma, int cantidad) {
		return suma / cantidad;
	}

	static String clasificarPromedio(double promedio) {
		return promedio >= 11 ? "Aprobado" : "Desaprobado";
	}

	static void mostrarReporte(String[] nombres, double[] promedios, String[] estados) {
		System.out.println("\nREPORTE DE APRENDICES");
		System.out.printf("%-25s %-10s %-12s%n", "Nombre", "Promedio", "Estado");

		for (int i = 0; i < nombres.length; i++) {
			System.out.printf("%-25s %-10.2f %-12s%n", nombres[i], promedios[i], estados[i]);
		}
	}
}
