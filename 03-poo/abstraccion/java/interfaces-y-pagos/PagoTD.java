package poo.abstraccion.pagos;

public class PagoTD implements CoreTicketMaster {

    @Override
    public void pagar(double monto) {
        System.out.println("PAGANDO CON TD " + monto);
    }
}


