public class DecoratorSolucion {

    interface Notificacion { String enviar(); }
    static class Basica implements Notificacion { public String enviar(){return "mensaje";} }
    static class ConAuditoria implements Notificacion {
        private final Notificacion base; ConAuditoria(Notificacion base){this.base=base;}
        public String enviar(){ return base.enviar()+" + auditoría"; }
    }
    public static void main(String[] args) {
        // Decorator agrega comportamiento sin modificar la implementación envuelta.
        System.out.println(new ConAuditoria(new Basica()).enviar());
    }
}
