import java.io.*;

//ESTA CLASE CONTIENE EL METODO MAIN, DONDE REALIZO
//LA SERIALIZACION Y LA DESERIALIZACION DEL OBJETO PERSONA.
public class EjecutarSerializacionPersona {

	public static void main(String[] args) {

		// AQUI CREO EL OBJETO PERSONA CON MIS DATOS PERSONALES.
		PersonaSerial persona = new PersonaSerial("NOMBRE", "EJEMPLO", "00000000", "MASCULINO",
				"INGENIERIA DE SISTEMAS E INFORMATICA");

		// SERIALIZACION: GUARDO EL OBJETO DENTRO DE UN ARCHIVO LLAMADO persona.dat
		try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("persona.dat"))) {

			// ESCRIBO EL OBJETO COMPLETO EN EL ARCHIVO.
			salida.writeObject(persona);
			System.out.println("OBJETO SERIALIZADO CORRECTAMENTE.");

		} catch (IOException e) {
			System.out.println("ERROR AL SERIALIZAR EL OBJETO: " + e.getMessage());
		}

		// DESERIALIZACION: RECUPERO EL OBJETO DESDE EL ARCHIVO persona.dat
		try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("persona.dat"))) {

			// LEO EL OBJETO DESDE EL ARCHIVO Y LO CONVIERTO DE NUEVO A TIPO PERSONA.
			PersonaSerial personaRecuperada = (PersonaSerial) entrada.readObject();

			System.out.println("\nOBJETO DESERIALIZADO CORRECTAMENTE.\n");

			// IMPRIMO EL ESTADO COMPLETO DEL OBJETO.
			personaRecuperada.mostrarDatos();

		} catch (IOException | ClassNotFoundException e) {
			System.out.println("ERROR AL DESERIALIZAR EL OBJETO: " + e.getMessage());
		}
	}
}

