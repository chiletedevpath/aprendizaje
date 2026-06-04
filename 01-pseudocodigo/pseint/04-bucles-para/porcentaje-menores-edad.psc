Algoritmo Porcentaje_Edades
// Construir un pseudocódigo para calcular cuántas personas son mayores de edad y cuántas son menores de un grupo de 20 personas,
// cuyas edades se ingresan por el usuario. Finalmente mostrar el porcentaje de mayores y menores de edad
	
	Definir i, personasMayores, personasMenores, edad, porceMayores, porceMenores Como Real
	
	personasMayores <- 0
	personasMenores <- 0
	
	Para i = 1 Hasta 20 Hacer
		
		Escribir " Ingrese la edad del invitado ", i " :"Sin Saltar
		Leer edad
		
		Si edad < 18 Entonces
			
			personasMenores <- personasMenores + 1			
		SiNo
			personasMayores <- personasMayores + 1	
			
		FinSi
	FinPara
	
	porceMayores <- (personasMayores / 20) * 100
	porceMenores <- (personasMenores / 20) * 100
	Escribir "   "
	Escribir " La cantidad de personas menores es ", personasMenores
	Escribir " La cantidad de personas mayores es ", personasMayores
	Escribir " El porcentaje de menores es: ", porceMenores "%"
	Escribir " El porcentaje de mayores es: ", porceMayores "%"

FinAlgoritmo
