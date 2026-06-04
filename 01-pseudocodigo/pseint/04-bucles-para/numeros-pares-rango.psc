Algoritmo CasoReto_NumeroPares
	
	Definir num1, num2, i Como Entero
	
	Escribir "Ingrese el numero de la tabla a practicar: " Sin Saltar
	Leer num1
	
	Si num1 % 2 == 0 Entonces
		
		Escribir "Ingrese el numero limite: " Sin Saltar
		Leer num2
		
		Si num2 % 2 == 0 Entonces
			
			Para i <- num1 Hasta num2 Con Paso 2 Hacer
				Escribir i 
				
			FinPara
			
		SiNo
			Escribir "  "	
			Escribir "¡¡¡ INGRESE UN NUMERO PAR !!! "
			
		FinSi
		
	SiNo
		Escribir "  "	
		Escribir "¡¡¡ INGRESE UN NUMERO PAR !!! "		
		
	FinSi
	
FinAlgoritmo
