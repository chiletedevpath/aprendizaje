Algoritmo Costo_descuento 
	//Trabajas en el departamento de ventas de una tienda y necesitas calcular el costo y el descuento que tendrá un artículo. 
	//Por ello, se requiere crear un pseudocódigo que tome como entrada el precio de un artículo, aplique un descuento del 15% 
	//si su precio es mayor o igual a $200, o un descuento del 5% en caso contrario, y luego muestre el costo y el descuento del artículo.
	//Este algoritmo podría ser útil en un sistema de punto de venta para calcular automáticamente los descuentos en los artículos.	
	
	Escribir "*** TIENDA DON IVAN ***"
	Escribir " "
	Definir pre, des, des1, cost, cost1 Como Real
	
	Escribir "Ingrese el precio del articulo: " Sin Saltar
	Leer pre
	
	Escribir " "
	
	Si pre >= 200 O 200 < pre Entonces
		des = (pre*0.15)
		cost = pre - des
		Escribir " ¡¡¡ SE REALIZO DESCUENTO DEL 15% !!!"
		Escribir " Se desconto: $", des " nuevos soles"
		Escribir " El costo del articulo es: $", cost " nuevos soles"
	SiNo
		des1 = (pre*0.05)
		cost1 = pre - des1
		Escribir " ¡¡¡ SE REALIZO DESCUENTO DEL 5% !!!"
		Escribir " Se desconto: $", des1 " nuevos soles"
		Escribir " El costo del articulo es: $", cost1 " nuevos soles"
		
	FinSi
FinAlgoritmo
