Algoritmo Temperatura
// Realizar un pseudocódigo que al ingresar la temperatura de un motor
// experimental en grados celsius nos devuelva un mensaje siguiendo la siguiente
// tabla.
	
	Definir temp Como Entero
	
	Escribir "Ingrese temperatura: " Sin Saltar
	Leer temp
	Escribir " "
	Segun temp Hacer
		0,1: Escribir "Temperatura baja" 
		2,3: Escribir "Temperatura baja - media" 
		4,5: Escribir "Temperatura media" 
		6,7: Escribir "Temperatura media - alta" 
		8,9: Escribir "Temperatura alta" 
		De Otro Modo: Escribir "ERROR FATAL" 	
	FinSegun
	
	
FinAlgoritmo
