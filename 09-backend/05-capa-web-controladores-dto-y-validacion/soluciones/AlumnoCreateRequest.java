public record AlumnoCreateRequest(String nombre, String correo, int edad) {
    public AlumnoCreateRequest {
        if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("Nombre obligatorio");
        if (correo == null || !correo.contains("@")) throw new IllegalArgumentException("Correo inválido");
        if (edad < 0) throw new IllegalArgumentException("Edad inválida");
    }
}
