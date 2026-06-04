public class EjecutarPlantillaVehiculo {

	public static void main(String[] args) {

		// AQUI INSTANCIO LA CLASE PLANTILLA USANDO:
		// T = STRING PARA COLOR, MARCA Y MODELO
		// A = INTEGER PARA MOTOR
		Plantilla<String, Integer> vehiculo = new Plantilla<>("Negro", "Lamborghini ", 6, "V10");

		// IMPRIMO LOS DATOS DEL VEHICULO USANDO EL METODO TOSTRING
		System.out.println(vehiculo.toString());
	}
}


