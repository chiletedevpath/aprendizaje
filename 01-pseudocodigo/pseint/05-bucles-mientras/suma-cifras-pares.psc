Algoritmo SumaCifrasPares
	
    // Crear un algoritmo en pseudocódigo que permita ingresar un número positivo y muestre la suma de sus cifras 
    // pares.

	Definir num, cifra, sumaPares Como Entero	
	
	Escribir "Ingrese un numero positivo: " Sin Saltar
	Leer num
	
	sumaPares <- 0
	
	Si num > 0 Entonces
		
		Mientras num > 0 Hacer
			
			cifra <- num % 10 
			
			Si cifra % 2 = 0 Entonces
				sumaPares <- sumaPares + cifra
			FinSi
			
			num <- trunc(num/10)
			
		FinMientras
		
		Escribir "La suma de las cifras pares es: ",sumaPares
		
	Sino 
		
		Escribir "¡¡¡ ERROR !!! ",sumaPares
		
	FinSi
	
FinAlgoritmo
