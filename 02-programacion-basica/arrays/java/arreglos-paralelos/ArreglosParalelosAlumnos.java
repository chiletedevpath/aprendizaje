import java.util.Scanner;

public class ArreglosParalelosAlumnos {

	/*
	 * ARREGLOS PARALELOS
	 * 
	 * *************************************************************************
	 * CONCEPTO: LOS ARREGLOS PARALELOS SON VARIOS ARREGLOS RELACIONADOS ENTRE SÍ,
	 * DONDE CADA POSICIÓN (ÍNDICE) REPRESENTA UNA "UNIDAD LÓGICA DE DATOS". ES COMO
	 * TENER UNA TABLA EN COLUMNAS: CADA ARREGLO ES UNA COLUMNA, Y CADA ÍNDICE
	 * REPRESENTA UNA FILA (REGISTRO).
	 * 
	 * **************************************************************************
	 * EJEMPLO: PEDIR AL USUARIO CUÁNTOS ALUMNOS DESEA INGRESAR. USAR DOS ARREGLOS
	 * PARALELOS: UNO PARA NOMBRES Y OTRO PARA NOTAS. AL FINAL, IMPRIMIR TODOS LOS
	 * ALUMNOS Y SU NOTA. MOSTRAR QUIÉN OBTUVO LA MEJOR NOTA.
	 */

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Ingrese la cantidad de alumnos a ingresar: ");
		int cantAlumnos = teclado.nextInt();

		String[] nombreAlum = new String[cantAlumnos];
		double[] notaAlum = new double[cantAlumnos];

		if (cantAlumnos >= 1 && cantAlumnos <= 20) {
			for (int i = 0; i < cantAlumnos; i++) {
				teclado.nextLine();
				System.out.println("\n--------------------------------------\n");
				System.out.printf("Ingrese el nombre del alumno %d: ", (i + 1));
				nombreAlum[i] = teclado.nextLine();

				System.out.printf("Ingrese la nota del alumno %s: ", nombreAlum[i]);
				notaAlum[i] = teclado.nextDouble();
			}
			teclado.close();

			double mayorNota = notaAlum[0];
			int indiceMayor = 0;

			System.out.println("\n--------------------------------------\n");

			for (int i = 0; i < cantAlumnos; i++) {
				System.out.println("Alumno(a) " + nombreAlum[i] + " obtuvo un " + notaAlum[i] + " de nota");
				if (notaAlum[i] > mayorNota) {
					mayorNota = notaAlum[i];
					indiceMayor = i;
				}
			}
			System.out.println("\n--------------------------------------\n");
			System.out.println("El alumno " + nombreAlum[indiceMayor] + " obtuvo la mejor nota con un " + mayorNota);

		} else if (cantAlumnos <= 0) {
			System.out.println("La cantidad debe ser mayor que 0");
		} else  {
			System.out.println("La cantidad debe ser mayor que 20");
		}
	}
}