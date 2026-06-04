Algoritmo Suma_rango_num
	
Definir i, n, m, suma Como Real
  
Escribir "Ingrese valor 1: " Sin Saltar
Leer n
Escribir "Ingrese valor 2: " Sin Saltar
Leer m	

suma <- 0
Para i<- n Hasta m Hacer
	suma <- suma+i
FinPara

Escribir "La suma de los numeros entre el rango n y m es: ", suma

FinAlgoritmo
