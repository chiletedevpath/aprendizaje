public class AlcanceLocal {
    public static void main(String[] args) {
        int puntos = 10;

        if (puntos > 0) {
            // mensaje existe solo dentro de este bloque.
            String mensaje = "Tiene puntos disponibles";
            System.out.println(mensaje);
        }

        System.out.println("Puntos: " + puntos);
    }
}
