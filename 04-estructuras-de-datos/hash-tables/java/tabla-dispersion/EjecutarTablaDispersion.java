public class EjecutarTablaDispersion {
    public static void main(String[] args) {
        int tamanoTabla = 20;
        int[] claves = { 20, 5, 10, 8, 35, 60, 16, 44 };

        FuncionesDispersion funciones = new FuncionesDispersion();

        // Compara la distribucion de claves con diferentes funciones hash.
        System.out.println("=== Aritmetica Modular ===");
        TablaDispersion tabla1 = new TablaDispersion(tamanoTabla);
        for (int clave : claves) {
            int indice = funciones.modular(clave, tamanoTabla);
            tabla1.insertar(clave, indice);
        }
        tabla1.mostrar();

        System.out.println("\n=== Plegamiento ===");
        TablaDispersion tabla2 = new TablaDispersion(tamanoTabla);
        for (int clave : claves) {
            int indice = funciones.plegamiento(clave, tamanoTabla);
            tabla2.insertar(clave, indice);
        }
        tabla2.mostrar();

        System.out.println("\n=== Multiplicacion ===");
        TablaDispersion tabla4 = new TablaDispersion(tamanoTabla);
        for (int clave : claves) {
            int indice = funciones.multiplicacion(clave, tamanoTabla, 0.6180334);
            tabla4.insertar(clave, indice);
        }
        tabla4.mostrar();
    }
}
