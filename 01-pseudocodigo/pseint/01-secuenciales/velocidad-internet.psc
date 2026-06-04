Proceso Velocidad_Internet
//Trabajas en una empresa de internet. Un cliente llama y te dice que su velocidad de internet es de ciertos kilobits 
//por segundo. Sin embargo, tu sistema solo maneja megabytes por segundo. Necesitas convertir la velocidad de kilobits 
//por segundo a megabytes por segundo para poder ayudar al cliente. Como encargado del área de cómputo de la empresa, 
//se te solicita construir un pseudocódigo que permite ingresar la velocidad de un operador de internet en kilobits por segundo 
//y devuelva el valor en megabytes por segundo para apoyar a los de las áreas de soporte.
//Dato: 1 megabyte por segundo es equivalente a 8000 kilobits por segundo
	
Definir velocidad,mega Como Real
Definir cantmega Como Real
	
Escribir "*** Caso: Velocidad de internet ***"
Escribir " "

Escribir "Ingrese la velocidad de su internet en kilobits: " Sin Saltar
leer velocidad
	
mega = 8000
cantmega = velocidad / mega
Escribir " "
Escribir "La velocidad de su internet en megabyte es: ",cantmega
	
FinProceso