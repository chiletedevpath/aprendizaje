package edu.pe.utp.principios_solid.casos_practicos.pedido_descuento_envio;

public class EnvioStandard implements Envio {

    @Override
    public double calcularCostoEnvio() {
        return 10;
    }
}