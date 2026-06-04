import java.util.Scanner;

public class CalcularTipoCambio {
	/*
	 * UNA TIENDA ACEPTA CAMBIO DE PRODUCTOS EN LOS SIGUIENTES CASOS: SI EL PRODUCTO
	 * TIENE UN PRECIO ENTRE 50 Y 80 SOLES Y FUE COMPRADO EL DÍA LUNES (DÍA 1) O SI
	 * EL PRODUCTO TIENE UN PRECIO NO POR DEBAJO DE 120 SOLES Y FUE COMPRADO
	 * CUALQUIER DÍA, EXCEPTO MIÉRCOLES O JUEVES (DÍAS 3 O 4, RESPECTIVAMENTE).
	 * EVALUAR SI PROCEDE O NO EL CAMBIO DEL PRODUCTO. LAS VARIABLES LEÍDAS SON
	 * PRECIO PRODUCTO Y NUMERO DIA
	 */

	public static void main(String[] args) {

		System.out.println("TIENDA DE CAMBIO\n");

		System.out.println("Tener en consideración lo siguiente: ");
		System.out.println("Lunes: 1");
		System.out.println("Martes: 2");
		System.out.println("Miercoles 3");
		System.out.println("Jueves: 4");
		System.out.println("Viernes: 5");
		System.out.println("Sabado: 6");
		System.out.println("Domingo: 7\n");

		System.out.print("Ingrese el precio del producto: ");
		Scanner teclado = new Scanner(System.in);
		double producto = teclado.nextDouble();

		System.out.print("Ingrese el numero del dia de la compra: ");
		int diaCompra = teclado.nextInt();

		if (diaCompra > 0 && diaCompra < 8) {
			if ((producto >= 50 && producto <= 80 && diaCompra == 1)
					|| (producto >= 120 && diaCompra != 3 && diaCompra != 4)) {
				System.out.println("Producto aceptado para cambio");
			} else {
				System.out.println("Producto no aceptado para cambio");
			}
		} else {
			System.out.println("Ingrese un numero de dia correcto");
		}
		teclado.close();
	}
}
