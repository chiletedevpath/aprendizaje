public class VariablesYConstantes {
    public static void main(String[] args) {
        int edad = 20;
        double promedio = 17.5;
        boolean activo = true;
        String lenguaje = "Java";

        // final impide reasignar la constante después de inicializarla.
        final int NOTA_MAXIMA = 20;

        System.out.printf("%s | edad=%d | promedio=%.1f | activo=%s | max=%d%n",
                lenguaje, edad, promedio, activo, NOTA_MAXIMA);
    }
}
