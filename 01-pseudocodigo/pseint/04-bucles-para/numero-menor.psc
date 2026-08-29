Algoritmo Para_Numero_Menor
	// Chilete DevPath · Etapa 01: Pseudocódigo
	// Tema: Bucles Para
	// Objetivo: Practicar repeticiones con cantidad conocida: Numero menor.
	// Nota: ejecutar, probar y explicar el algoritmo en PSeInt.
// Construir un pseudocódigo para calcular el menor número de "n" números enteros (el valor "n" se ingresa por teclado).
// Luego mostrar el valor requerido.

Definir i, n, men, num  Como Entero

Escribir "Ingrese la cantidad numeros enteros a comparar: " Sin Saltar
Leer n

Si n > 0 Entonces
	Escribir "Numero 1: " Sin Saltar
	Leer men
	Para i = 2	Hasta n Hacer
		 Escribir "Numero ",i ": " Sin Saltar
		 Leer num
		 Si num < men Entonces
			 men <- num
		 FinSi
	FinPara
	Escribir "El menor numero es: ", men
SiNo
	Escribir "La cantidad debe ser mayor que cero."
FinSi

FinAlgoritmo
