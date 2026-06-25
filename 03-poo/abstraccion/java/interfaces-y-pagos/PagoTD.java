package poo.abstraccion.pagos;

public class PagoTD implements PasarelaPago {

    @Override
    public void pagar(double monto) {
        System.out.println("Pagando con tarjeta de debito: S/ " + monto);
    }
}


