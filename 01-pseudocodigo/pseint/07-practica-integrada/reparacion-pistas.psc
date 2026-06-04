Algoritmo Reparacion_Pistas
	//La municipalidad de Pueblo Libre piensa invertir cierto monto de dinero en la reparación de las 
	//pistas en las avenidas principales. En ese sentido se le solicita desarrollar un pseudocódigo que 
	//permita ingresar un monto de inversión en soles y lo reparta en la refacción de cinco avenidas 
	//de la siguiente manera:
	//a. Avenida La Mar - 35% del monto
	//b. Avenida Abancay - 25% del monto
	//c. Avenida 28 de Julio - 10% del monto
	//d. Avenida Aviación - 15% del monto
	//e. Avenida Tacna - restante del monto
	//Luego, mostrar en pantalla cuánto le corresponde a cada avenida.
	//Por ejemplo:
	// Si el monto ingresado es 1000 soles, se debe mostrar lo siguiente:
	// La avenida La mar recibirá S/ 350
	//La avenida Abancay recibirá S/ 250
	//La avenida 28 de Julio recibirá S/ 100
	// La avenida Aviación recibirá S/ 150
	//La avenida Tacna recibirá S/ 150
	
	
	Definir monto,a,b,c,d,e Como Real
	
	Escribir "Ingrese el monto de inversion: S/."
	Leer monto
	
	Escribir " "
	a=(monto*0.35)
	Escribir "a. La avenida La mar recibirá S/. ", a " nuevos soles"
	b=(monto*0.25)
	Escribir "b. La avenida Abancay recibirá S/. ", b " nuevos soles"
	c=(monto*0.10)
	Escribir "c. La avenida 28 de Julio recibirá S/. ", c " nuevos soles"
	d=(monto*0.10)
	Escribir "d. La avenida Aviación recibirá S/. ", d " nuevos soles"
	e=(monto-(a+b+c+d))
	Escribir "d. La avenida Tacna recibirá S/. ", e " nuevos soles"

	
FinAlgoritmo
