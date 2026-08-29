Algoritmo CasoReto_NumeroPares
	// Chilete DevPath · Etapa 01: Pseudocódigo
	// Tema: Bucles Para
	// Objetivo: Practicar repeticiones con cantidad conocida: Numeros pares rango.
	// Nota: ejecutar, probar y explicar el algoritmo en PSeInt.

	Definir num1, num2, i Como Entero

	Escribir "Ingrese el primer numero par del rango: " Sin Saltar
	Leer num1

	Si num1 % 2 = 0 Entonces

		Escribir "Ingrese el numero limite: " Sin Saltar
		Leer num2

		Si num2 % 2 = 0 Y num2 >= num1 Entonces

			Para i <- num1 Hasta num2 Con Paso 2 Hacer
				Escribir i

			FinPara

		SiNo
			Escribir "  "
			Escribir "Ingrese un numero par mayor o igual al primero."

		FinSi

	SiNo
		Escribir "  "
		Escribir "Ingrese un numero par."

	FinSi

FinAlgoritmo
