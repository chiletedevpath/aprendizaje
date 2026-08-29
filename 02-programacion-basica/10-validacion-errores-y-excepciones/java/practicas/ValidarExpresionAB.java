import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarExpresionAB {

	public static void main(String[] args) {
		Pattern patronExpresion = Pattern.compile("^([A-Za-z])([A-Za-z])=([1-9]\\d*)$");

		// Scanner conecta el programa con la entrada estándar (teclado).

		try (Scanner teclado = new Scanner(System.in)) {
			Matcher evaluadorExpresion;

			do {
				System.out.print("Ingrese la expresión con el formato AB=N: ");
				String expresion = teclado.nextLine().trim();
				evaluadorExpresion = patronExpresion.matcher(expresion);

				if (!evaluadorExpresion.matches()) {
					System.out.println("Formato incorrecto. Use dos letras y un número positivo, por ejemplo AB=4.");
				} else if (evaluadorExpresion.group(1).equalsIgnoreCase(evaluadorExpresion.group(2))) {
					System.out.println("Las dos letras deben ser diferentes.");
					evaluadorExpresion = patronExpresion.matcher("");
				}
			} while (!evaluadorExpresion.matches());

			char primerCaracter = evaluadorExpresion.group(1).charAt(0);
			char segundoCaracter = evaluadorExpresion.group(2).charAt(0);
			int cantidadFilas = Integer.parseInt(evaluadorExpresion.group(3));
			int fila = 1;

			do {
				String cadenaFila = "";
				int posicion = 0;

				do {
					cadenaFila += posicion % 2 == 0 ? primerCaracter : segundoCaracter;
					posicion++;
				} while (posicion < fila);

				System.out.println(cadenaFila);
				fila++;
			} while (fila <= cantidadFilas);
		}
	}
}
