public class RelacionBiblioteca {
    static class Autor { final String nombre; Autor(String nombre){this.nombre=nombre;} }
    static class Libro { final String titulo; final Autor autor; Libro(String titulo, Autor autor){this.titulo=titulo;this.autor=autor;} }
    public static void main(String[] args){ Autor autor=new Autor("Autor demo"); Libro libro=new Libro("POO práctica",autor); System.out.println(libro.titulo+" - "+libro.autor.nombre); }
}
