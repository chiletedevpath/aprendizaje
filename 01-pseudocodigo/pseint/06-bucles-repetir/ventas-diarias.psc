Algoritmo Ventas_Diarias
	// Chilete DevPath · Etapa 01: Pseudocódigo
	// Tema: Bucles Repetir
	// Objetivo: Practicar repeticiones condicionadas al final: Ventas diarias.
	// Nota: ejecutar, probar y explicar el algoritmo en PSeInt.

	Definir numeroVentas, i, cantidad Como Entero
	Definir precio, porcentajeDescuento, subtotal, descuento Como Real
	Definir totalVenta, totalDia Como Real

	Repetir
		Escribir "Ingrese el numero de ventas del dia: " Sin Saltar
		Leer numeroVentas
	Hasta Que numeroVentas > 0

	totalDia = 0

	Para i = 1 Hasta numeroVentas Hacer
		Escribir "Venta ", i

		Repetir
			Escribir "Ingrese el precio del producto: " Sin Saltar
			Leer precio
		Hasta Que precio > 0

		Repetir
			Escribir "Ingrese la cantidad vendida: " Sin Saltar
			Leer cantidad
		Hasta Que cantidad > 0

		Repetir
			Escribir "Ingrese el descuento (0 a 50): " Sin Saltar
			Leer porcentajeDescuento
		Hasta Que porcentajeDescuento >= 0 Y porcentajeDescuento <= 50

		subtotal = precio * cantidad
		descuento = subtotal * (porcentajeDescuento / 100)
		totalVenta = subtotal - descuento
		totalDia = totalDia + totalVenta

		Escribir "Total de la venta: S/ ", totalVenta
		Escribir " "
	FinPara

	Escribir "Total de ventas del dia: S/ ", totalDia

FinAlgoritmo
