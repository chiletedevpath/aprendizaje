Proceso Presion_Neumatico
//Eres un practicante de ingeniería mecánica y tienes un avión cuya presión de sus neumáticos se encuentra en bares.
//Sin embargo, tu equipo solo mide en psi (libras por pulgada cuadrada). Necesitas convertir la presión de bares a psi 
//para poder trabajar con tu equipo. Se te solicita construir un pseudocódigo que permite ingresar la presión de un neumático
//en bares y devuelva el valor en psi (libra por pulgada cuadrada).
//Dato: 1 bar es aproximadamente 14.504 psi.
	
Definir neuma,bar Como Real
Definir cantpsi Como Real
	
Escribir "*** Caso: Presión de un neumático ***"
Escribir " "

Escribir "Ingrese la presion de su neumatico en bar: " Sin Saltar
leer neuma

bar = 14.504
cantpsi = bar* neuma

Escribir " "
Escribir "La presion de su neumatico en psi es: ",cantpsi

FinProceso