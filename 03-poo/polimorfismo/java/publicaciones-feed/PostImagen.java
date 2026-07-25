public class PostImagen extends Publicacion {
    private final String urlImagen;

    public PostImagen(String autor, String texto, String urlImagen) {
        super(autor, texto);
        if (urlImagen == null || urlImagen.isBlank()) {
            throw new IllegalArgumentException("La referencia de imagen es obligatoria.");
        }
        this.urlImagen = urlImagen.trim();
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println(" Imagen: " + urlImagen);
    }
}

