import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarCredenciales {
	/*
	 * ESCRIBIR UN PROGRAMA EN JAVA QUE PIDA UNA DIRECCIÓN DE CORREO Y UNA CLAVE DE
	 * ACCESO. MOSTRAR “ACCESO DENEGADO” MIENTRAS EL CORREO NO CUMPLA CON EL FORMATO
	 * CORRECTO (CLASES PATTERN & MATCHING) O MIENTRAS LA CLAVE INGRESADA SEA
	 * DIFERENTE DE UNA CLAVE DE EJEMPLO. HAGA USO DEL BUCLE WHILE. SI SE INGRESAN LAS
	 * CREDENCIALES CORRECTAS SE MOSTRARÁ “BIENVENIDO AL SISTEMA” Y EL PROGRAMA
	 * TERMINA. EL NÚMERO MÁXIMO DE INTENTOS ES 5. SI EL USUARIO EXCEDE EL LÍMITE SE
	 * MOSTRARÁ “CUENTA SUSPENDIDA” Y EL PROGRAMA TERMINA.
	 */

	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {

			int intentos = 0;

			while (intentos < 5) {

				System.out.println("Ingrese su correo: ");
				String correo = teclado.next();

				Pattern patronCorreo = Pattern.compile("^[\\w.]+@[\\w.]+\\.[a-zA-Z]{2,}$");
				Matcher evaluadorCorreo = patronCorreo.matcher(correo);

				System.out.println("Ingrese su contraseña: ");
				String password = teclado.next();

				if (!evaluadorCorreo.matches() || !password.equals("CLAVE_DE_EJEMPLO")) {
					System.out.println("ACCESO DENEGADO");
					intentos++;

					if (intentos >= 5) {
						System.out.println("CUENTA SUSPENDIDA");
					}
				} else {

					System.out.println("BIENVENIDO AL SISTEMA");
					break;
				}
			}
		}
	}
}
