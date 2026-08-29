import java.util.LinkedList;
import java.util.List;

public final class IndiceRecursos {
    private final List<Recurso>[] cubetas;

    @SuppressWarnings("unchecked")
    public IndiceRecursos(int cantidadCubetas) {
        if (cantidadCubetas <= 0) {
            throw new IllegalArgumentException("La cantidad de cubetas debe ser positiva.");
        }
        cubetas = (List<Recurso>[]) new List<?>[cantidadCubetas];

        for (int i = 0; i < cubetas.length; i++) {
            cubetas[i] = new LinkedList<>();
        }
    }

    public boolean insertar(Recurso recurso) {
        if (recurso == null) {
            throw new IllegalArgumentException("El recurso es obligatorio.");
        }
        if (buscar(recurso.getCodigo()) != null) {
            return false;
        }
        cubetas[indice(recurso.getCodigo())].add(recurso);
        return true;
    }

    public Recurso buscar(int codigo) {
        for (Recurso recurso : cubetas[indice(codigo)]) {
            if (recurso.getCodigo() == codigo) {
                return recurso;
            }
        }
        return null;
    }

    public boolean eliminar(int codigo) {
        return cubetas[indice(codigo)].removeIf(recurso -> recurso.getCodigo() == codigo);
    }

    private int indice(int codigo) {
        return Math.floorMod(codigo, cubetas.length);
    }
}
