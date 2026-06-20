package edu.pe.utp.principios_solid.casos_practicos.pedido_descuento_envio;

public class DescuentoEmpresa implements Descuento {

    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.25;
    }
}