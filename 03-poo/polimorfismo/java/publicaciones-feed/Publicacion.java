public class Publicacion {
    private final String autor;
    private final String texto;

    public Publicacion(String autor, String texto) {
        if (autor == null || autor.isBlank() || texto == null || texto.isBlank()) {
            throw new IllegalArgumentException("El autor y el texto son obligatorios.");
        }
        this.autor = autor.trim();
        this.texto = texto.trim();
    }

    public String getAutor() {
        return autor;
    }

    public void mostrar() {
        System.out.println("AUTOR: " + autor + " | Texto: " + texto);
    }
}

