public class OperadoresYPrecedencia {
    public static void main(String[] args) {
        int a = 8;
        int b = 3;

        // La multiplicación tiene mayor precedencia que la suma.
        int porPrecedencia = a + b * 2;
        int conParentesis = (a + b) * 2;

        // Una expresión lógica combina comparaciones y produce boolean.
        boolean condicion = a > b && b != 0;

        System.out.println("Precedencia: " + porPrecedencia);
        System.out.println("Con paréntesis: " + conParentesis);
        System.out.println("Condición: " + condicion);
    }
}
