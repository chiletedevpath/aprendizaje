Algoritmo CasoMientras_LanzamientoDatos
	// Chilete DevPath · Etapa 01: Pseudocódigo
	// Tema: Bucles Mientras
	// Objetivo: Practicar repeticiones condicionadas al inicio: Lanzamiento dados mientras.
	// Nota: ejecutar, probar y explicar el algoritmo en PSeInt.
	// Imagina que estás creando un juego en el que el jugador lanza un dado hasta que obtiene un 6.
	// Te solicitan crear un algoritmo en pseudocódigo que haga la simulación de este proceso, permitiendo al usuario
	// ingresar el valor que ha sacado un jugador y siga pidiendo un valor hasta que obtenga 6. En ese momento muestre el mensaje
	// "FELICIDADES" y finalice el algoritmo.

	Definir dado Como Entero

	dado = 0
	Mientras dado <> 6 Hacer
		Escribir "Ingrese el valor obtenido en el dado: " Sin Saltar
		Leer dado
		Si dado < 1 O dado > 6 Entonces
			Escribir "El valor debe estar entre 1 y 6."
		FinSi
	FinMientras
	Escribir "FELICIDADES"


FinAlgoritmo
