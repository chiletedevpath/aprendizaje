// LA CLASE CUADRADO TAMBIEN HEREDA DE FIGURA (ESPECIALIZACION)
// ADEMAS IMPLEMENTA LA INTERFAZ DIBUJABLE
public class Cuadrado extends Figura implements Dibujable {

	// ATRIBUTO
	private double lado;

	// CONSTRUCTOR PARA INICIALIZAR EL LADO
	public Cuadrado(double lado) {
		this.lado = lado;
	}

	// IMPLEMENTACION DEL METODO ABSTRACTO DE FIGURA
	// AQUI TAMBIEN APLICO POLIMORFISMO
	@Override
	public double calcularArea() {
		return lado * lado;
	}

	// IMPLEMENTACION DEL METODO DE LA INTERFAZ DIBUJABLE
	@Override
	public void dibujar() {
		System.out.println("Dibujando un cuadrado");
	}
}

