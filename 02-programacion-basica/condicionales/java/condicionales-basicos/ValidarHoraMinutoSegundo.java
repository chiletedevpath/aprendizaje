import java.util.Scanner;

public class ValidarHoraMinutoSegundo {

	/*
	 * ESCRIBIR UN PROGRAMA EN JAVA QUE LEA LAS HORAS, MINUTOS Y SEGUNDOS
	 * INDIVIDUALMENTE, Y CALCULE QUÉ HORA SERÍA EN EL SIGUIENTE SEGUNDO. VALIDAR
	 * LOS VALORES INGRESADOS DE LAS HORAS (0-23), MINUTOS (0-59) Y SEGUNDOS (0-59).
	 */

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Ingrese la hora: ");
		int hora = keyboard.nextInt();

		System.out.print("Ingrese el minuto: ");
		int minuto = keyboard.nextInt();

		System.out.print("Ingrese el segundo: ");
		int segundo = keyboard.nextInt();

		if (hora < 0 || hora > 23) {
			System.out.print("Ingrese correctamente la hora");
		} else if (minuto < 0 || minuto > 59) {
			System.out.print("Ingrese correctamente el minuto");
		} else if (segundo < 0 || segundo > 59) {
			System.out.print("Ingrese correctamente el segundo");
		} else {
			segundo++;
			if (segundo == 60) {
				segundo = 0;
				minuto++;
				if (minuto == 60) {
					minuto = 0;
					hora++;
					if (hora == 24) {
						hora = 0;
					}
				}
			}
			System.out.printf("Hora actualizada: %02d:%02d:%02d", hora, minuto, segundo);
		}

		keyboard.close();
	}
}