import java.util.Scanner;

public class EncuestaMarcaFavorita {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int VOTOS_TOTALES = 8;

		int votosOpcionA = 0;
		int votosOpcionB = 0;
		int votosOpcionC = 0;
		int totalVotos = 0;
		
		System.out.println("Opciones a elegir: Opcion A, Opcion B, Opcion C");

		while (totalVotos < VOTOS_TOTALES) {
			System.out.print("Ingrese su opcion favorita: ");
			String voto = teclado.nextLine();
			
			if (voto.equalsIgnoreCase("opcion a")) {
				votosOpcionA++;
				totalVotos++;
			} else if (voto.equalsIgnoreCase("opcion b")) {
				votosOpcionB++;
				totalVotos++;
			} else if (voto.equalsIgnoreCase("opcion c")) {
				votosOpcionC++;
				totalVotos++;
			} else {
				System.out.println("Opcion no registrada. Vuelva a intentarlo.");
			}
		}

		double porcentajeOpcionA = (votosOpcionA * 100.0) / VOTOS_TOTALES;
		double porcentajeOpcionB = (votosOpcionB * 100.0) / VOTOS_TOTALES;
		double porcentajeOpcionC = (votosOpcionC * 100.0) / VOTOS_TOTALES;

		String opcionGanadora = "Empate";
		if (votosOpcionA > votosOpcionB && votosOpcionA > votosOpcionC) {
			opcionGanadora = "Opcion A";
		} else if (votosOpcionB > votosOpcionA && votosOpcionB > votosOpcionC) {
			opcionGanadora = "Opcion B";
		} else if (votosOpcionC > votosOpcionA && votosOpcionC > votosOpcionB) {
			opcionGanadora = "Opcion C";
		}

		String reporte = String.format(
				"----- RESULTADOS -----\n" + "Opcion A: %d votos (%.2f%%)\n" + "Opcion B: %d votos (%.2f%%)\n"
						+ "Opcion C: %d votos (%.2f%%)\n" + "La opcion ganadora es: %s\n",
				votosOpcionA, porcentajeOpcionA, votosOpcionB, porcentajeOpcionB, votosOpcionC, porcentajeOpcionC,
				opcionGanadora);

		System.out.println("\n" + reporte);

		teclado.close();
	}
}
