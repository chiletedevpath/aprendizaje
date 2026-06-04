import java.util.Scanner;

public class CalcularRaizCuadrada {

	/*
	 * ESCRIBIR UN PROGRAMA PARA CALCULAR LA RAÍZ CUADRADA REAL DE UN NÚMERO REAL
	 * CUALQUIERA PEDIDO INICIALMENTE AL USUARIO. COMO DICHA OPERACIÓN NO ESTÁ
	 * DEFINIDA PARA LOS NÚMEROS NEGATIVOS ES NECESARIO TRATAR DE ALGÚN MODO, DICHO
	 * POSIBLE ERROR SIN QUE EL PROGRAMA DETENGA SU EJECUCIÓN. IMPRIMIR EL RESULTADO
	 * DE LA RAÍZ CUADRADA DEL NÚMERO INGRESADO, CON MÁXIMO 2 DECIMALES (USAR
	 * SYSTEM.OUT.PRINTF).
	 * 
	 */

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double numeroReal;
		
		while (true) {
			System.out.print("Ingrese el numero real: ");
			numeroReal = teclado.nextDouble();

			if (numeroReal < 0) {

				System.out.printf("Ingrese un numero positivo\n");
			} else {
				break; 
			
			}
		}

		double raizCuadrada = Math.sqrt(numeroReal);
        System.out.printf("La raiz cuadrada de %.2f es %.2f\n", numeroReal, raizCuadrada);

        teclado.close();
    }
}