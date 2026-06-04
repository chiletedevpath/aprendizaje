Algoritmo Costo_seguro_auto
	// Una agencia de seguros necesita calcular el costo mensual del seguro de auto para los clientes en función de su sexo y edad.
	// Las reglas son: los varones menores de 25 años pagan 1000 soles, los de 25 a más pagan 700 soles.
	// Las mujeres de 21 años o menos pagan 500 y las que tienen más de 21 años pagan 300 soles.
	// Te solicitan crear un algoritmo en pseudocódigo que tome como entrada la edad y el sexo del
	// cliente, calcule el costo mensual del seguro y luego muestre este costo en pantalla.	
	
	
	Definir edad Como Entero
	Definir sexo Como Caracter
	Definir pago Como Real
	
	Escribir "Ingrese su edad: " Sin Saltar
	Leer edad
	
	Escribir "V = varon y M = mujer"
    Escribir "Ingrese su sexo : " Sin Saltar
	Leer sexo
	
	Segun sexo Hacer
		"V":
			Si edad < 25 Entonces
				pago = 1000
				Escribir " "
				Escribir "El pago es: S/. ",pago
			Sino 
				pago = 700
				Escribir " "
				Escribir "El pago es: S/. ",pago
			FinSi
		"M": 
			Si edad <= 21 Entonces
				pago = 500 
				Escribir " "
				Escribir "El pago es: S/. ",pago
			Sino 
				pago = 300 
				Escribir " "
				Escribir "El pago es: S/. ",pago
			FinSi
		De Otro Modo:
			Escribir " "
			Escribir "¡¡¡ ERROR !!!"
	FinSegun
	
FinAlgoritmo
