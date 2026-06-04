import java.util.Scanner;

public class EncuestaSaboresHelado {
	/*
	 * CREAR UN PROGRAMA EN JAVA QUE REGISTRE LOS SABORES DE HELADO FAVORITOS DE 15
	 * PERSONAS, DONDE LOS SABORES DISPONIBLES SON VAINILLA, CHOCOLATE Y FRESA; EL
	 * USUARIO DEBE INGRESAR EL SABOR ELEGIDO POR CADA PERSONA, Y EL PROGRAMA DEBE
	 * CONTAR CUÁNTAS VECES SE ELIGIÓ CADA SABOR, CALCULAR EL PORCENTAJE
	 * CORRESPONDIENTE DE CADA UNO Y DETERMINAR CUÁL FUE EL SABOR MÁS POPULAR,
	 * GENERANDO EL REPORTE FINAL EN UNA CADENA UTILIZANDO STRINGBUILDER Y
	 * MOSTRÁNDOLO CON SYSTEM.OUT.PRINTLN.	
	 * 
	 */

	public static void main(String[] args) {

		try (Scanner teclado = new Scanner(System.in)) {

			String menu = """
					** HELADERIA LOS HELADOS MAS HELADOS **
					=======================================
					** Sabores disponibles:              **
					** [1] Vainilla                      **
					** [2] Chocolate                     **
					** [3] Fresa                         **
					** [4] Salir
					=======================================
					""";
			System.out.println(menu);

			int acumuladorVainilla = 0;
			int acumuladorChocolate = 0;
			int acumuladorFresa = 0;
			int acumuladorIncorrecta = 0;
			int respuestasTotal = 0;

			double porcentajeVainilla, porcentajeChocolate, porcentajeFresa, porcentajeIncorrecto;

			for (int i = 1; i <= 15; i++) {

				System.out.println("Persona " + i);

				System.out.print("Escriba el sabor de su helado: ");
				String saborElegido = teclado.nextLine();

				if (saborElegido.equalsIgnoreCase("Vainilla") || saborElegido.equalsIgnoreCase("Chocolate")
						|| saborElegido.equalsIgnoreCase("Fresa")) {

					if (saborElegido.equalsIgnoreCase("Vainilla")) {
						acumuladorVainilla++;
					} else if (saborElegido.equalsIgnoreCase("Chocolate")) {
						acumuladorChocolate++;
					} else if (saborElegido.equalsIgnoreCase("Fresa")) {
						acumuladorFresa++;
					}
					respuestasTotal++;

				} else if (saborElegido.equalsIgnoreCase("Salir")) {
					System.out.println("Programa finalizado");
					break;
				} else {
					System.out.println("Opcion incorrecta");
					acumuladorIncorrecta++;
				}
			}
			porcentajeVainilla = (acumuladorVainilla * 100) / respuestasTotal;
			porcentajeChocolate = (acumuladorChocolate * 100) / respuestasTotal;
			porcentajeFresa = (acumuladorFresa * 100) / respuestasTotal;
			porcentajeIncorrecto = (acumuladorIncorrecta * 100) / respuestasTotal;

			String saborPopular = "Empate";

			if (porcentajeVainilla > porcentajeChocolate && porcentajeVainilla > porcentajeFresa) {
				saborPopular = "Vainilla";
			} else if (porcentajeChocolate > porcentajeVainilla && porcentajeChocolate > porcentajeFresa) {
				saborPopular = "Chocolate";

			} else if (porcentajeFresa > porcentajeVainilla && porcentajeFresa > porcentajeChocolate) {
				saborPopular = "Fresa";
			}

			StringBuilder reporte = new StringBuilder();

			reporte.append("\n------ REPORTE FINAL ------\n");
			reporte.append(String.format("Vainilla: %d personas (%.2f %%)%n", acumuladorVainilla, porcentajeVainilla));
			reporte.append(
					String.format("Chocolate: %d personas (%.2f %%)%n", acumuladorChocolate, porcentajeChocolate));
			reporte.append(String.format("Fresa: %d personas (%.2f %%)%n", acumuladorFresa, porcentajeFresa));
			reporte.append(
					String.format("Opcion Incorrecta: %d (%.2f %%)%n", acumuladorIncorrecta, porcentajeIncorrecto));
			reporte.append(String.format("Sabor mas popular: %s ", saborPopular));

			System.out.println(reporte.toString());
		}
	}
}
