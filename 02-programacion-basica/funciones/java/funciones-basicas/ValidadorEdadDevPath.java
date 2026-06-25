import java.util.Scanner;

public class ValidadorEdadDevPath {

    private static final int EDAD_MINIMA = 13;

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Registro de comunidad Chilete DevPath");
            System.out.print("Ingrese su edad: ");
            int edad = teclado.nextInt();

            if (puedeRegistrarse(edad)) {
                System.out.println("Registro permitido para la comunidad.");
            } else {
                System.out.println("Registro no permitido por edad minima.");
            }
        }
    }

    static boolean puedeRegistrarse(int edad) {
        return edad >= EDAD_MINIMA;
    }
}
