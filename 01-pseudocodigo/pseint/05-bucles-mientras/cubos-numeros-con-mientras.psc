Algoritmo Cubos_De_Numeros_Comprendidos_Solucion_Mientras
	// Chilete DevPath · Etapa 01: Pseudocódigo
	// Tema: Bucles Mientras
	// Objetivo: Practicar repeticiones condicionadas al inicio: Cubos numeros con mientras.
	// Nota: ejecutar, probar y explicar el algoritmo en PSeInt.
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

	i <- 0
	Mientras i < num Hacer
		i <- i+1
		Escribir "El cubo de ", i " es: ", i^3
	FinMientras

FinAlgoritmo
