package patrones.comportamiento.state.reproductor;

public class EstadoReproduciendo implements EstadoReproductor {

    @Override
    public void play(Reproductor reproductor) {
        System.out.println("Pausando");
        reproductor.setEstado(new EstadoPausado());
    }
}
