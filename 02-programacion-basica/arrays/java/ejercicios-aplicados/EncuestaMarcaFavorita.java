import java.util.Scanner;

public class EncuestaMarcaFavorita {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int VOTOS_TOTALES = 8;

		int votosToyota = 0;
		int votosFerrari = 0;
		int votosNissan = 0;
		int totalVotos = 0;
		
		System.out.println("Marcas a elegir: Toyota, Ferrari, Nissan");

		while (totalVotos < VOTOS_TOTALES) {
			System.out.print("Ingrese su marca favorita: ");
			String voto = teclado.nextLine();
			
			if (voto.equalsIgnoreCase("toyota")) {
				votosToyota++;
				totalVotos++;
			} else if (voto.equalsIgnoreCase("ferrari")) {
				votosFerrari++;
				totalVotos++;
			} else if (voto.equalsIgnoreCase("nissan")) {
				votosNissan++;
				totalVotos++;
			} else {
				System.out.println("Marca no registrada. Vuelva a intentarlo.");
			}
		}

		double porcentajeToyota = (votosToyota * 100.0) / VOTOS_TOTALES;
		double porcentajeFerrari = (votosFerrari * 100.0) / VOTOS_TOTALES;
		double porcentajeNissan = (votosNissan * 100.0) / VOTOS_TOTALES;

		String marcaGanadora = "Empate";
		if (votosToyota > votosFerrari && votosToyota > votosNissan) {
			marcaGanadora = "Toyota";
		} else if (votosFerrari > votosToyota && votosFerrari > votosNissan) {
			marcaGanadora = "Ferrari";
		} else if (votosNissan > votosToyota && votosNissan > votosFerrari) {
			marcaGanadora = "Nissan";
		}

		String reporte = String.format(
				"----- RESULTADOS -----\n" + "Toyota: %d votos (%.2f%%)\n" + "Ferrari: %d votos (%.2f%%)\n"
						+ "Nissan: %d votos (%.2f%%)\n" + "La marca ganadora es: %s\n",
				votosToyota, porcentajeToyota, votosFerrari, porcentajeFerrari, votosNissan, porcentajeNissan,
				marcaGanadora);

		System.out.println("\n" + reporte);

		teclado.close();
	}
}