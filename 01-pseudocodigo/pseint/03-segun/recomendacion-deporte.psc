Algoritmo Recomendacion_De_Deporte
	
	// Eres un programador en una empresa de fitness y necesitas desarrollar un
	// algoritmo para recomendar un deporte basado en la temperatura actual. Te
	// 	solicitan crear un algoritmo en pseudocódigo debe solicitar al usuario que
	//	ingrese la temperatura en grados Fahrenheit.
	// Luego, debes seleccionar un deporte basado en la temperatura según la siguiente tabla:
	// Natación   ----      >30
	// Tenis      ----   >20 y <=30
	// Golf       ----   >0 y <=20
	// Esquí      ----     <=0
	
	Definir temperatura Como Real
	
	Escribir "Ingrese temperatura actual: " Sin Saltar
	Leer temperatura
	
	Si temperatura <= 0 Entonces
		Escribir "El deporte recomendado es: Esqui"
	SiNo
		Si temperatura > 0 y temperatura <= 20 Entonces
			Escribir "El deporte recomendado es: Golf"
		SiNo
			Si temperatura > 20 y temperatura <= 30 Entonces
				Escribir "El deporte recomendado es: Tenis"
			SiNo
				Si temperatura > 30 Entonces
					Escribir "El deporte recomendado es: Natación"
				FinSi
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
