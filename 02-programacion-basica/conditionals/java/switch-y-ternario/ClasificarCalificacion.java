import java.util.Scanner;

public class ClasificarCalificacion {

	public static void main(String[] args) {

		/*EJERCICIO DE DIFERENCIA DE SWITCH CON IF-ELSE
		 * 
		 * SE PUDO EMPLEAR UN SWITCH CASE MEJORADO --- PERO EN ESTE CASO POR TENER UN
		 * RANGO DE INTERVALOS DE REGULAR TAMANOS, ES PREFERIBLE USAR EL IF-ELSE. EL
		 * 
		 * SWITCH ES UTIL CUANDO SE TRATA DE VALOR FIJOS. EJEMPLO DIAS DE LA SEMANAA
		 */

		try (Scanner teclado = new Scanner(System.in)) {

			System.out.println("Ingrese su calificacion: ");
			int nota = teclado.nextInt();

			String calificacion;

			if (nota >= 0 && nota <= 10) {
				calificacion = "Desaprobado";
			} else if (nota >= 11 && nota <= 13) {
				calificacion = "Regular";
			} else if (nota >= 14 && nota <= 17) {
				calificacion = "Bueno";
			} else if (nota >= 18 && nota <= 20) {
				calificacion = "Excelente";
			} else {
				calificacion = "Calificacion invalida";
			}

			System.out.println("Su calificacion fue " + calificacion);

		}
	}
}
