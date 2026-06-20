package edu.pe.utp.principios_solid.casos_practicos.trabajadores_roles;

public class Empleado implements Trabajador, Asistencia, Reportable, Pagable, Capacitable {

    @Override
    public void trabajar() {
        System.out.println("Trabajando...");
    }

    @Override
    public void marcarEntrada() {
        System.out.println("Entrada marcada");
    }

    @Override
    public void marcarSalida() {
        System.out.println("Salida marcada");
    }

    @Override
    public void generarReporte() {
        System.out.println("Generando reporte...");
    }

    @Override
    public void calcularSalario() {
        System.out.println("Calculando salario...");
    }

    @Override
    public void capacitar() {
        System.out.println("Capacitándose...");
    }
}