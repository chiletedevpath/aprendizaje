package poo.abstraccion.pagos;

public class PagoTC implements CoreTicketMaster{
    @Override
    public void pagar(double monto) {
        System.out.println("Pagando con TC " + monto);
    }
}


