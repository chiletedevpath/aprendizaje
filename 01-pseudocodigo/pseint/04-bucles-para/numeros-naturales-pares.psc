Algoritmo CasoReto_NumeroNaturales_Pares
	
	Definir numMenor, numMayor, i Como Entero
	
	
	Escribir "Ingrese el primer numero natural " Sin Saltar
	Leer numMenor
	
	Si numMenor > 0 Entonces
		Escribir " "
		Escribir "Ingrese el segundo numero natural:" Sin Saltar
		Leer numMayor
		
		Si numMayor > numMenor Entonces
			
			Para i <- numMenor Hasta numMayor Hacer
				
				Si i % 2 == 0 Entonces
					 Escribir, i
				FinSi
				
			FinPara
			
		FinSi
	Sino 
		Escribir " "
		Escribir "¡¡¡ DEBE INGRESAR UN NUMERO NATURAL MAYOR AL PRIMERO NUMERO!!!"
	FinSi
	
FinAlgoritmo