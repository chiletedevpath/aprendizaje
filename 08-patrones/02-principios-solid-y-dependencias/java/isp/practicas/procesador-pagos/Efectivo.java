package edu.pe.utp.principios_solid.casos_practicos.procesador_pagos;

public class Efectivo implements MetodoPago {

    @Override
    public void pagar(double monto) {
        System.out.println("Pagando en efectivo: " + monto);
    }
}