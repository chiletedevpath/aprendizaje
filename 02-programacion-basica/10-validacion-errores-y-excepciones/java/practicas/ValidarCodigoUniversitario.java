import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarCodigoUniversitario {

	/*
	 * ESCRIBIR UN PROGRAMA EN JAVA QUE SOLICITE AL USUARIO EL INGRESO DE UN CÓDIGO
	 * UNIVERSITARIO Y VALIDE SU FORMATO. MOSTRAR EL MENSAJE ADECUADO EN CASO NO SE
	 * CUMPLA DICHO FORMATO Y VOLVER A SOLICITAR EL CÓDIGO, USANDO LA ESTRUCTURA
	 * WHILE. (USO DE EXPRESIONES REGULARES A TRAVÉS DE LAS CLASES PATTERN &
	 * MATCHER)
	 */

	public static void main(String[] args) {

		try (Scanner teclado = new Scanner(System.in)) {
			Pattern codigoUniversitario = Pattern.compile("^[Uu]\\d{8}$");
			 
			while (true) {

				System.out.println("INGRESE SU CODIGO UNIVERSITARIO: ");
				String codigo = teclado.next();

				Matcher evaluadorCodigo = codigoUniversitario.matcher(codigo);

				if (evaluadorCodigo.matches()) {
					System.out.println("Codigo correcto");
					break;
				} else {
					System.out.println("Codigo incorrecto.");
				}
			}
		}
	}
}
