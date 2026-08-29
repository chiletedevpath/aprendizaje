Algoritmo Repetir_validar_edad
	// Chilete DevPath · Etapa 01: Pseudocódigo
	// Tema: Bucles Repetir
	// Objetivo: Practicar repeticiones condicionadas al final: Validar edad.
	// Nota: ejecutar, probar y explicar el algoritmo en PSeInt.
	Definir edad Como Entero

	Repetir
		Escribir "Ingrese su edad correcta:" Sin Saltar
		Leer edad
	Hasta Que edad >= 18 Y edad <= 120

	Escribir "El doble de la edad ingresada es: ", edad*2

FinAlgoritmo
