import java.util.Scanner;

public class EvaluarNotaAsistencia {

	// 4.4 CONDICIONAL DOBLE ANIDADA EN UNA CONDICIONAL DOBLE
	// ****************************************************
	/*
	 * ESCRIBE UN PROGRAMA QUE RECIBA DOS VALORES: NOTA Y ASISTENCIA. SI LA NOTA
	 * ESTÁ ENTRE 0 Y 100 Y LA ASISTENCIA ES MAYOR O IGUAL AL 75%, ENTONCES EVALUÁ
	 * SI APRUEBA POR NOTA (>=60) O NO. SI NO CUMPLE EL RANGO O LA ASISTENCIA, DEBE
	 * MOSTRAR EL MENSAJE CORRESPONDIENTE.
	 */

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Ingrese su nota: ");
		int note = keyboard.nextInt();

		System.out.print("Ingrese su asistencia (%): ");
		int attendance = keyboard.nextInt();

		if (note >= 0 && note <= 100) {
			if (attendance >= 0 && attendance <= 100) {
				if (attendance >= 75) {
					if (note >= 60) {
						System.out.println("APROBADO... ERES UN DIGNO UTEPINO");
					} else {
						System.out.println("DESAPROBADO POR MALA NOTA");
					}
				} else {
					System.out.println("DESAPROBADO POR INASISTENCIA");
				}
			} else {
				System.out.println("INGRESE CORRECTAMENTE SU ASISTENCIA");
			}
		} else {
			System.out.println("INGRESE CORRECTAMENTE SU NOTA");
		}

		keyboard.close();
	}
}
