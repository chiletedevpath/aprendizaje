Algoritmo Suma_rango_num
	// Chilete DevPath · Etapa 01: Pseudocódigo
	// Tema: Bucles Para
	// Objetivo: Practicar repeticiones con cantidad conocida: Suma rango numeros.
	// Nota: ejecutar, probar y explicar el algoritmo en PSeInt.

Definir i, n, m, suma Como Entero

Escribir "Ingrese valor 1: " Sin Saltar
Leer n
Escribir "Ingrese valor 2: " Sin Saltar
Leer m

Si n <= m Entonces
	suma <- 0
	Para i<- n Hasta m Hacer
		suma <- suma+i
	FinPara
	Escribir "La suma de los numeros entre el rango n y m es: ", suma
SiNo
	Escribir "El primer valor debe ser menor o igual que el segundo."
FinSi

FinAlgoritmo
