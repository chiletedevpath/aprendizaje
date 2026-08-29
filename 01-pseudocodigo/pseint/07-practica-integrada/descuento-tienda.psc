Algoritmo Descuento_tienda
	// Chilete DevPath · Etapa 01: Pseudocódigo
	// Tema: Práctica integrada
	// Objetivo: Integrar varias estructuras de control: Descuento tienda.
	// Nota: ejecutar, probar y explicar el algoritmo en PSeInt.
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

desc = 0
nuevo = monto

Si monto < 0 Entonces
	Escribir "El monto no puede ser negativo."
SiNo
Si monto<=500 Entonces
	Escribir "No hay descuento"
SiNo
	Si monto<=1000 Entonces
		desc = (monto*0.05)
		nuevo = monto-desc
	SiNo
		Si monto<=7000 Entonces
			desc = (monto*0.10)
			nuevo = monto-desc
		SiNo
			Si monto<=15000 Entonces
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
FinSi

FinAlgoritmo
