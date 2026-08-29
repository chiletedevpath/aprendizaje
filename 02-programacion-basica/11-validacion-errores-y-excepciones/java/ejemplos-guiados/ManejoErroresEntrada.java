public class ManejoErroresEntrada {
    static Integer convertirEntero(String texto) {
        try {
            return Integer.valueOf(texto.trim());
        } catch (NumberFormatException e) {
            // null se usa aquí solo con fines didácticos para representar conversión fallida.
            return null;
        }
    }

    public static void main(String[] args) {
        String entrada = "20x";
        Integer valor = convertirEntero(entrada);

        if (valor == null) {
            System.out.println("Entrada inválida: se esperaba un entero.");
        } else {
            System.out.println("Valor: " + valor);
        }
    }
}
