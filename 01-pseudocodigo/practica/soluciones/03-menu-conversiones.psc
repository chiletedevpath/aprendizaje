Algoritmo Menu_Conversiones
	// Chilete DevPath · Etapa 01: Pseudocódigo
	// Tema: Reto de práctica autónoma
	// Objetivo: Solución de referencia: 03 menu conversiones.
	// Nota: ejecutar, probar y explicar el algoritmo en PSeInt.
	// Solucion de referencia del reto 3.

	Definir opcion Como Entero
	Definir valor, resultado Como Real

	Escribir "Ingrese el valor que desea convertir: " Sin Saltar
	Leer valor
	Escribir "1. Kilometros a metros"
	Escribir "2. Metros a centimetros"
	Escribir "3. Celsius a Fahrenheit"
	Escribir "Seleccione una opcion: " Sin Saltar
	Leer opcion

	Segun opcion Hacer
		1:
			resultado = valor * 1000
			Escribir "Resultado: ", resultado, " metros"
		2:
			resultado = valor * 100
			Escribir "Resultado: ", resultado, " centimetros"
		3:
			resultado = valor * 9 / 5 + 32
			Escribir "Resultado: ", resultado, " grados Fahrenheit"
		De Otro Modo:
			Escribir "La opcion ingresada no existe."
	FinSegun
FinAlgoritmo
