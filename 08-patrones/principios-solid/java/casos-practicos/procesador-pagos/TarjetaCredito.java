package edu.pe.utp.principios_solid.casos_practicos.procesador_pagos;

public class TarjetaCredito implements MetodoPago, MetodoReembolso {

    @Override
    public void pagar(double monto) {
        System.out.println("Pagando con tarjeta: " + monto);
    }

    @Override
    public void reembolsar(double monto) {
        System.out.println("Reembolsando a tarjeta: " + monto);
    }
}