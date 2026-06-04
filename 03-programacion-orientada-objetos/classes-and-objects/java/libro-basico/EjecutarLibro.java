public class EjecutarLibro {

	public static void main(String[] args) {

		Libro libro = new Libro("Infierno a mil", "Adrian Pisco", 258, 25789365, 25.60566);

		System.out.printf("TITULO:%s\nAUTOR:%s\nSTOCK:%d\nISBN:%d\nPRECIO:%.2f\n", libro.getTitulo(), libro.getAutor(),
				libro.getStock(), libro.getISBN(), libro.getPrecio());

	}

}

