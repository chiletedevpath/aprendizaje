Algoritmo Calcular_SueldoFinal
	
	// Te solicitan crear un algoritmo en pseudocódigo que debe solicitar al usuario que
	// ingrese el sueldo base y el valor de dos bonificaciones. Luego, debes calcular el
	// sueldo total sumando el sueldo base y las bonificaciones, y aplicar un descuento
	// del 11% al sueldo total. Finalmente, debe mostrar el sueldo final.
	// Por ejemplo, si un usuario ingresa un sueldo base de 1000 y dos bonificaciones
	// de 100 cada una. El algoritmo calcula el sueldo total (1200), aplica el descuento
	// de AFP (132), y muestra el sueldo final (1068).
	
	Definir sueldoBase, bono1, bono2, sueldoTotal, descuento, sueldoFinal Como Real	
	
	Escribir "Ingrese su sueldo base" Sin Saltar
	Leer sueldoBase
	
	Escribir "Ingrese su primera bonificacion"Sin Saltar
	Leer bono1
	
	Escribir "Ingrese su segunda bonificacion"Sin Saltar
	Leer bono2
	
	sueldoTotal = sueldoBase + bono1 + bono2
	descuento = (sueldoTotal * 11) / 100
	sueldoFinal = sueldoTotal - descuento
	
	Escribir " "
	Escribir "Sueldo total: ", sueldoTotal
	Escribir "Descuento por AFP (11%): ", descuento
	Escribir "El sueldo final despues de aplicar el descuento por AFP es: ", sueldoFinal
	
FinAlgoritmo