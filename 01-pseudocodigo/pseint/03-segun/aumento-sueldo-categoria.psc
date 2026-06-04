Algoritmo Aumento_Sueldo_Categoria
	
	// Eres un programador en una empresa y necesitas desarrollar un algoritmo para calcular el sueldo 
	// de los empleados después de aplicar un aumento basado en su categoría.
	// Te solicitan crear un algoritmo en pseudocódigo que debe solicitar al usuario que ingrese el sueldo base 
	// y la categoría del empleado (A, B o C). Luego, debes calcular el sueldo final aplicando un aumento del 20% 
	// para la categoría A, 10% para la categoría B y 5% para la categoría C. Finalmente, debe mostrar el sueldo final.
	// Por ejemplo, si un usuario ingresa un sueldo base de 1000 y una categoría B. El algoritmo aplica un aumento 
	// del 10% (100) y muestra el sueldo final (1100).
	
	Definir SueldoBase, SueldoFinal, aumento Como Real
	Definir categoria Como Caracter
	
	Escribir "Ingrese su sueldo base $: " Sin Saltar
	Leer SueldoBase
	
	Escribir "Ingrese su categoria (A, B o C)" Sin Saltar
	Leer categoria
	
	Segun categoria Hacer
		"A" o "a": 
			aumento = SueldoBase*0.20
			SueldoFinal = SueldoBase + aumento
			
		"B" o "b": 
			aumento = SueldoBase*0.10
			SueldoFinal = SueldoBase + aumento
			
		"C" o "c":
			aumento = SueldoBase*0.05
			SueldoFinal = SueldoBase + aumento
			
		De Otro Modo:
			Escribir " "
			Escribir "La categoria ",categoria " no existe" 
	FinSegun
	
	Escribir " "
	Escribir "El trabajador tiene un aumento de $: ", aumento 
	Escribir "El sueldo final del trabajador es $: ", SueldoFinal
		
FinAlgoritmo
