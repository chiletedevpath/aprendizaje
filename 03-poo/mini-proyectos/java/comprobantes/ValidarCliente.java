public class ValidarCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		try {
			cliente.setDNI("0000000x");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

		System.out.println("El programa termino");
	}

}

