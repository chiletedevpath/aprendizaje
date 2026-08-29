package edu.pe.utp.principios_solid.casos_practicos.pedido_dependencias;

public interface Database {

    void conectar();

    void guardar(String dato);
}
