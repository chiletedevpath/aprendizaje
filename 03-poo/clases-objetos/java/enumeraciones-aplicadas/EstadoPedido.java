package poo.enumeraciones;

public enum EstadoPedido {
    PENDIENTE(1,"Pedido registrado"),
    PROCESANDO(2, "Pedido en preparación"),
    ENVIADO(3,"Pedido enviado al cliente"),
    CANCELADO(4, "Pedido cancelado");

    private final int codigo;
    private final String descripcion;

    EstadoPedido(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public static EstadoPedido fromCodigo(int codigo) {
        for(EstadoPedido e : values()){
            if (e.getCodigo() == codigo) {
                return e;
            }
        }
        throw new IllegalArgumentException("Código de estado desconocido: " + codigo);
    }
}


