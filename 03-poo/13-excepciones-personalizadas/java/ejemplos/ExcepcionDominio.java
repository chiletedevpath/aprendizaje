public class ExcepcionDominio {
    static class SaldoInsuficienteException extends Exception {
        SaldoInsuficienteException(String mensaje){ super(mensaje); }
    }
    static class Cuenta {
        double saldo=50;
        void retirar(double monto) throws SaldoInsuficienteException {
            if (monto > saldo) throw new SaldoInsuficienteException("Saldo insuficiente");
            saldo -= monto;
        }
    }
    public static void main(String[] args){ try { new Cuenta().retirar(80); } catch (SaldoInsuficienteException e){ System.out.println(e.getMessage()); } }
}
