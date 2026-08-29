package edu.pe.utp.principios_solid.casos_practicos.pedido_dependencias;

public class MySQLDatabase implements Database {

    @Override
    public void conectar() {
        System.out.println("Conectando a MySQL...");
    }

    @Override
    public void guardar(String dato) {
        System.out.println("Guardando en MySQL: " + dato);
    }
}
