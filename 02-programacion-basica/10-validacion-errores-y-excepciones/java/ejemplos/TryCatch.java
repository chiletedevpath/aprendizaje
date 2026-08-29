public class TryCatch {
    public static void main(String[] args) {
        String texto = "abc";

        try {
            // parseInt() lanza NumberFormatException si el texto no representa un entero.
            int numero = Integer.parseInt(texto);
            System.out.println(numero);
        } catch (NumberFormatException e) {
            System.out.println("Entrada no numérica");
        }
    }
}
