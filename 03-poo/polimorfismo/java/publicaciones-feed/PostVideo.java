public class PostVideo extends Publicacion {

    private final int duracionSeg;

    public PostVideo(String autor, String texto, int duracionSeg) {
        super(autor, texto);
        if (duracionSeg <= 0) {
            throw new IllegalArgumentException("La duración debe ser mayor que cero.");
        }
        this.duracionSeg = duracionSeg;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println(" Video: " + duracionSeg + " segundos");
    }
}

