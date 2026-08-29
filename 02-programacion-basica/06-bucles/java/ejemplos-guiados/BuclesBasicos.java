public class BuclesBasicos {
    public static void main(String[] args) {
        int suma = 0;

        // for es apropiado cuando conocemos el rango de iteraciones.
        for (int i = 1; i <= 5; i++) {
            suma += i;
        }

        int cuenta = 3;
        // while depende de una condición que debe cambiar durante la ejecución.
        while (cuenta > 0) {
            System.out.println("Cuenta: " + cuenta);
            cuenta--;
        }

        System.out.println("Suma 1..5 = " + suma);
    }
}
