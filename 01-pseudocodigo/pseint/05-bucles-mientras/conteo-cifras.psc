Algoritmo conteo_cifras

Definir num, contador Como Entero

Escribir "Ingrese un numero natural: "
Leer num

Si num >= 0 Entonces
	Si num = 0 Entonces
		contador = 1
	SiNo
		contador = 0
		Mientras num > 0 Hacer
			num = trunc(num/10)
			contador = contador+1
		FinMientras
	FinSi
	Escribir "La cantidad de cifras es: ", contador
SiNo
	Escribir "Debe ingresar un numero natural."
FinSi


FinAlgoritmo
