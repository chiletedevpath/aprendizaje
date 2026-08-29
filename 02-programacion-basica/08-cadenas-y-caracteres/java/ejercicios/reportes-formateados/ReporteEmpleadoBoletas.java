import java.util.Scanner;

public class ReporteEmpleadoBoletas {

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            String nombre = "";
            String tipoEmpleado = "";
            double salario = 0;
            int boletas = 0;
            int mes = 0;
            boolean datosEmpleadoRegistrados = false;
            boolean datosPagoRegistrados = false;
            int opcion;

            do {
                mostrarMenu();
                opcion = teclado.nextInt();
                teclado.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese nombre del empleado: ");
                        nombre = teclado.nextLine().trim();
                        System.out.print("Ingrese tipo de empleado (contratado/nombrado): ");
                        tipoEmpleado = teclado.nextLine().trim();
                        datosEmpleadoRegistrados = !nombre.isEmpty() && !tipoEmpleado.isEmpty();
                        System.out.println(datosEmpleadoRegistrados ? "Empleado registrado." : "Datos incompletos.");
                        break;
                    case 2:
                        System.out.print("Ingrese salario mensual: ");
                        salario = teclado.nextDouble();
                        System.out.print("Ingrese numero de boletas emitidas: ");
                        boletas = teclado.nextInt();
                        System.out.print("Ingrese numero de mes en curso: ");
                        mes = teclado.nextInt();
                        datosPagoRegistrados = salario > 0 && boletas >= 0 && mes >= 1 && mes <= 12;
                        System.out.println(datosPagoRegistrados ? "Datos de pago registrados." : "Datos de pago invalidos.");
                        break;
                    case 3:
                        if (datosEmpleadoRegistrados && datosPagoRegistrados) {
                            String reporte = generarReporte(nombre, tipoEmpleado, salario, boletas, mes);
                            System.out.println(reporte);
                        } else {
                            System.out.println("Complete primero los datos del empleado y del pago.");
                        }
                        break;
                    case 4:
                        System.out.println("Fin del reporte Chilete DevPath.");
                        break;
                    default:
                        System.out.println("Opcion no valida.");
                        break;
                }
            } while (opcion != 4);
        }
    }

    static void mostrarMenu() {
        System.out.println("\n=== Reporte de boletas Chilete DevPath ===");
        System.out.println("1. Registrar empleado");
        System.out.println("2. Registrar datos de pago");
        System.out.println("3. Generar reporte");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opcion: ");
    }

    static String generarReporte(String nombre, String tipoEmpleado, double salario, int boletas, int mes) {
        double promedioPorBoleta = boletas == 0 ? 0 : salario / boletas;

        return String.format(
                "------------------------------%n"
                        + "REPORTE DE BOLETAS%n"
                        + "------------------------------%n"
                        + "Empleado       : %s%n"
                        + "Tipo           : %s%n"
                        + "Mes            : %02d%n"
                        + "Salario        : S/ %.2f%n"
                        + "Boletas        : %d%n"
                        + "Promedio       : S/ %.2f%n"
                        + "------------------------------%n",
                nombre, tipoEmpleado, mes, salario, boletas, promedioPorBoleta);
    }
}
