public class RetoCuentaAhorro {
    static class CuentaAhorro {
        private double saldo;
        CuentaAhorro(double saldoInicial) { if (saldoInicial < 0) throw new IllegalArgumentException(); saldo = saldoInicial; }
        boolean retirar(double monto) {
            if (monto <= 0 || monto > saldo) return false;
            saldo -= monto;
            return true;
        }
        double getSaldo() { return saldo; }
    }
    public static void main(String[] args) {
        CuentaAhorro cuenta = new CuentaAhorro(100);
        cuenta.retirar(40);
        System.out.println(cuenta.getSaldo());
    }
}
