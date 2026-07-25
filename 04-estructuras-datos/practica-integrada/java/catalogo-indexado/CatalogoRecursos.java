import java.util.ArrayList;
import java.util.List;

public final class CatalogoRecursos {
    private final List<Recurso> ordenRegistro = new ArrayList<>();
    private final IndiceRecursos indice;

    public CatalogoRecursos(int cantidadCubetas) {
        indice = new IndiceRecursos(cantidadCubetas);
    }

    public boolean registrar(Recurso recurso) {
        if (!indice.insertar(recurso)) {
            return false;
        }
        ordenRegistro.add(recurso);
        return true;
    }

    public Recurso buscar(int codigo) {
        return indice.buscar(codigo);
    }

    public boolean eliminar(int codigo) {
        Recurso recurso = indice.buscar(codigo);
        if (recurso == null) {
            return false;
        }
        indice.eliminar(codigo);
        ordenRegistro.remove(recurso);
        return true;
    }

    public void mostrarEnOrden() {
        for (Recurso recurso : ordenRegistro) {
            System.out.println(recurso);
        }
    }
}
