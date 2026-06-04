Algoritmo Cubos_De_Numeros_Comprendidos_Solucion_Para
	// Un matemático necesita desarrollar un algoritmo para enseñar a sus estudiantes
	// sobre los números cúbicos. Como experto en algoritmos te solicita crear un
	// algoritmo en pseudocódigo que debe solicitar al usuario que ingrese un número
	// "n". Luego, debes calcular y mostrar el cubo de cada número natural desde 1
	// hasta "n". Por ejemplo, si un usuario ingresa el número 5. El algoritmo muestra
	// los cubos de los números del 1 al 5 (1, 8, 27, 64, 125).
	// Consideraciones
	// "n" es un valor que se ingresa.
	// Validar que "n" es un valor positivo.
	// Emplear la estructura PARA y MIENTRAS (2 soluciones).
	
	Definir num, i Como Entero

	Repetir
		Escribir "Ingrese un numero: " Sin Saltar
		Leer num
	Hasta Que num > 0
	
	Para i = 1 Hasta num Hacer
		Escribir "El cubo de ", i " es: ", i^3
	FinPara
	
FinAlgoritmo
