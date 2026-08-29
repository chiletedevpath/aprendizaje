public record CursoCreateRequest(String nombre, int horas) {
    public CursoCreateRequest {
        // El DTO valida condiciones mínimas del contrato antes de entrar al dominio.
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre es obligatorio");
        }
        if (horas <= 0) {
            throw new IllegalArgumentException("Las horas deben ser mayores que cero");
        }
    }
}
