Algoritmo CasoRepetir_LanzamientoDatos
	// Imagina que estás creando un juego en el que el jugador lanza un dado hasta que obtiene un 6.
	// Te solicitan crear un algoritmo en pseudocódigo que haga la simulación de este proceso, permitiendo al usuario 
	// ingresar el valor que ha sacado un jugador y siga pidiendo un valor hasta que obtenga 6. En ese momento muestre el mensaje
	// "FELICIDADES" y finalice el algoritmo.
	
	Definir dado Como Entero
	
	Escribir "Ingrese el valor que saco:" Sin Saltar
	Leer dado
	
	Si dado > 0 y dado < 7 Entonces
		
		Repetir 
			 Escribir "Ingrese el valor que saco:" Sin Saltar
			 Leer dado
		Hasta Que dado = 6
		
		Escribir " FELICIDADES "
		
	Sino
		
		Escribir " VALOR ERRONEO "
		
	FinSi
	
FinAlgoritmo
