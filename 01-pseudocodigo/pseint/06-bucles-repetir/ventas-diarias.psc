Algoritmo Ventas_Diarias
	
	Definir ventas, descuento Como Entero
	Definir producto, totalventas, ventasxdia Como Real
	Repetir
		Escribir "Ingrese el numero de ventas: " Sin Saltar
	    Leer ventas
	Hasta Que ventas > 0
	
	Repetir
		Escribir "Ingrese el precio del producto" Sin Saltar
	    Leer producto
	Hasta Que producto > 0
	
	Repetir
		Escribir "Ingrese cantidad vendida" Sin Saltar
	    Leer cantidad
	Hasta Que cantidad > 0
	
	Repetir
		Escribir "Ingrese el descuento" Sin Saltar
	    Leer desc
	Hasta Que 0 <= descuento y descuento >= 50
	
	
	totalventas = ((precio * cantidad) * (descuento / 100))
	Escribir "El total de ventas es: ", totalventas
	Escribir "El total de ventas del día es: ", totalVentas
FinAlgoritmo
