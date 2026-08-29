package poo.abstraccion.pagos;

public class DemoInterfacesPagos {
    public static void main(String[] args) {
        // La interfaz permite cambiar el medio de pago sin cambiar el flujo principal.
        PasarelaPago pagoTD = new PagoTD();
        PasarelaPago pagoTC = new PagoTC();

        pagoTD.pagar(100);
        pagoTC.pagar(50);
        pagoTD.pagar(25);
    }
}


