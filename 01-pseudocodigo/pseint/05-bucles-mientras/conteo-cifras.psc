Algoritmo conteo_cifras
	
Definir num, contador Como Entero

Escribir "Ingrese un numero natural: "
Leer num

contador = 0
Mientras num > 0 Hacer
	num = trunc(num/10)
	contador = contador+1
 	
FinMientras

Escribir "La cantiddad de cifras es: ", contador


FinAlgoritmo
