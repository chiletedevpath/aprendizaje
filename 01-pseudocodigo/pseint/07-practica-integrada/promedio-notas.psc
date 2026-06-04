Algoritmo Sistema_Gestion_Notas
	// Te solicitan crear un algoritmo en pseudocódigo que permita ingresar un número "n" de estudiantes de
	// un salón de clases (la cantidad debe estar entre 2 y 10, si se ingresa un valor diferente se debe volver
	// a pedir hasta que cumpla). Luego, para cada estudiante, ingresar las notas de los 5 cursos (las notas
	// deben estar entre 0 y 20, si se ingresa algo diferente pedirlo nuevamente). Finalmente, calcula el
	// promedio del estudiante y un mensaje "APROBADO", si la nota es mayor o igual a 11 o
	// "DESAPROBADO" si no lo es.
	
	Definir n, i Como Entero
	Definir nota1, nota2, nota3, nota4, nota5, promedioNota Como Real
	
	Repetir
		Escribir "Ingrese la cantidad de estudiantes: " Sin Saltar
		Leer n
	Hasta Que 2 <= n Y n <= 10
	
	Para i = 1 Hasta n Hacer
		Escribir " "
		Escribir "Ingrese las notas del alumno ", i ":"
		
		Repetir
			Escribir "Nota 1: " Sin Saltar
			Leer nota1
		Hasta Que 0 <= nota1 Y nota1 <= 20
		
		Repetir
			Escribir "Nota 2: " Sin Saltar
			Leer nota2
		Hasta Que 0 <= nota2 Y nota2 <= 20
		
		Repetir
			Escribir "Nota 3: " Sin Saltar
			Leer nota3
		Hasta Que 0 <= nota3 Y nota3 <= 20
		
		Repetir
			Escribir "Nota 4: " Sin Saltar
			Leer nota4
		Hasta Que 0 <= nota4 Y nota4 <= 20
		
		Repetir
			Escribir "Nota 5: " Sin Saltar
			Leer nota5
		Hasta Que 0 <= nota5 Y nota5 <= 20
		
		promedioNota = (nota1 + nota2 + nota3 + nota4 + nota5) / 5
		
		Si promedioNota >= 11 Entonces
			Escribir " "
			Escribir "El promedio del alumno ", i ": ", promedioNota
			Escribir "¡¡¡¡  APROBADO  !!!!"
		Sino 
			Escribir " "
			Escribir "El promedio del alumno ", i ": ", promedioNota
			Escribir "¡¡¡¡  DESAPROBADO  !!!!"
		FinSi
	FinPara
	
FinAlgoritmo
