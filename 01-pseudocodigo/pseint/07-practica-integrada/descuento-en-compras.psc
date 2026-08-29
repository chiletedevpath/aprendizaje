Algoritmo Descuento_en_compras
	// Chilete DevPath · Etapa 01: Pseudocódigo
	// Tema: Práctica integrada
	// Objetivo: Integrar varias estructuras de control: Descuento en compras.
	// Nota: ejecutar, probar y explicar el algoritmo en PSeInt.
// El gerente de una tienda de ropa está organizando una venta especial. Los clientes que gasten 150
// 	soles o más recibirán un descuento del 12%. Te solicitan crear un algoritmo en pseudocódigo que
// 	tome como entrada el importe de la compra, aplique el descuento si corresponde, y luego muestre
// 	el descuento otorgado y el importe final de la compra.

	Definir monto,descu,imporfinal Como Real

	Escribir "Importe de la compra: "Sin Saltar
	Leer monto

	Si monto>=150  Entonces
		descu = monto*0.12
		imporfinal = monto-descu
		Escribir " "
		Escribir "Se realizo un descuento de: S/. ", descu " nuevos soles"
		Escribir "Su importe final es: S/. ", imporfinal " nuevos soles"

	SiNo
		descu = 0
		imporfinal = monto
		Escribir " "
		Escribir "No corresponde descuento"
		Escribir "Su importe final es: S/. ", imporfinal " nuevos soles"
	FinSi


FinAlgoritmo
