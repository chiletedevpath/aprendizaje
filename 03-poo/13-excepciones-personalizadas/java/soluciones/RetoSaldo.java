public class RetoSaldo {
    static class SaldoInsuficienteException extends Exception { SaldoInsuficienteException(double saldo,double monto){ super("Saldo "+saldo+" menor que retiro "+monto); } }
    static class Cuenta { private double saldo; Cuenta(double saldo){this.saldo=saldo;} void retirar(double monto) throws SaldoInsuficienteException { if(monto>saldo) throw new SaldoInsuficienteException(saldo,monto); saldo-=monto; } }
    public static void main(String[] args){ try{ new Cuenta(100).retirar(120); }catch(SaldoInsuficienteException e){ System.out.println(e.getMessage()); } }
}
