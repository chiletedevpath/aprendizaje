package edu.pe.utp.principios_solid.casos_practicos.pedido_descuento_envio;

public class SinDescuento implements Descuento {

    @Override
    public double aplicarDescuento(double monto) {
        return 0;
    }
}