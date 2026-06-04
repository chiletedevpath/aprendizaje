public class OrdenarNombresPersonas {
	/*
	 * GENERAR EL REPORTE MOSTRADO. UTILIZAR ARREGLOS PARALELOS INICIALIZADOS.
	 * CALCULAR PROMEDIO POR ALUMNO Y PROMEDIO TOTAL LOS DATOS DEBEN CALCULARSE A
	 * PARTIR DE UNA COPIA DE LOS ARREGLOS PARALELOS. EL REPORTE ASCII DEBE
	 * GENERARSE HACIENDO USO DE STRINGBUILDER.APPEND()
	 * 
	 */
	public static void main(String[] args) {

		String nombres[] = { "Juan Carlos", "Ana Mariela", "Rosa", "Carlos Alberto", "Gabriela Lucia" };
		String apellidos[] = { "Garcia Rodriguez", "Torre Montez", "Inoñan Farro", "Rojas Chan", "Alvites Ch" };
		double edad[] = { 19, 25, 22, 24, 25 };
		double grado[] = { 5, 5, 4, 5, 5 };
		double pc1[] = { 20, 20, 20, 16, 20 };
		double pc2[] = { 19, 17, 18, 18, 20 };
		double pc3[] = { 15, 18, 12, 15, 14 };
		double ef[] = { 17, 16, 13, 12, 15 };

		String copiaNombres[] = nombres.clone();
		String copiaApellidos[] = apellidos.clone();
		double copiaEdad[] = edad.clone();
		double copiaGrado[] = grado.clone();
		double copiaPc1[] = pc1.clone();
		double copiaPc2[] = pc2.clone();
		double copiaPc3[] = pc3.clone();
		double copiaEf[] = ef.clone();

		String nomCompleto[] = new String[copiaNombres.length];

		for (int i = 0; i < copiaNombres.length; i++) {
			nomCompleto[i] = copiaNombres[i] + " " + copiaApellidos[i];
		}

		double promAlum[] = new double[copiaNombres.length];
		double promedio;
		double sumaTotal = 0;
		int CANT_NOTAS = 4;
		
		StringBuilder reporte = new StringBuilder();

		reporte.append("########################### REPORTE DE NOTAS ##########################\n");
		reporte.append(String.format("%-30s %-4s %-4s %-4s %-4s %-4s %-4s %-6s\n", "NOMBRE", "EDAD", "GRADO", "PC1",
				"PC2", "PC3", "EF", "PROM"));
		reporte.append("#######################################################################\n");

		for (int i = 0; i < copiaNombres.length; i++) {
			promAlum[i] = (copiaPc1[i] + copiaPc2[i] + copiaPc3[i] + copiaEf[i]) / CANT_NOTAS;
			sumaTotal += promAlum[i];
			reporte.append(String.format("%-31s %-4.0f %-4.0f %-4.0f %-4.0f %-4.0f %-4.0f %6.2f\n", nomCompleto[i],
					copiaEdad[i], copiaGrado[i], copiaPc1[i], copiaPc2[i], copiaPc3[i], copiaEf[i], promAlum[i]));
		}
		promedio = sumaTotal / copiaNombres.length;
		reporte.append("#######################################################################\n");
		reporte.append(String.format("PROMEDIO TOTAL: %52.2f", promedio));
		reporte.append("\n#######################################################################\n");

		System.out.println(reporte.toString());

	}
}
