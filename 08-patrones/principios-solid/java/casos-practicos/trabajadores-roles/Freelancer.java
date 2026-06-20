package edu.pe.utp.principios_solid.casos_practicos.trabajadores_roles;

public class Freelancer implements Trabajador, Reportable, Pagable {

    @Override
    public void trabajar() {
        System.out.println("Trabajando freelance...");
    }

    @Override
    public void generarReporte() {
        System.out.println("Generando reporte...");
    }

    @Override
    public void calcularSalario() {
        System.out.println("Calculando pago por proyecto...");
    }
}
