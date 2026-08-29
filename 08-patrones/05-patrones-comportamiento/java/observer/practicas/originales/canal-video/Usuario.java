package patrones.comportamiento.observer.canal_video;

public class Usuario implements Observador {

    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String tituloVideo) {
        System.out.println("Enviando notificación a " + nombre + ": Nuevo video - " + tituloVideo);
    }
}
