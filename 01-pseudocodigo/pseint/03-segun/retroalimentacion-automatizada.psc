Algoritmo Retroalimentacion_Automatizada
	// Chilete DevPath · Etapa 01: Pseudocódigo
	// Tema: Selección múltiple con Segun
	// Objetivo: Practicar selección entre opciones discretas: Retroalimentacion automatizada.
	// Nota: ejecutar, probar y explicar el algoritmo en PSeInt.
	// Un profesor está calificando los exámenes de sus estudiantes.
	// Quiere darles un mensaje de retroalimentación según la nota que obtuvieron, pero son demasiados
	// estudiantes para hacerlo manual. Requiere un algoritmo que al ingresar la cantidad de puntos que
	// les faltó para llegar a 20 les muestre un mensaje.
	// Te solicitan crear un algoritmo en pseudocódigo que permita brindar un mensaje según la cantidad de
	// puntos que le faltó a un estudiante para obtener nota 20, se debe pedir la nota que obtuvo el estudiante.
	// Mostrar el mensaje según la siguiente tabla

	Definir nota, punfal Como Entero

	Escribir "Ingrese la nota del estudiante: " Sin Saltar
	Leer nota

	Si nota < 0 O nota > 20 Entonces
		Escribir "La nota debe estar entre 0 y 20."
	SiNo
		punfal = 20 - nota
		Segun punfal Hacer
			0: Escribir "Felicitaciones"
			1: Escribir "Muy bien"
			2: Escribir "Sigue adelante"
			3: Escribir "Puedes seguir mejorando"
			4: Escribir "Vamos a mejorar"
			De Otro Modo:
				Escribir "Lamentablemente no has aprobado"
		FinSegun
	FinSi

FinAlgoritmo
