public class ManipulacionCadenas {

	public static void main(String[] args) {

		String nombre = "Adrian";
		String nombreTwo = new String("Adrian"); // OTRA FORMA DE CREAR UN STRING

		// LENGTH ES PARA SABER LA LONGITUD
		nombre.length();
		nombreTwo.length();

		System.out.println("Mi nombre tiene " + nombre.length() + " letras.\n");

		// CHAR DEVUELVE EL VALOR DE POSICION DE UN OBJETO
		System.out.println("La primera letra de mi nombre es " + nombre.charAt(0) + ".\n");

		// SUBSTRING --> TIENE DOS METODOS --> UNO CON UN SOLO PARAMETRO Y EL OTRO CON
		// DOS PARAMETROS
		String frase = "Soy el mejor programado";

		String subCadenaDosParametros = frase.substring(4, 7); // CONSIDERA QUE NO < O >

		String subCadenaOneParametro = frase.substring(4);

		System.out.println("La cadena extraida es: " + subCadenaDosParametros + ".");
		System.out.println("La cadena extraida es: " + subCadenaOneParametro + ".\n");

		// EQUALS PARA COMPARAR DOS CADENAS Y DEVUELVE UN VALOR BOOLEANO
		String alumnoOne = "Adrian";
		String alumnoTwo = "Ivan";
		String alumnoThree = "Melany";
		String alumnoFor = "adrian";

		System.out.println(alumnoOne.equals(alumnoFor));
		System.out.println(alumnoOne.equalsIgnoreCase(alumnoFor)); // IGNORA MAYUSCULAS CON IGNORE CASE
		System.out.println(alumnoOne.equalsIgnoreCase(alumnoThree));
		System.out.println(alumnoTwo.equalsIgnoreCase(alumnoThree));

		// TOSTRING SOLO FUNCIONA CON TIPOS DE DATOS POR REFERENCIA
		Integer edad = 19;
		Boolean esCorrecto = true;
		Character letra = 'A';
		Float precio = 215.32f;
		Double salario = 2547.6;

		System.out.println("\n" + edad.toString());
		System.out.println(esCorrecto.toString());
		System.out.println(letra.toString());
		System.out.println(precio.toString());
		System.out.println(salario.toString());

	}
}
