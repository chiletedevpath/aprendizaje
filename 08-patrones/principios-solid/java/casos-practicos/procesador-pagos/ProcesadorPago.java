package edu.pe.utp.principios_solid.casos_practicos.procesador_pagos;

public class ProcesadorPago {

    public void procesarPago(MetodoPago metodo, double monto) {
        metodo.pagar(monto);
    }

    public void procesarReembolso(MetodoReembolso metodo, double monto) {
        metodo.reembolsar(monto);
    }
}