Algoritmo conteo_cifras
	// Chilete DevPath · Etapa 01: Pseudocódigo
	// Tema: Bucles Mientras
	// Objetivo: Practicar repeticiones condicionadas al inicio: Conteo cifras.
	// Nota: ejecutar, probar y explicar el algoritmo en PSeInt.

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
