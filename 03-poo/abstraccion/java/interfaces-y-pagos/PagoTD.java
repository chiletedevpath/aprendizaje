package poo.abstraccion.pagos;

public class PagoTD implements PasarelaPago {

    @Override
    public void pagar(double monto) {
        validarMonto(monto);
        System.out.printf("Pago con tarjeta de débito: S/ %.2f%n", monto);
    }

    private void validarMonto(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser mayor que cero.");
        }
    }
}


