public class FuncionesDispersion {

    // Calcula el indice usando division modular.
    public int modular(int clave, int tamano) {
        return clave % tamano;
    }

    // Agrupa la clave en pares de digitos y reduce el resultado al rango de la tabla.
    public int plegamiento(int clave, int tamano) {
        String texto = String.valueOf(clave);
        int suma = 0;

        for (int i = 0; i < texto.length(); i += 2) {
            String parte = texto.substring(i, Math.min(i + 2, texto.length()));
            suma += Integer.parseInt(parte);
        }

        return suma % tamano;
    }

    // Usa la parte decimal de la multiplicacion para distribuir claves.
    public int multiplicacion(int clave, int tamano, double constante) {
        double producto = clave * constante;
        double parteDecimal = producto - Math.floor(producto);
        return (int) (tamano * parteDecimal);
    }
}
