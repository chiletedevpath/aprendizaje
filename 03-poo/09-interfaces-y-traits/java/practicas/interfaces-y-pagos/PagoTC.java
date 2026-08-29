package poo.abstraccion.pagos;

public class PagoTC implements PasarelaPago {
    @Override
    public void pagar(double monto) {
        validarMonto(monto);
        System.out.printf("Pago con tarjeta de crédito: S/ %.2f%n", monto);
    }

    private void validarMonto(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser mayor que cero.");
        }
    }
}


