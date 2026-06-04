import java.util.Scanner;

public class EvaluarNumeroEntero {

	/*
	 * ESCRIBIR UN PROGRAMA QUE HAGA USO DE ESTRUCTURAS CONDICIONALES DOBLES PARA
	 * REALIZAR CIERTAS OPERACIONES/PROCESOS CON DATOS.
	 * ***********************************************************************
	 * ESCRIBE UN PROGRAMA QUE RECIBA UN NÚMERO ENTERO. SI EL NÚMERO ES PAR, EL
	 * PROGRAMA DEBE MULTIPLICARLO POR 2. SI EL NÚMERO ES IMPAR, DEBE SUMARLE 10.
	 * MUESTRA EL RESULTADO FINAL POR PANTALLA.
	 */

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Ingrese un numero entero: ");
		int number = keyboard.nextInt();

		int newnumber = 0;

		if (number % 2 == 0) {
			newnumber = number * 2;
		} else {
			newnumber = number + 10;
		}
		System.out.printf("Resultado final: %d", newnumber);
		keyboard.close();

	}
}
