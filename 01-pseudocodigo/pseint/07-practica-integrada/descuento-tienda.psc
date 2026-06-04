Algoritmo Descuento_tienda
// En una tienda se efectúa un descuento a los clientes dependiendo del monto de la compra. 
// El descuento se lleva a cabo con base en el siguiente criterio: 
// Si el monto es menor que $500.00 no hay descuento 
// Si el monto está comprendido entre $501 y $1,000, hay un 5% de descuento 
//  Si el monto está comprendido entre $1,001 y $7,000, hay un 10% de descuento
// Si el monto está comprendido entre $7,001 y $15,000, hay un 15% de descuento 
// Si el monto es mayor a $15,000, recibe un 20% de descuento 
// ¿Qué hacer? Crear un pseudocódigo que pida el monto de compra y devuelva el valor del descuento y nuevo precio.
	
Definir monto, desc, nuevo Como Real

Escribir "Ingrese el monto de compra: " Sin Saltar
Leer monto

Si monto<=500 Entonces
	Escribir "No hay descuento"
SiNo
	Si 501<=monto y monto<=1000 Entonces
		desc = (monto*0.05)
		nuevo = monto-desc
	SiNo
		Si 1001<=monto y monto<=7000 Entonces
			desc = (monto*0.10)
			nuevo = monto-desc
		SiNo
			Si 7001<=monto y monto<=15000 Entonces
				desc = (monto*0.15)
				nuevo = monto-desc
			SiNo
				desc = (monto*0.20)
				nuevo = monto-desc
			FinSi
		FinSi
	FinSi
FinSi

Escribir " "	
Escribir "Hay un descuento de: ", desc " soles"
Escribir "El nuevo precio es: ",nuevo	

FinAlgoritmo