public class Validacion {
    public static void main(String[] args) {
        int nota = 25;

        // Se valida el dominio antes de procesar el dato.
        if (nota < 0 || nota > 20) {
            System.out.println("Nota fuera de rango");
            return;
        }

        System.out.println("Nota válida: " + nota);
    }
}
