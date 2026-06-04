public class ContarSoloLetras {

	public static void main(String[] args) {

		char[] vocales = { 'p', 'r', 'o', 'g', 'r', '1', 'm', 'a', 'c', 'i', 'o', 'n' };

		int cantidadVocales = 0;
		int cantidadConsonantes = 0;

		for (int i = 0; i < vocales.length; i++) {

			char letraActual = vocales[i];

			// Procesa solo letras para evitar contar digitos o simbolos como consonantes.
			if (Character.isLetter(letraActual)) {

				letraActual = Character.toLowerCase(letraActual);

				switch (letraActual) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					cantidadVocales++;
					break;

				default:
					cantidadConsonantes++;
					break;
				}
			}
		}

		System.out.println("Cantidad de Vocales: " + cantidadVocales);
		System.out.println("Cantidad de Consonantes: " + cantidadConsonantes);
	}
}
