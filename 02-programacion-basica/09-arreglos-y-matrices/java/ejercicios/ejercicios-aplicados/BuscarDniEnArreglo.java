import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BuscarDniEnArreglo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String[] baseDcoumentos = { "00000001", "00000002", "00000003", "00000004", "00000005", "00000006", "00000007",
				"00000008", "00000009", "00000010" };

		String dniIngresado = "";
		boolean esValido = false;

		Pattern patronDNI = Pattern.compile("^\\d{8}$");

		while (!esValido) {
			System.out.print("Ingrese su DNI: ");
			dniIngresado = teclado.nextLine();

			Matcher matcher = patronDNI.matcher(dniIngresado);

			if (matcher.matches()) {

				boolean encontrado = false;
				for (int i = 0; i < baseDcoumentos.length; i++) {
					if (baseDcoumentos[i].equals(dniIngresado)) {
						encontrado = true;
						break;
					}
				}

				if (encontrado) {
					System.out.println("DNI registrado en la base de datos ");
					esValido = true;
				} else {
					System.out.println("Formato correcto del DNI, pero no esta registrado");
				}

			} else {
				System.out.println("Numero de DNI incorrecto");
			}
		}
		teclado.close();
	}

}
