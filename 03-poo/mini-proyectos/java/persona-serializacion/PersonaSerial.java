import java.io.*;

//ESTA CLASE REPRESENTA A UNA PERSONA Y LA MARCO COMO SERIALIZABLE
//PARA PODER GUARDAR SU ESTADO EN UN ARCHIVO. AQUI DEFINO MIS DATOS
//PERSONALES SEGUN LOS CAMPOS QUE PIDE EL EJERCICIO.

public class PersonaSerial implements Serializable {

	private static final long serialVersionUID = 1L;

	// ATRIBUTOS DEL OBJETO QUE SE SERIALIZARA.
	private String nombre;
	private String apellidos;
	private String dni;
	private String genero;
	private String carrera;

	// CONSTRUCTOR PARA INICIALIZAR LOS VALORES DEL OBJETO.
	public PersonaSerial(String nombre, String apellidos, String dni, String genero, String carrera) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.genero = genero;
		this.carrera = carrera;
	}

	// METODO QUE ME PERMITE MOSTRAR EN CONSOLA TODOS LOS DATOS
	// UNA VEZ QUE EL OBJETO HA SIDO DESERIALIZADO DESDE EL ARCHIVO.
	public void mostrarDatos() {
		System.out.println("NOMBRE: " + nombre);
		System.out.println("APELLIDOS: " + apellidos);
		System.out.println("DNI: " + dni);
		System.out.println("GENERO: " + genero);
		System.out.println("CARRERA: " + carrera);
	}
}

