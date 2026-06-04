Algoritmo Para_Promedio_Temperatura
	
 // Construir un pseudocódigo para calcular el promedio de "n" temperaturas ingresadas 
 // (el valor "n" se ingresa por teclado).Luego mostrar el promedio de temperaturas. 
 // Considerar que las temperaturas están en grados celsius
	
Definir i, n, suma, temp, prom Como Real

Escribir "ingrese cantidades de temperaturas: "Sin Saltar
Leer n

 suma = 0
 Para i = 1 Hasta n Hacer
 Escribir "Ingrese temperatura ", i " :" Sin Saltar
 Leer temp
 suma = temp + suma
 FinPara
 
prom = suma / n
Escribir "El promedio de las ", n " temperaturas es: ", prom " celsius"
	
FinAlgoritmo
