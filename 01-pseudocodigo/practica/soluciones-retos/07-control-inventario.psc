Algoritmo Control_Inventario
	// Solucion de referencia del reto 7.

	Definir stock, cantidadMovimientos, i, opcion, cantidad Como Entero
	Definir totalIngresado, totalRetirado, salidasRechazadas Como Entero

	Repetir
		Escribir "Ingrese el stock inicial: " Sin Saltar
		Leer stock
	Hasta Que stock >= 0

	Repetir
		Escribir "Ingrese la cantidad de movimientos: " Sin Saltar
		Leer cantidadMovimientos
	Hasta Que cantidadMovimientos > 0

	totalIngresado = 0
	totalRetirado = 0
	salidasRechazadas = 0

	Para i = 1 Hasta cantidadMovimientos Hacer
		Escribir " "
		Escribir "Movimiento ", i

		Repetir
			Escribir "1. Entrada"
			Escribir "2. Salida"
			Escribir "Seleccione una opcion: " Sin Saltar
			Leer opcion
		Hasta Que opcion = 1 O opcion = 2

		Repetir
			Escribir "Ingrese una cantidad positiva: " Sin Saltar
			Leer cantidad
		Hasta Que cantidad > 0

		Segun opcion Hacer
			1:
				stock = stock + cantidad
				totalIngresado = totalIngresado + cantidad
			2:
				Si cantidad <= stock Entonces
					stock = stock - cantidad
					totalRetirado = totalRetirado + cantidad
				SiNo
					salidasRechazadas = salidasRechazadas + 1
					Escribir "Salida rechazada por stock insuficiente."
				FinSi
		FinSegun
	FinPara

	Escribir " "
	Escribir "Stock final: ", stock
	Escribir "Unidades ingresadas: ", totalIngresado
	Escribir "Unidades retiradas: ", totalRetirado
	Escribir "Salidas rechazadas: ", salidasRechazadas
FinAlgoritmo
