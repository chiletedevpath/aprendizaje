import java.util.Scanner;

public class ClasificarNotaAlumno {

	/*
	 * DADA LA NOTA MEDIA DE UN ALUMNO OBTENER SU EQUIVALENTE EN LETRAS. SUSPENSO:
	 * SI 0 <= NOTA < 10, APROBADO: SI 10 <= NOTA < 14 NOTABLE, SI 14 <= NOTA < 18,
	 * SOBRESALIENTE: SI 18 <= NOTA < 20, MATRICULA DE HONOR: SI NOTA = 20, O UN
	 * ERROR EN CUALQUIER OTRO CASO.
	 * 
	 * UTILIZAR SOLO SWITCH MEJORADO CON PATTERN MATCHING
	 */

	public enum CalificacionNota {
		SUSPENSO, APROBADO, NOTABLE, SOBRESALIENTE, MATRICULA_DE_HONOR
	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Ingrese la nota del alumno: ");
		Integer nota = teclado.nextInt();

		CalificacionNota resultado = switch (nota) {
		case Integer n when (0 <= n && n < 10) -> CalificacionNota.SUSPENSO;
		case Integer n when (10 <= n && n < 14) -> CalificacionNota.APROBADO;
		case Integer n when (14 <= n && n < 18) -> CalificacionNota.NOTABLE;
		case Integer n when (18 <= n && n < 20) -> CalificacionNota.SOBRESALIENTE;
		case Integer n when (20 == n) -> CalificacionNota.MATRICULA_DE_HONOR;
		default -> {
			System.out.println("Nota fuera de rango.");
            yield null;
		}
		};

		 if (resultado != null) {
	            System.out.println("La calificación del alumno es: " + resultado);
	        } else {
	            System.out.println("Por favor ingrese una nota válida entre 0 y 20.");
	        }

	        teclado.close();
	}
}
