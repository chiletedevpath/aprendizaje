public class CadenasYCaracteres {
    public static void main(String[] args) {
        String entrada = "  Chilete   DevPath  ";

        // Cada operación devuelve una nueva cadena porque String es inmutable.
        String normalizada = entrada.trim().replaceAll("\\s+", " ").toUpperCase();
        int vocales = 0;

        for (char caracter : normalizada.toCharArray()) {
            if ("AEIOU".indexOf(caracter) >= 0) {
                vocales++;
            }
        }

        System.out.println("Texto: " + normalizada);
        System.out.println("Vocales: " + vocales);
    }
}
