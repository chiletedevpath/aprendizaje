import java.util.Scanner;

public class ReporteProductosTienda {

	/*
	 * DISEÑE UN PROGRAMA EN JAVA QUE SOLICITE AL USUARIO EL NOMBRE Y LA CANTIDAD
	 * VENDIDA DE 5 PRODUCTOS DISTINTOS; LUEGO, EL PROGRAMA DEBE CALCULAR EL TOTAL
	 * DE PRODUCTOS VENDIDOS, IDENTIFICAR EL PRODUCTO CON MAYOR Y MENOR CANTIDAD
	 * VENDIDA, GENERAR UN REPORTE EN FORMATO ASCII (TIPO TABLA) QUE MUESTRE LOS
	 * NOMBRES DE LOS PRODUCTOS Y SUS RESPECTIVAS CANTIDADES, Y FINALMENTE MOSTRAR
	 * UN RESUMEN DE LOS RESULTADOS UTILIZANDO STRING.FORMAT.
	 * 
	 */

	public static void main(String[] args) {

		try (Scanner teclado = new Scanner(System.in)) {

			int totalProductos = 0;
			int masVenta = 0;
			int menosVenta = 0;

			String[] productoElegido = new String[5];
			int[] cantidadesElegidas = new int[5];

			System.out.println("============== TIENDA LOS MICHIS ==============");

			for (int i = 0; i < 5; i++) {

				System.out.println("");

				System.out.println("Producto " + (i + 1));

				System.out.print("Ingrese el nombre de su producto: ");
				productoElegido[i] = teclado.nextLine().toUpperCase();

				System.out.print("Ingrese la cantidad a comprar: ");
				cantidadesElegidas[i] = teclado.nextInt();

				teclado.nextLine();

				totalProductos += cantidadesElegidas[i];

				if (cantidadesElegidas[i] > cantidadesElegidas[masVenta]) {
					masVenta = i;
				} else if (cantidadesElegidas[i] < cantidadesElegidas[menosVenta]) {
					menosVenta = i;
				}
			}
			System.out.println("\n============== REPORTE DE PRODUCTOS ===============");
			System.out.println("+-------------------------+------------------------+");
			System.out.println("| PRODUCTO                | CANTIDAD VENDIDA       +");
			System.out.println("+-------------------------+------------------------+");

			for (int i = 0; i < 5; i++) {
				System.out.printf("| %-23s | %-23d+%n", productoElegido[i], cantidadesElegidas[i]);
			}
			System.out.println("+------------------------+-------------------------+");

			String reporteFinal = String.format(
					"\n=========== INFORME DE VENTAS ===========\n" + "Total de productos vendidos: %d\n"
							+ "Producto con mas ventas: %s (%d und)\n" + "Producto con menos ventas: %s (%d und)\n",
					totalProductos, productoElegido[masVenta], cantidadesElegidas[masVenta],
					productoElegido[menosVenta], cantidadesElegidas[menosVenta]);

			System.out.print(reporteFinal);
		}
	}
}