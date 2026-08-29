public class RecorrerCaracteres {
    public static void main(String[] args) {
        String palabra = "Chilete";

        // charAt() obtiene el carácter almacenado en una posición.
        for (int i = 0; i < palabra.length(); i++) {
            char caracter = palabra.charAt(i);
            System.out.printf("%d -> %c%n", i, caracter);
        }
    }
}
