import java.util.Scanner;

public class ValidadorCorreoDevPath {

    private static final String DOMINIO_PRACTICA = "@chiletedevpath.test";

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Ingrese correo de practica: ");
            String correo = teclado.nextLine();

            if (esCorreoDevPath(correo)) {
                System.out.println("Correo valido para practica.");
            } else {
                System.out.println("Use un correo de ejemplo con dominio " + DOMINIO_PRACTICA);
            }
        }
    }

    static boolean esCorreoDevPath(String correo) {
        String correoNormalizado = correo.trim().toLowerCase();
        int posicionArroba = correoNormalizado.indexOf("@");
        int inicioDominio = correoNormalizado.length() - DOMINIO_PRACTICA.length();

        return correoNormalizado.endsWith(DOMINIO_PRACTICA)
                && posicionArroba > 0
                && posicionArroba == inicioDominio
                && !correoNormalizado.contains(" ");
    }
}
