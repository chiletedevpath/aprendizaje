package patrones.comportamiento.state.reproductor;

public class EstadoDetenido implements EstadoReproductor {

    @Override
    public void play(Reproductor reproductor) {
        System.out.println("Reproduciendo");
        reproductor.setEstado(new EstadoReproduciendo());
    }
}
