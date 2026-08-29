Algoritmo Tarifa_Estacionamiento
	// Chilete DevPath · Etapa 01: Pseudocódigo
	// Tema: Reto de práctica autónoma
	// Objetivo: Solución de referencia: 02 tarifa estacionamiento.
	// Nota: ejecutar, probar y explicar el algoritmo en PSeInt.
	// Solucion de referencia del reto 2.

	Definir horas Como Entero
	Definir total Como Real

	Escribir "Ingrese la cantidad de horas (1 a 24): " Sin Saltar
	Leer horas

	Si horas >= 1 Y horas <= 24 Entonces
		Si horas <= 2 Entonces
			total = 5
		SiNo
			total = 5 + (horas - 2) * 2
			Si total > 25 Entonces
				total = 25
			FinSi
		FinSi

		Escribir "Total a pagar: S/ ", total
	SiNo
		Escribir "La cantidad de horas debe estar entre 1 y 24."
	FinSi
FinAlgoritmo
