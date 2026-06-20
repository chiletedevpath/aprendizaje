package edu.pe.utp.patrones_diseno.creacionales.abstract_factory.componentes_moviles;

public class Principal {

    public static void main(String[] args) {

            // Elegir plataforma
            GUIFactory factory = new AndroidFactory();

            // Crear objetos relacionados
            Button btn = factory.createButton();

            Menu menu = factory.createMenu();

            btn.paint();

            menu.show();
        }
    }
