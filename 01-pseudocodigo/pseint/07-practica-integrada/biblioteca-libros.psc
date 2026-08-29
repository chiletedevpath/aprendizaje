Algoritmo Biblioteca_De_Libros
	// Chilete DevPath · Etapa 01: Pseudocódigo
	// Tema: Práctica integrada
	// Objetivo: Integrar varias estructuras de control: Biblioteca libros.
	// Nota: ejecutar, probar y explicar el algoritmo en PSeInt.
	// Registra los prestamos del dia, calcula su costo y resume las categorias atendidas.

	Definir numeroPrestamos, i, idLibro, dias, categoria Como Entero
	Definir librosFiccion, librosNoFiccion, librosReferencia Como Entero
	Definir costoPorDia, costoPrestamo, descuento, totalRecaudado Como Real
	Definir estudiante Como Caracter

	Repetir
		Escribir "Ingrese el numero de prestamos del dia: " Sin Saltar
		Leer numeroPrestamos
	Hasta Que numeroPrestamos > 0

	librosFiccion = 0
	librosNoFiccion = 0
	librosReferencia = 0
	totalRecaudado = 0

	Para i = 1 Hasta numeroPrestamos Hacer
		Escribir " "
		Escribir "Prestamo ", i

		Repetir
			Escribir "Ingrese el ID del libro: " Sin Saltar
			Leer idLibro
		Hasta Que idLibro > 0

		Repetir
			Escribir "Ingrese los dias de prestamo (1 a 30): " Sin Saltar
			Leer dias
		Hasta Que dias >= 1 Y dias <= 30

		Repetir
			Escribir "Ingrese la categoria (1: Ficcion, 2: No ficcion, 3: Referencia): " Sin Saltar
			Leer categoria
		Hasta Que categoria >= 1 Y categoria <= 3

		Repetir
			Escribir "Es estudiante (S/N): " Sin Saltar
			Leer estudiante
		Hasta Que estudiante = "S" O estudiante = "s" O estudiante = "N" O estudiante = "n"

		Segun categoria Hacer
			1:
				costoPorDia = 0.50
				librosFiccion = librosFiccion + 1
			2:
				costoPorDia = 0.75
				librosNoFiccion = librosNoFiccion + 1
			3:
				costoPorDia = 1
				librosReferencia = librosReferencia + 1
		FinSegun

		costoPrestamo = dias * costoPorDia
		Si estudiante = "S" O estudiante = "s" Entonces
			descuento = costoPrestamo * 0.20
		SiNo
			descuento = 0
		FinSi

		costoPrestamo = costoPrestamo - descuento
		totalRecaudado = totalRecaudado + costoPrestamo
		Escribir "Costo del prestamo: S/ ", costoPrestamo
	FinPara

	Escribir " "
	Escribir "Libros de ficcion: ", librosFiccion
	Escribir "Libros de no ficcion: ", librosNoFiccion
	Escribir "Libros de referencia: ", librosReferencia
	Escribir "Total recaudado: S/ ", totalRecaudado

FinAlgoritmo
