package patrones.comportamiento.observer.canal_video;

import java.util.ArrayList;
import java.util.List;

public class CanalYoutube {

    private List<Observador> suscriptores = new ArrayList<>();

    public void agregarSuscriptor(Observador observador) {
        suscriptores.add(observador);
    }

    public void eliminarSuscriptor(Observador observador) {
        suscriptores.remove(observador);
    }

    public void subirVideo(String titulo) {
        System.out.println("Nuevo video: " + titulo);
        notificarSuscriptores(titulo);
    }

    private void notificarSuscriptores(String titulo) {
        for (Observador observador : suscriptores) {
            observador.actualizar(titulo);
        }
    }
}
