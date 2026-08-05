package patrones.comportamiento.observer.canal_video;

public class Main {

    public static void main(String[] args) {

        CanalYoutube canal = new CanalYoutube();

        Observador usuario1 = new Usuario("Adrian DevPath");
        Observador usuario2 = new Usuario("Comunidad Chilete");

        canal.agregarSuscriptor(usuario1);
        canal.agregarSuscriptor(usuario2);

        canal.subirVideo("Ruta Java Chilete DevPath");
    }
}