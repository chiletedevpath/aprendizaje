package edu.pe.utp.patrones_diseno.creacionales.abstract_factory.componentes_moviles;

public class AndroidButton implements Button {

    @Override
    public void paint() {

        System.out.println("Botón Android");
    }
}