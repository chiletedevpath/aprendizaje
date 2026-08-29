package curso.infrastructure;

import curso.application.CursoRepository;
import curso.domain.Curso;
import java.util.Map;
import java.util.Optional;

// El adaptador implementa el puerto utilizando una tecnología concreta.
public final class RepositorioMemoria implements CursoRepository {
    private final Map<Long, Curso> datos = Map.of(1L, new Curso(1L, "Backend"));

    public Optional<Curso> buscarPorId(long id) {
        return Optional.ofNullable(datos.get(id));
    }
}
