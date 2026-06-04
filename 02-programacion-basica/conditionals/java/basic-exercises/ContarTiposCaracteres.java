public class ContarTiposCaracteres {
	public static void main(String[] args) {

		char[] texto = { 'J', 'a', 'v', 'a', '1', '7', '!', 'R', 'o', 'c', 'k', 's' };

		int contaVocales = 0;
		int contaConsonantes = 0;
		int contaDigitos = 0;
		int contaSimbolo = 0;

		for (int i = 0; i < texto.length; i++) {

			char vocal = texto[i];

			// Normaliza letras minusculas para simplificar la comparacion.
			if (vocal >= 'a' && vocal <= 'z') {
				vocal = (char) (vocal - 32);
			}

			// Clasifica el caracter actual segun vocal, digito, consonante o simbolo.
			switch (vocal) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				contaVocales++;
				break;

			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				contaDigitos++;
				break;

			default:
				if (vocal >= 'A' && vocal <= 'Z') {
					contaConsonantes++;
				} else {
					contaSimbolo++;
				}
			}
		}

		System.out.println("Hay un total de: " + contaVocales + " vocales");
		System.out.println("Hay un total de: " + contaConsonantes + " consonantes");
		System.out.println("Hay un total de: " + contaDigitos + " digitos");
		System.out.println("Hay un total de: " + contaSimbolo + " simbolos");
	}
}
