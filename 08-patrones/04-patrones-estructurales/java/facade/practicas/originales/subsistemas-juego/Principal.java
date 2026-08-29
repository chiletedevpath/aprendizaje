package edu.pe.utp.patrones_diseno.estructurales.facade.subsistemas_juego;

public class Principal  {

    public static void main(String[] args) {

        // El usuario usa la fachada
        GameFacade game = new GameFacade();

        game.startGame();
    }
}
