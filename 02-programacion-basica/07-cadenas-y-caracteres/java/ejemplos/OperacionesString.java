public class OperacionesString {
    public static void main(String[] args) {
        String curso = "  Java Básico  ";

        // trim() elimina espacios al inicio y al final.
        String limpio = curso.trim();
        System.out.println(limpio.toUpperCase());
        System.out.println("Longitud: " + limpio.length());
    }
}
