public class EstadoYComportamiento {
    static class Contador {
        int valor;

        void incrementar() {
            // El método modifica el estado del mismo objeto.
            valor++;
        }
    }

    public static void main(String[] args) {
        Contador contador = new Contador();
        contador.incrementar();
        System.out.println(contador.valor);
    }
}
