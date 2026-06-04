Algoritmo Descuento_en_compras 
// El gerente de una tienda de ropa está organizando una venta especial. Los clientes que gasten 150 
// 	soles o más recibirán un descuento del 12%. Te solicitan crear un algoritmo en pseudocódigo que 
// 	tome como entrada el importe de la compra, aplique el descuento si corresponde, y luego muestre 
// 	el descuento otorgado y el importe final de la compra.
	
	Definir monto,descu,imporfinal Como Real
	
	Escribir "Importe de la compra: "Sin Saltar
	Leer monto
	
	Si monto>=150  Entonces
		descu= (150*0.12)
		imporfinal=(descu+monto)
		Escribir " "
		Escribir "Se realizo un descuento de: S/. ", descu " nuevos soles"
		Escribir "Su importe final es: S/. ", imporfinal " nuevos soles"
		
	SiNo
		Escribir " "
		Escribir "No corresponde descuento"
	FinSi
	
	
FinAlgoritmo
