import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalDateTime;

public class CalcularDestinoTuristico {

	/*
	 * ESCRIBIR UN PROGRAMA QUE IMPRIMA UN BOLETO DE VIAJE INTERPROVINCIAL.
	 * CONDICIONES: LOS DATOS DEBEN SER LEÍDOS USANDO SCANNER. DEBEN UTILIZARSE
	 * TODOS LOS TIPOS DE DATOS PRIMITIVOS. HACER USO DE LOS MÉTODOS TOUPPERCASE() Y
	 * TOLOWERCASE() DE LA CLASE STRING.
	 */

	public static void main(String[] args) {
		System.out.printf("****************************************\n");
		System.out.printf("\t\"TURISMO DESTINO FINAL\"\n");
		System.out.printf("****************************************\n");
		System.out.printf("\t  BOLETA ELECTRONICA\n\t  BB069-000010022025\n"); // OJO: SE PUEDE COLOCAR EN OTRA LINEA,
																				// PERO LO
		System.out.printf("****************************************\n"); // DEJO PARA USAR FORMATO

		try (Scanner teclado = new Scanner(System.in)) {

			System.out.printf("INGRESE LOS DATOS DEL PASAJERO\n");
			System.out.println();

			System.out.print("Nombre: ");
			String firstName = teclado.nextLine();

			String miniFirstName = firstName.toLowerCase();

			System.out.print("Apellidos: ");
			String lastName = teclado.nextLine();

			String mayuFirstName = lastName.toUpperCase();

			System.out.print("DNI: ");
			int dni = teclado.nextInt();

			System.out.print("¿Es mayor de edad?: ");
			boolean mayorEdad = teclado.nextBoolean();
			System.out.println();

			teclado.nextLine();

			if (mayorEdad == false) { // TAMBIEN SE PUEDO USAR UN EQUALS CON SI O NO
				System.out.printf("EL PASAJERO ES MENOR DE EDAD, NECESITAR AUTORIZACION DE SUS PADRES");

			} else {
				System.out.println("DATOS INGRESADOS");
				System.out.printf("Nombre completo: %s, %s\n", mayuFirstName, miniFirstName);
				System.out.printf("DNI: %d\n", dni);

				System.out.println();
				System.out.printf("****************************************\n");
				System.out.println();

				System.out.printf("INGRESE LOS DATOS DEL VIAJE\n");
				System.out.println();

				System.out.print("Embarque: ");
				String origen = teclado.next();

				String mayuOrige = origen.toUpperCase();

				System.out.print("Desembarque: ");
				String destino = teclado.next();

				String mayuDestino = destino.toUpperCase();

				System.out.print("Numero de asiento: ");
				int asiento = teclado.nextInt();

				teclado.nextLine();

				System.out.print("Fecha del viaje:");
				String fechaViaje = teclado.nextLine();

				DateTimeFormatter fechaViajeFormateada = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // PRIMERO CAMBIO EL
																									// FORMATO A MOSTRAR
																									// DE LA FECHA

				LocalDate fechaFormateada = LocalDate.parse(fechaViaje, fechaViajeFormateada); // JALAMOS LA FECHA
																								// FORMATEADA

				System.out.print("Precio del pasaje: ");
				double precioPasaje = teclado.nextDouble();
				System.out.println();

				final double igv = 0.18;
				double precioIgv = precioPasaje * igv;
				double precioTotal = precioPasaje + precioIgv;
				LocalDateTime today = LocalDateTime.now();
				
				System.out.println("DATOS INGRESADOS");
				System.out.println("");
				System.out.printf("Ruta: %s - %s\n", mayuOrige, mayuDestino);
				System.out.printf("Nro. Asiento reservado: %d\n", asiento);
				System.out.printf("Fecha actual: %s\n", today.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
				System.out.printf("Fecha programada del viaje: %s\n",
						fechaFormateada.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
				System.out.printf("Precio del pasaje sin IGV: $. %.2f\n", precioPasaje);
				System.out.printf("IGV (18%%): $. %.2f\n", precioIgv);
				System.out.printf("Precio total del pasaje: %.2f\n", precioTotal);

				System.out.println();
				System.out.print("GRACIAS POR SU COMPRA");

			}
		}
	}
}