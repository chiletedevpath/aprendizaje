public class MetodoConRetorno {
    public static void main(String[] args) {
        int total = sumar(8, 4);
        System.out.println("Total: " + total);
    }

    // Los parámetros reciben datos y return entrega el resultado.
    static int sumar(int a, int b) {
        return a + b;
    }
}
