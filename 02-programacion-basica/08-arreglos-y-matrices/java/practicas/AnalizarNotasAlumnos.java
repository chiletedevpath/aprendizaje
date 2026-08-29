public class AnalizarNotasAlumnos {

	public static void main(String[] args) {

		String[] alumnos = { "Aprendiz DevPath", "Usuario Chilete", "Cliente Chilete", "Estudiante Demo" };
		double[] notas = { 14.5, 9.8, 16.0, 10.0 };
		double sumaNotas = 0;
		double promedioNotas;
		double notaBaja = notas[0];
		double notaAlta = notas[0];
		String alumnoNotaAlta = alumnos[0];
		String alumnoNotaBaja = alumnos[0];

		// Presenta los datos en formato tabular para facilitar la lectura.
		System.out.println("|       Datos de los alumnos         |");
		System.out.println("|------------------------------------|");
		System.out.printf("|%-16s | %-8s | %-12s|%n", "Nombre", "Nota", "Estado");
		System.out.println("|------------------------------------|");

		for (int i = 0; i < alumnos.length; i++) {
			double nota = notas[i];

			// Detiene el proceso si alguna nota esta fuera del rango permitido.
			if (nota < 0 || nota > 20) {
				System.out.println("Nota incorrecta del alumno " + alumnos[i]);
				return;
			}
			System.out.printf("|%-16s | %-8.1f | %-12s|%n", alumnos[i], notas[i],
					(nota >= 11 ? "Aprobado" : "Desaprobado"));

			sumaNotas += notas[i];

			// Actualiza extremos para identificar mejor y peor rendimiento.
			if (nota > notaAlta) {
				notaAlta = nota;
				alumnoNotaAlta = alumnos[i];
			}

			if (nota < notaBaja) {
				notaBaja = nota;
				alumnoNotaBaja = alumnos[i];
			}
		}
		System.out.println("|------------------------------------|");

		promedioNotas = sumaNotas / notas.length;

		System.out.printf("%nEl promedio de las notas es: %.2f%n", promedioNotas);
		System.out.println("La nota mas alta es: " + notaAlta + " y le corresponde al alumno: " + alumnoNotaAlta);
		System.out.println("La nota mas baja es: " + notaBaja + " y le corresponde al alumno: " + alumnoNotaBaja);
	}
}
