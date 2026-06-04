import java.util.Arrays;
import java.util.Scanner;

public class EjecutarOperadorArreglos {

	public static void main(String[] args) {

		int datosVectorInicial[] = { 12, 16, 22, 5, 48, 31 };

		OperadorArreglos opArreglos = new OperadorArreglos(datosVectorInicial);

		// TITULO
		System.out.println("EJERCICIO DE COMO ELIMINAR UN VALOR DE UN ARREGLO CON METODOS\n");

		// EL TO_STRING ES NECESARIO PARA QUE IMPRIMA LOS VALORES REALES Y NO LOS DE LA MEMORIA
		System.out.println("Arreglo Inicial: " + Arrays.toString(opArreglos.arregloUnaLinea()) + "\n");
        
		/*
		System.out.println("Arreglo Ordenado: " + Arrays.toString(opArreglos.arregloOrdenado()) + "\n");
		*/
		
		// INGRESAR EL VALOR A ELIMINAR
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingrese el valor a eliminar: ");
		int valorIngresado = teclado.nextInt();
		
		opArreglos.eliminarVarlor(valorIngresado);
		
		System.out.println("\nArreglo final: " + Arrays.toString(opArreglos.arregloUnaLinea()) + "\n");


		teclado.close();
	}
}
