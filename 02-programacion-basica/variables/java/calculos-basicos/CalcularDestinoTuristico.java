import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalcularDestinoTuristico {

	/*
	 * ESCRIBIR UN PROGRAMA QUE IMPRIMA UN BOLETO DE VIAJE INTERPROVINCIAL.
	 * LOS DATOS INGRESADOS SON FICTICIOS Y SE USAN SOLO PARA PRACTICAR FORMATO.
	 */

	public static void main(String[] args) {
		System.out.printf("****************************************\n");
		System.out.printf("\t\"CHILETE TRAVEL DEMO\"\n");
		System.out.printf("****************************************\n");
		System.out.printf("\t  BOLETA ELECTRONICA\n\t  BB069-000010022025\n");
		System.out.printf("****************************************\n");

		try (Scanner teclado = new Scanner(System.in)) {

			System.out.printf("INGRESE LOS DATOS FICTICIOS DEL PASAJERO\n\n");

			System.out.print("Nombre: ");
			String firstName = teclado.nextLine();
			String miniFirstName = firstName.toLowerCase();

			System.out.print("Apellidos: ");
			String lastName = teclado.nextLine();
			String mayuLastName = lastName.toUpperCase();

			System.out.print("Documento ficticio: ");
			int documento = teclado.nextInt();

			System.out.print("Es mayor de edad?: ");
			boolean mayorEdad = teclado.nextBoolean();
			System.out.println();

			teclado.nextLine();

			if (!mayorEdad) {
				System.out.printf("EL PASAJERO ES MENOR DE EDAD, NECESITA AUTORIZACION DE SUS PADRES");
			} else {
				System.out.println("DATOS INGRESADOS");
				System.out.printf("Nombre completo: %s, %s\n", mayuLastName, miniFirstName);
				System.out.printf("Documento ficticio: %d\n", documento);

				System.out.println();
				System.out.printf("****************************************\n\n");

				System.out.printf("INGRESE LOS DATOS DEL VIAJE\n\n");

				System.out.print("Embarque: ");
				String origen = teclado.next();
				String mayuOrigen = origen.toUpperCase();

				System.out.print("Desembarque: ");
				String destino = teclado.next();
				String mayuDestino = destino.toUpperCase();

				System.out.print("Numero de asiento: ");
				int asiento = teclado.nextInt();

				teclado.nextLine();

				System.out.print("Fecha del viaje: ");
				String fechaViaje = teclado.nextLine();

				DateTimeFormatter fechaViajeFormateada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate fechaFormateada = LocalDate.parse(fechaViaje, fechaViajeFormateada);

				System.out.print("Precio del pasaje: ");
				double precioPasaje = teclado.nextDouble();
				System.out.println();

				final double igv = 0.18;
				double precioIgv = precioPasaje * igv;
				double precioTotal = precioPasaje + precioIgv;
				LocalDateTime today = LocalDateTime.now();

				System.out.println("DATOS INGRESADOS");
				System.out.println();
				System.out.printf("Ruta: %s - %s\n", mayuOrigen, mayuDestino);
				System.out.printf("Nro. Asiento reservado: %d\n", asiento);
				System.out.printf("Fecha actual: %s\n", today.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
				System.out.printf("Fecha programada del viaje: %s\n",
						fechaFormateada.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
				System.out.printf("Precio del pasaje sin IGV: S/ %.2f\n", precioPasaje);
				System.out.printf("IGV (18%%): S/ %.2f\n", precioIgv);
				System.out.printf("Precio total del pasaje: S/ %.2f\n", precioTotal);

				System.out.println();
				System.out.print("GRACIAS POR USAR CHILETE TRAVEL DEMO");
			}
		}
	}
}
