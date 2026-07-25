import java.util.Scanner;

public class GenerarSeriesNumericas {

	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			int opcion;

			do {
				System.out.println("\nElija el tipo de progresión:");
				System.out.println("[1] Aritmética");
				System.out.println("[2] Geométrica");
				System.out.println("[3] Salir");
				System.out.print("Ingrese una opción: ");
				opcion = teclado.nextInt();

				if (opcion == 1 || opcion == 2) {
					String tipoProgresion = opcion == 1 ? "aritmética" : "geométrica";

					System.out.print("Ingrese el valor inicial: ");
					double valorInicial = teclado.nextDouble();

					System.out.print("Ingrese la razón: ");
					double razon = teclado.nextDouble();

					System.out.print("Ingrese el número de términos: ");
					int numeroTerminos = teclado.nextInt();

					if (numeroTerminos <= 0) {
						System.out.println("El número de términos debe ser positivo.");
						continue;
					}

					String cadenaProgresion = "";

					for (int i = 0; i < numeroTerminos; i++) {
						double termino = opcion == 1
								? valorInicial + i * razon
								: valorInicial * Math.pow(razon, i);

						if (i > 0) {
							cadenaProgresion += ", ";
						}
						cadenaProgresion += String.format("%.1f", termino);
					}

					System.out.printf("La progresión %s es: %s%n", tipoProgresion, cadenaProgresion);
				} else if (opcion == 3) {
					System.out.println("Programa finalizado.");
				} else {
					System.out.println("Opción inválida.");
				}
			} while (opcion != 3);
		}
	}
}
