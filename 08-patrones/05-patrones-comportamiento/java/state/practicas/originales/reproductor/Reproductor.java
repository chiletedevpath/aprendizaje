package patrones.comportamiento.state.reproductor;

public class Reproductor {

    private EstadoReproductor estado;

    public Reproductor() {
        this.estado = new EstadoDetenido();
    }

    public void setEstado(EstadoReproductor estado) {
        this.estado = estado;
    }

    public void play() {
        estado.play(this);
    }
}