Algoritmo Retroalimentacion_Automatizada
	// Un profesor está calificando los exámenes de sus estudiantes. 
	// Quiere darles un mensaje de retroalimentación según la nota que obtuvieron, pero son demasiados 
	// estudiantes para hacerlo manual. Requiere un algoritmo que al ingresar la cantidad de puntos que 
	// les faltó para llegar a 20 les muestre un mensaje.
	// Te solicitan crear un algoritmo en pseudocódigo que permita brindar un mensaje según la cantidad de
	// puntos que le faltó a un estudiante para obtener nota 20, se debe pedir la nota que obtuvo el estudiante. 
	// Mostrar el mensaje según la siguiente tabla
	
	Definir nota, punfal Como Real
	
	Escribir "Ingrese la nota del estudiante: " Sin Saltar
	Leer nota
	
	punfal = 20 - nota	
	
	Segun punfal Hacer
		0: Escribir "Felicitaciones"
		1: Escribir "Muy bien"
		2: Escribir "Sigue adelante"
		3: Escribir "Puedes seguir mejorando"
		4: Escribir "Vamos a mejorar"
		De Otro Modo:
			Si 5<=punfal Y punfal<=20 Entonces
				Escribir "Lamentablemente no has aprobado"	
			FinSi
	FinSegun
	
FinAlgoritmo
