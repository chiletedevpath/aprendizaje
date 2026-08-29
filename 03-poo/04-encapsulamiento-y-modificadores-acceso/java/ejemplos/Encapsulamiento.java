public class Encapsulamiento {
    static class Cuenta {
        private double saldo;

        void depositar(double monto) {
            // La clase controla cómo cambia su propio estado.
            if (monto > 0) saldo += monto;
        }

        double getSaldo() { return saldo; }
    }
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        cuenta.depositar(100);
        System.out.println(cuenta.getSaldo());
    }
}
