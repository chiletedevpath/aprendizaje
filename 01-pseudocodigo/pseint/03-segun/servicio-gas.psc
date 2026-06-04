Algoritmo Servicio_Gas
	// El departamento de facturación de una empresa de servicios públicos necesita calcular el costo del servicio de gas
	// para los clientes en diferentes zonas, basándose en los metros cúbicos consumidos.
	// Te solicitan crear un algoritmo en pseudocódigo que le permita calcular el costo del servicio de gas ingresando como 
	// datos el número de la zona y metros cúbicos consumidos. Luego, mostrar el número de la zona, ubicación, consumo y costo. 
    // Según la siguiente tabla:
	
	Definir zona, cons, cost Como Real
	
	Escribir "Ingrese numero de zona: " Sin Saltar
	Leer zona
	Escribir " "
	Si 1<= zona y zona <= 4 Entonces
		Escribir "Ingrese su consumo: " Sin Saltar
		Leer cons
		Segun zona Hacer
			1: Escribir "Zona ", zona 
				Escribir "Ubicacion: Residencial"
				Escribir "Su consumo es: ", cons " metros cubicos."
				cost = cons*0.20
				Escribir "El costo es: S/. ", cost " nuevos soles."
			2: Escribir "Zona ", zona 
				Escribir "Ubicacion: Comercial"
				Escribir "Su consumo es: ", cons " metros cubicos."
				cost = cons*0.31
				Escribir "El costo es: S/. ", cost " nuevos soles."
			3: Escribir "Zona ", zona 
				Escribir "Ubicacion: Industrial"
				Escribir "Su consumo es: ", cons " metros cubicos."
				cost = cons*0.42
				Escribir "El costo es: S/. ", cost " nuevos soles."
			4: Escribir "Zona ", zona 
				Escribir "Ubicacion: Especial"
				Escribir "Su consumo es: ", cons " metros cubicos."
				cost = cons*0.50
				Escribir "El costo es: S/. ", cost " nuevos soles."
		FinSegun
	Sino 
		Escribir " LA ZONA ", zona " NO EXISTE"
	FinSi	
FinAlgoritmo
