public class RetoContador {
    static class Contador {
        private int valor;
        void incrementar() { valor++; }
        int mostrarValor() { return valor; }
    }
    public static void main(String[] args) {
        Contador contador = new Contador();
        contador.incrementar();
        contador.incrementar();
        System.out.println(contador.mostrarValor());
    }
}
