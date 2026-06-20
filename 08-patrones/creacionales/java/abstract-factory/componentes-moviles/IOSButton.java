package edu.pe.utp.patrones_diseno.creacionales.abstract_factory.componentes_moviles;

class IOSButton implements Button {

    @Override
    public void paint() {

        System.out.println("Botón iPhone");
    }
}