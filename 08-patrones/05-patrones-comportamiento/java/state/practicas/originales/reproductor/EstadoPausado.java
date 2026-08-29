package patrones.comportamiento.state.reproductor;

public class EstadoPausado implements EstadoReproductor {

    @Override
    public void play(Reproductor reproductor) {
        System.out.println("Continuando");
        reproductor.setEstado(new EstadoReproduciendo());
    }
}
