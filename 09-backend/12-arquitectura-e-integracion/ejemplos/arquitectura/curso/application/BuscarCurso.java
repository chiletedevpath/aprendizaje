package curso.application;

import curso.domain.Curso;

public final class BuscarCurso {
    private final CursoRepository repositorio;

    public BuscarCurso(CursoRepository repositorio) {
        this.repositorio = repositorio;
    }

    public Curso ejecutar(long id) {
        return repositorio.buscarPorId(id)
                .orElseThrow(() -> new IllegalArgumentException("Curso no encontrado"));
    }
}
