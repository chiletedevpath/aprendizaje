Algoritmo Conversion_frecuencia_procesador
	//Trabajas en el departamento de soporte técnico de una empresa de hardware. Un cliente te llama
	//y te da la frecuencia de su procesador en hercios (hz) para realizar la búsqueda de componentes 
	// en el proceso de mantenimiento o reparación.
	// Te solicitan crear un algoritmo en pseudocódigo que tome como entrada la frecuencia del 
	//procesador en hercios y muestre en pantalla su valor en hercios, kilohercios o megahercios, según la 
	//siguiente tabla:
	//Menos de 1000 hz  -----  El mismo valor
	//Desde 1000 hz hasta menos de 1000000 hz  -----  El valor en kilohercios (Khz).
	//De 1000000 hz a más  -----  El valor en megahercios (Mhz)               
Definir her, kilo, mega Como Real
	
Escribir "Ingrese la frecuencia del procesador en hercios: " Sin Saltar
Leer her

Si her < 1000 Entonces
	 Escribir "Su valor en hercios es: ", her
SiNo
	Si 1000 <= her Y her < 1000000 Entonces
		kilo = her/1000
		Escribir "Su valor en kilo es: ", kilo
	SiNo 
		mega = 1000000 / 1000
		Escribir "Su valor en megahercios es: ", mega
	FinSi
FinSi
	
FinAlgoritmo
