Algoritmo Minijuego
	// Realizar un pseudocódigo para un mini-juego. Este debe permitir ingresar la cantidad de manzanas que
	// un jugador ha recogido en el juego. Luego, a partir de la cantidad el juego les da puntos. Finalmente, debe
	// mostrar el puntaje del jugador o una mensaje de advertencia.
	// Siguiendo las siguientes reglas:
	// Si el jugador recoge 1 manzana, obtiene 5 puntos.
	// Si recoge 2 manzanas, obtiene 15 puntos.
	// Si recoge 3 manzanas, obtiene 30 puntos.
    // Si recoge más de 3 manzanas, obtiene 50 puntos y un bono adicional de 10 puntos por cada manzana adicional.
	// Si no recoge ninguna manzana, el juego muestra un mensaje de aliento.
	// Si se ingresa una cantidad de manzanas menor a cero o mayor a 20 se debe mostrar sólo un mensaje de advertencia.
	
	 Definir manza Como Entero
	 Definir bono Como Real
	
	 Escribir "Ingrese la cantidad de manzanas recogidas: " Sin Saltar
	 Leer manza
	
	 Si manza>=0 y manza <=20 Entonces
		Segun manza Hacer
			0:  Escribir " "
			     Escribir "No se densanime, siga intentando"
			1: Escribir " "
				 Escribir "Tiene 5 puntos"
			2: Escribir " "
				 Escribir "Tiene 15 puntos"
			3: Escribir " "
				 Escribir "Tiene 30 puntos"
			De Otro Modo:
				 bono=((manza*10)+50)
				 Escribir " "
			     Escribir "Tiene ",bono " puntos"
		FinSegun
	Sino 
		 Escribir " "
		 Escribir "¡¡¡Ingrese una cantidad correcta!!!"
	 FinSi
FinAlgoritmo
