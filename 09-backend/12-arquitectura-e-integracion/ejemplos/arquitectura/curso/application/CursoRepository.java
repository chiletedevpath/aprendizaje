package curso.application;

import curso.domain.Curso;
import java.util.Optional;

// El puerto expresa lo que la aplicación necesita sin depender de JPA o SQL.
public interface CursoRepository {
    Optional<Curso> buscarPorId(long id);
}
