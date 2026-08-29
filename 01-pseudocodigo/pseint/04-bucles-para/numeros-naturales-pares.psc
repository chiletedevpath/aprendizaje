Algoritmo CasoReto_NumeroNaturales_Pares
	// Chilete DevPath · Etapa 01: Pseudocódigo
	// Tema: Bucles Para
	// Objetivo: Practicar repeticiones con cantidad conocida: Numeros naturales pares.
	// Nota: ejecutar, probar y explicar el algoritmo en PSeInt.

	Definir numMenor, numMayor, i Como Entero


	Escribir "Ingrese el primer numero natural " Sin Saltar
	Leer numMenor

	Si numMenor > 0 Entonces
		Escribir " "
		Escribir "Ingrese el segundo numero natural:" Sin Saltar
		Leer numMayor

		Si numMayor > numMenor Entonces

			Para i <- numMenor Hasta numMayor Hacer

				Si i % 2 = 0 Entonces
					 Escribir i
				FinSi

			FinPara

		SiNo
			Escribir "El segundo numero debe ser mayor que el primero."
		FinSi
	Sino
		Escribir " "
		Escribir "Debe ingresar un numero natural mayor que cero."
	FinSi

FinAlgoritmo
