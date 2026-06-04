Algoritmo Ver_Pelicula
	// El gerente de un cine está organizando una promoción especial para grupos. 
	// Los grupos de diferentes tamaños reciben diferentes descuentos en el precio de las entradas. 
	// Necesita crear un algoritmo que tome como entrada el número de personas en el grupo, 
	// calcule el pago por persona y el pago total, y luego muestre estos valores.
	
	// Te solicitan crear un algoritmo en pseudocódigo que permita calcular el pago que hacen 
	// un grupo de personas para ver una película teniendo en cuenta que si el grupo es menor 
	// de 5 personas el pago es de 20 soles por persona y para grupos de 5 hasta 8 personas el pago 
	// es 18 soles por persona, para grupos de 9 a 12 personas es de 15 soles por persona y para más 
	// de 15 es de 12.50 soles por persona. Se debe mostrar el número de personas, el pago por persona 
	// y el pago total.
	
	Definir numper Como Entero
	Definir pagper, pagper2, pagper3, pagtotal, pagtotal2, pagtotal3 Como Real
	Definir pagper4, pagtotal4 Como Real
	
	Escribir "Ingrese cuantas personas son: " Sin Saltar
	Leer numper
	Escribir " "
	Si numper < 5 Entonces
		pagper = 20
		pagtotal = numper*pagper
		Escribir "Numero de personas: ", numper
		Escribir "Pago por persona: S/. ", pagper " nuevos soles"
		Escribir "Pago total es: S/. ", pagtotal " nuevos soles"
	SiNo
		Si 5 <= numper Y numper <= 8 Entonces
			pagper2 = 18
			pagtotal2 = numper*pagper2
			Escribir "Numero de personas: ", numper
			Escribir "Pago por persona: S/. ", pagper2 " nuevos soles"
			Escribir "Pago total es: S/. ", pagtotal2 " nuevos soles"	
		SiNo
			Si 9 <= numper Y numper <= 12 Entonces
				pagper3 = 15
				pagtotal3 = numper*pagper3
				Escribir "Numero de personas: ", numper
				Escribir "Pago por persona: S/. ", pagper3 " nuevos soles"
				Escribir "Pago total es: S/. ", pagtotal3 " nuevos soles"
			SiNo 
				Si numper >= 15 Entonces
					pagper4 = 12.5
					pagtotal4 = numper*pagper4
					Escribir "Numero de personas: ", numper
					Escribir "Pago por persona: S/. ", pagper4 " nuevos soles"
					Escribir "Pago total es: S/. ", pagtotal4 " nuevos soles"
				SiNo
					Escribir "Lamentamos informar que no hay promocion disponible"
				FinSi
			FinSi
		FinSi
		
	FinSi

FinAlgoritmo
