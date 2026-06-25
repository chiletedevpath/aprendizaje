import java.util.Scanner;

public class NormalizarNombreDevPath {

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Ingrese su nombre para Chilete DevPath: ");
            String nombre = teclado.nextLine();

            String nombreNormalizado = normalizar(nombre);
            System.out.println("Nombre normalizado: " + nombreNormalizado);
        }
    }

    static String normalizar(String texto) {
        String limpio = texto.trim().replaceAll("\\s+", " ").toLowerCase();

        if (limpio.isEmpty()) {
            return "Sin nombre";
        }

        String[] palabras = limpio.split(" ");
        StringBuilder resultado = new StringBuilder();

        for (String palabra : palabras) {
            if (resultado.length() > 0) {
                resultado.append(" ");
            }
            resultado.append(Character.toUpperCase(palabra.charAt(0)));
            resultado.append(palabra.substring(1));
        }

        return resultado.toString();
    }
}
