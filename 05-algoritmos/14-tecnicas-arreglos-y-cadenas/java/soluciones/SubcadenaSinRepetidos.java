import java.util.HashSet;
import java.util.Set;

public class SubcadenaSinRepetidos {
    static int longitudSinRepetidos(String texto) {
        Set<Character> ventana = new HashSet<>();
        int izquierda = 0, mejor = 0;
        for (int derecha = 0; derecha < texto.length(); derecha++) {
            char actual = texto.charAt(derecha);
            // La izquierda avanza hasta eliminar el carácter repetido de la ventana.
            while (ventana.contains(actual)) ventana.remove(texto.charAt(izquierda++));
            ventana.add(actual);
            mejor = Math.max(mejor, derecha - izquierda + 1);
        }
        return mejor;
    }

    public static void main(String[] args) { System.out.println(longitudSinRepetidos("chilete")); }
}
