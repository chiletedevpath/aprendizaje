public class BuilderSolucion {

    static class Curso {
        final String nombre; final int horas; final boolean certificado;
        Curso(Builder b) { nombre=b.nombre; horas=b.horas; certificado=b.certificado; }
        static class Builder {
            String nombre; int horas; boolean certificado;
            Builder nombre(String v){nombre=v;return this;} Builder horas(int v){horas=v;return this;}
            Builder certificado(boolean v){certificado=v;return this;} Curso build(){return new Curso(this);}
        }
    }
    public static void main(String[] args) {
        // Builder permite configurar el objeto paso a paso antes de construirlo.
        Curso c = new Curso.Builder().nombre("POO").horas(20).certificado(true).build();
        System.out.println(c.nombre);
    }
}
