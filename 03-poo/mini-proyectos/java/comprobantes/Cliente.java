public class Cliente {

	public void setDNI(String DNI) throws Exception {
		if (esDNIValido(DNI)) {
		} else {
			throw new Exception("DNI no es valido");
		}
	}
	private boolean esDNIValido(String DNI) {
		return DNI.matches("\\d{8}");
	}

}

