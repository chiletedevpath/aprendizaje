Algoritmo Resumen_Calificaciones
	// Solucion de referencia del reto 4.

	Definir cantidad, i, aprobados Como Entero
	Definir nota, suma, promedio, mayor, menor Como Real
	Definir datosValidos Como Logico

	Escribir "Ingrese la cantidad de estudiantes: " Sin Saltar
	Leer cantidad

	Si cantidad > 0 Entonces
		suma = 0
		aprobados = 0
		datosValidos = Verdadero

		Para i = 1 Hasta cantidad Hacer
			Escribir "Ingrese la nota ", i, " (0 a 20): " Sin Saltar
			Leer nota

			Si nota >= 0 Y nota <= 20 Entonces
				suma = suma + nota

				Si nota >= 13 Entonces
					aprobados = aprobados + 1
				FinSi

				Si i = 1 Entonces
					mayor = nota
					menor = nota
				SiNo
					Si nota > mayor Entonces
						mayor = nota
					FinSi
					Si nota < menor Entonces
						menor = nota
					FinSi
				FinSi
			SiNo
				datosValidos = Falso
			FinSi
		FinPara

		Si datosValidos Entonces
			promedio = suma / cantidad
			Escribir "Promedio: ", promedio
			Escribir "Notas aprobatorias: ", aprobados
			Escribir "Nota mayor: ", mayor
			Escribir "Nota menor: ", menor
		SiNo
			Escribir "No se genera el resumen porque se ingreso una nota invalida."
		FinSi
	SiNo
		Escribir "La cantidad de estudiantes debe ser mayor que cero."
	FinSi
FinAlgoritmo
