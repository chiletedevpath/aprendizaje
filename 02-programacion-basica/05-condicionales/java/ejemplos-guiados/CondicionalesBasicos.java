public class CondicionalesBasicos {
    public static void main(String[] args) {
        int nota = 15;
        int asistencia = 85;

        // Primero se valida el dominio de los datos para no clasificar entradas inválidas.
        if (nota < 0 || nota > 20 || asistencia < 0 || asistencia > 100) {
            System.out.println("Datos inválidos");
        } else if (nota >= 11 && asistencia >= 70) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Desaprobado");
        }
    }
}
