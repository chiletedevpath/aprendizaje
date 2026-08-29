package edu.pe.utp.patrones_diseno.creacionales.abstract_factory.componentes_moviles;

public class IOSFactory implements GUIFactory {

    @Override
    public Button createButton() {

        return new IOSButton();
    }

    @Override
    public Menu createMenu() {

        return new IOSMenu();
    }
}