package poo.abstraccion.pagos;

public class PagoTC implements PasarelaPago {
    @Override
    public void pagar(double monto) {
        System.out.println("Pagando con tarjeta de credito: S/ " + monto);
    }
}


