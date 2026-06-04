public class Libro {

	private String titulo;
	private String autor;
	private int stock;
	public long ISBN;
	private double precio;

	public Libro(String titulo, String autor, int stock, long iSBN, double precio) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.stock = stock;
		ISBN = iSBN;
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

	public long getISBN() {
		return ISBN;
	}

	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
}

