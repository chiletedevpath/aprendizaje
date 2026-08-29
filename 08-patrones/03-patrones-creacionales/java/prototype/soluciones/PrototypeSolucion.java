public class PrototypeSolucion {

    static class Plantilla {
        String titulo; Plantilla(String titulo){this.titulo=titulo;}
        Plantilla copiar(){ return new Plantilla(titulo); }
    }
    public static void main(String[] args) {
        // Prototype crea un nuevo objeto copiando una configuración existente.
        Plantilla base = new Plantilla("Reporte");
        Plantilla copia = base.copiar();
        System.out.println(base != copia && base.titulo.equals(copia.titulo));
    }
}
