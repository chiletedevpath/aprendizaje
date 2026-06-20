import java.util.ArrayList;
import java.util.List;

public class EjecutarRegistroEstudiantes {

	public static void main(String[] args) {

		// INSTANCIO LOS DATOS DE 3 ESTUDIANTES USANDO CLASES Y TIPOS GENERICOS
		// TIPO STRING PARA NOMBRES Y APELLIDOS, Y DOUBLE PARA LAS NOTAS
		Estudiante<String, Double> estudiante1 = new Estudiante<>(new DatosDelEstudiante<>("Estudiante Uno"),
				new DatosDelEstudiante<>("Apellido Ejemplo"), new DatosDelEstudiante<>(20.0), new DatosDelEstudiante<>(5.9));

		Estudiante<String, Double> estudiante2 = new Estudiante<>(new DatosDelEstudiante<>("Estudiante Dos"),
				new DatosDelEstudiante<>("Apellido Demo"), new DatosDelEstudiante<>(9.0), new DatosDelEstudiante<>(13.3));

		Estudiante<String, Double> estudiante3 = new Estudiante<>(new DatosDelEstudiante<>("Aprendiz DevPath"),
				new DatosDelEstudiante<>("Usuario Chilete"), new DatosDelEstudiante<>(17.5),
				new DatosDelEstudiante<>(19.3));

		// CREO UNA LISTA PARA ALMACENAR LOS OBJETOS DE TIPO ESTUDIANTE
		// UTILIZO UNA COLECCION DEL TIPO LISTA (ArrayList) PARA PODER RECORRERLA Y
		// MANEJAR LOS DATOS
		List<Estudiante<String, Double>> listaEstudiantes = new ArrayList<>();
		listaEstudiantes.add(estudiante1);
		listaEstudiantes.add(estudiante2);
		listaEstudiantes.add(estudiante3);

		System.out.println("*********************************************************************");
		System.out.println("** EJERCICIO HACIENDO USO DE CLASES, METODOS Y ATRIBUTOS GENERICOS **");
		System.out.println("*********************************************************************\n");

		// USO UN BUCLE FOR PARA RECORRER LA LISTA DE ESTUDIANTES Y MOSTRAR SU
		// INFORMACION

		for (int i = 0; i < listaEstudiantes.size(); i++) {
			Estudiante<String, Double> student = listaEstudiantes.get(i);

			System.out.println("Nombre y apellidos del estudiante " + (i + 1) + ": " + student.getNombre().getDato()
					+ " " + student.getApellido().getDato());

			System.out.println("Notas del estudiante(a) " + student.getNombre().getDato() + ": "
					+ student.getNotaOne().getDato() + ", " + student.getNotaTwo().getDato());

			System.out.println("El promedio de las notas del alumno(a) " + student.getNombre().getDato() + " es: "
					+ student.promedio());

			System.out.println("----------------------------------------------------------------------\n");
		}
	}
}

