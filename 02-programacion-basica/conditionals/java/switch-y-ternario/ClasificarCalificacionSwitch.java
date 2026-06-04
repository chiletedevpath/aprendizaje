import java.util.Scanner;

public class ClasificarCalificacionSwitch {
	/*
	 * HAZ UN PROGRAMA QUE: 1. PIDA AL USUARIO SU CALIFICACIÓN DE 0 A 20. 2. USE
	 * SWITCH MEJORADO PARA MOSTRAR: 18–20: "EXCELENTE" 14–17: "BUENO" 11–13:
	 * "REGULAR" 00–10: "DESAPROBADO" OTROS: "CALIFICACIÓN INVÁLIDA"
	 * 
	 */

	public static void main(String[] args) {

		try (Scanner teclado = new Scanner(System.in)) {

			System.out.println("Ingrese su calificacion: ");
			int nota = teclado.nextInt();
			
			String calificacion = switch (nota) {
			case 20, 19, 18 -> "Excelente";
			case 17, 16, 15, 14 -> "Bueno";
			case 13, 12, 11 -> "Regular";
			case 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 -> "Desaprobado";
			default -> "Calificacion invalida";
			};
			
			System.out.println("Su calificacion fue " + calificacion);

		}
	}
}
