public class RetoNormalizarNombre {
    public static void main(String[] args) {
        String nombre = "  aDRian ivAN pisco  ";
        String normalizado = normalizar(nombre);
        System.out.println(normalizado);
        System.out.println("Vocales: " + contarVocales(normalizado));
    }

    static String normalizar(String texto) {
        String[] palabras = texto.trim().toLowerCase().split("\\s+");
        StringBuilder resultado = new StringBuilder();
        for (String palabra : palabras) {
            if (palabra.isEmpty()) continue;
            // Se capitaliza solo la primera letra de cada palabra.
            resultado.append(Character.toUpperCase(palabra.charAt(0)))
                    .append(palabra.substring(1)).append(' ');
        }
        return resultado.toString().trim();
    }

    static int contarVocales(String texto) {
        int total = 0;
        for (char c : texto.toLowerCase().toCharArray()) {
            if ("aeiouáéíóú".indexOf(c) >= 0) total++;
        }
        return total;
    }
}
