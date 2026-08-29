Algoritmo Ahorro_Hasta_Meta
	// Chilete DevPath · Etapa 01: Pseudocódigo
	// Tema: Reto de práctica autónoma
	// Objetivo: Solución de referencia: 05 ahorro meta.
	// Nota: ejecutar, probar y explicar el algoritmo en PSeInt.
	// Solucion de referencia del reto 5.
	// Precondicion: la meta y cada aporte son positivos.

	Definir cantidadAportes Como Entero
	Definir meta, aporte, total, excedente Como Real

	Escribir "Ingrese la meta de ahorro: S/ " Sin Saltar
	Leer meta

	total = 0
	cantidadAportes = 0

	Mientras total < meta Hacer
		Escribir "Ingrese un aporte: S/ " Sin Saltar
		Leer aporte
		total = total + aporte
		cantidadAportes = cantidadAportes + 1
	FinMientras

	excedente = total - meta
	Escribir "Total ahorrado: S/ ", total
	Escribir "Cantidad de aportes: ", cantidadAportes
	Escribir "Monto que supera la meta: S/ ", excedente
FinAlgoritmo
