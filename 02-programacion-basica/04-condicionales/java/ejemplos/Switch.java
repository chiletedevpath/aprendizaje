public class Switch {
    public static void main(String[] args) {
        int opcion = 2;

        // switch selecciona una alternativa según un valor discreto.
        String resultado = switch (opcion) {
            case 1 -> "Java";
            case 2 -> "Scala";
            default -> "Opción no disponible";
        };

        System.out.println(resultado);
    }
}
