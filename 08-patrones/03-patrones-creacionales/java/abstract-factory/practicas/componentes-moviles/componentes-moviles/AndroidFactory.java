package edu.pe.utp.patrones_diseno.creacionales.abstract_factory.componentes_moviles;

public class AndroidFactory implements GUIFactory {

    @Override
    public Button createButton() {

        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {

        return new AndroidMenu();
    }
}