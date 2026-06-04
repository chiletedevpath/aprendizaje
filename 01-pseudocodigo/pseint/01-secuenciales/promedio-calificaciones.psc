Proceso Promedio_Calificaciones
//Un estudiante realiza tres exámenes durante el semestre, los cuales tienen pesos correspondientes al 20%, 30% y 50% 
//respectivamente. Realice el pseudocódigo que permita obtener el promedio de las calificaciones obtenidas.
//Por ejemplo, si se ingresa las notas 20, 10 y 15, se debe mostrar el promedio 14.5

Definir not1, not2, not3 Como Real
DEfinir prom1, prom2, prom3, promF Como Real
	
Escribir "*** Promedio ***"
Escribir " "

Escribir "Ingrese su primera nota: " Sin Saltar
Leer not1

prom1=(not1*20)/100
Escribir "Ingrese su segunda nota: " Sin Saltar
Leer not2

prom2=(not2*30)/100
Escribir "Ingrese su tercera nota: " Sin Saltar
Leer not3

prom3=(not3*50)/100 
Escribir " "
	
promF = prom1 + prom2 + prom3
Escribir "El promedio es: ", promF
	
FinProceso