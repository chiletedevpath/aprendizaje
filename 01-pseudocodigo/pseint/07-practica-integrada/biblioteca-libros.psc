Algoritmo Biblioteca_De_libros
	// Como experto en algoritmos, te solicitan crear un algoritmo en pseudocódigo que debe solicitar
	// al usuario que ingrese el número de préstamos "n" del día. Luego, para cada préstamo, debes solicitar 
	// al usuario que ingrese 4 datos: el ID del libro, los días de préstamo, la categoría del libro
	// (1: Ficción, 2: No ficción, 3: Referencia) y si el usuario es estudiante (S/N). 
	//Calcula el costo del préstamo (Ficción: $0.5/día, No ficción: $0.75/día, Referencia: $1/día, con 20% de 
	// descuento para estudiantes), y al final, muestra el total recaudado y el número de libros prestados por categoría.
	// Consideraciones:
	//	Se debe validar que el ID del libro sea un número positivo.
	// Los días de préstamo deben estar entre 1 y 30.
	//	La categoría debe ser 1, 2 o 3.
	// La respuesta de si es estudiante debe ser 'S' o 'N'.
	//	No se debe interrumpir la ejecución si un valor es erróneo, se debe volver a pedir.
	
	Definir num, i, ID, dias, categoria, acumulador Como Entero
	Definir costoxdia, descuento, totalRecaudado Como Real
	Definir estudiante Como Caracter
	
	Escribir "Ingrese el número a prestar del día: " Sin Saltar
	Leer num
	
	acumulador <- 0
	Para i = 1 Hasta num Hacer
		
		Repetir
			Escribir "Ingrese el ID del libro ", i " :" Sin Saltar
			Leer ID	
			
			Repetir
				Escribir "Ingrese la cantidad de dias a prestar: " Sin Saltar
				Leer dias
				
				Repetir
						Escribir "Ingrese la categoria del libro a prestar: " Sin Saltar
						Leer categoria
						
						Segun categoria Hacer
							1: Escribir "Libro de Ficción" 
								costoxdia = dias * 0.5
							2: Escribir "Libro de No ficción"
								costoxdia = dias * 0.75
							3: Escribir "Libro de Referencia"
								costoxdia = dias * 1
						FinSegun
					Hasta Que 1 <= categoria y categoria <= 3
					
			Hasta Que 1 <= dias y dias <= 30
			
			Repetir
				Escribir "¿Es estudiante (Responda con S o N)?" Sin Saltar
				Leer estudiante	
			Hasta Que estudiante = "S" O estudiante = "N" O estudiante = "s" O estudiante = "n"
			
			Si estudiante = "S" o estudiante = "s" Entonces
				descuento = costoxdia * 0.20
			SiNo
				Si estudiante = "N" o estudiante = "n" Entonces
					descuento = 0
				FinSi
			FinSi
			
		Hasta Que ID > 0
		
		acumulador <- categoria + 1
		totalRecaudado = costoxdia - descuento
		Escribir "Numero de libros prestados por categoria ", categoria " es: ", acumulador			
	FinPara
		
	Escribir "El total recaudado es: ", totalRecaudado
	
FinAlgoritmo
