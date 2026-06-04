import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PromediarNotasConCentinela {
	/*
	 * ESCRIBIR UN PROGRAMA EN JAVA QUE SOLICITE AL USUARIO LAS CALIFICACIONES DE
	 * LOS ESTUDIANTES DE UN CURSO. EL PROGRAMA TERMINA CUANDO EL USUARIO YA NO
	 * DESEA INGRESAR MÁS NOTAS O CUANDO INGRESA UNA NOTA IGUAL A -1. AL TERMINAR,
	 * DEBERÁ MOSTRAR EL PROMEDIO GLOBAL, ASÍ COMO EL NÚMERO DE ESTUDIANTES
	 * APROBADOS Y DESAPROBADOS.
	 */
	public static void main(String[] args) {

		try (Scanner teclado = new Scanner(System.in)) {
			double promedioGlobal;
			int estudiantesAprobados = 0;
			int estudiantesDesaprobados = 0;
			double sumaNotas = 0;
			int cantidadNotas = 0;

			while (true) {
				System.out.println("Ingrese la calificacion: ");
				double nota = teclado.nextInt();
				teclado.nextLine();

				if (nota == -1) {
					System.out.println("Nota igual a -1");
					break;
				}
				if (nota >= 0 && nota <= 20) {
					cantidadNotas++;
					sumaNotas += nota;

					if (nota >= 11) {
						estudiantesAprobados++;
					} else {
						estudiantesDesaprobados++;
					}
					System.out.println("¿Desea ingresar mas notas?");
					String respuesta = teclado.nextLine();

					Pattern patron = Pattern.compile("(?i)^(si|sí|no|nó)$");
					Matcher evaluadorRespuesta = patron.matcher(respuesta);

					if (evaluadorRespuesta.matches()) {
						if (respuesta.equalsIgnoreCase("no") || respuesta.equalsIgnoreCase("nó")) {
							System.out.println("Programa terminado");
							break;
						}
					} else {
						System.out.println("Utilice Si o No");
					}
				} else {
					System.out.println("Nota fuera del rango entre 0 y 20");
				}
			}
			if (cantidadNotas > 0) {
				promedioGlobal = sumaNotas / cantidadNotas;
				
				System.out.println("___ DATOS ___");
				System.out.printf("El promedio global: %.2f%n", promedioGlobal);
				System.out.printf("Estudiantes aprobados: %d%n", estudiantesAprobados);
				System.out.printf("Estudiantes desaprobados: %d%n", estudiantesDesaprobados);
			} else {
				System.out.println("No se ingresaron notas o las notas fueron incorrectas.");
			}
		}
	}
}
