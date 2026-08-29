public class Libro {

	private String titulo;
	private String autor;
	private int stock;
	private long isbn;
	private double precio;

	public Libro(String titulo, String autor, int stock, long isbn, double precio) {
		this.titulo = titulo;
		this.autor = autor;
		this.stock = stock;
		this.isbn = isbn;
		this.precio = precio;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
}

