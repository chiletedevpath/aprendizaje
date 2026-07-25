Algoritmo Conversion_Duracion
	// Solucion de referencia del reto 1.
	// Precondicion: la cantidad de segundos es un entero no negativo.

	Definir totalSegundos, horas, minutos, segundosRestantes Como Entero

	Escribir "Ingrese la duracion total en segundos: " Sin Saltar
	Leer totalSegundos

	horas = Trunc(totalSegundos / 3600)
	minutos = Trunc((totalSegundos MOD 3600) / 60)
	segundosRestantes = totalSegundos MOD 60

	Escribir horas, " horas, ", minutos, " minutos y ", segundosRestantes, " segundos"
FinAlgoritmo
