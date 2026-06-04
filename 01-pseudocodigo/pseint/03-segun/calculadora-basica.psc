Algoritmo Calculadora_Basica
	// Construir un pseudocódigo que permita ingresar dos números y un símbolo (+, -, x, /) y dependiendo del operador 
	// devuelva la suma, la diferencia, el producto o la división.
	// Nota: verificar que el divisor no sea cero y mostrar una advertencia si se ingresa un valor diferente a 
	// esos símbolos.
	
	Definir num1, num2, suma, resta, multi, divi Como Real
	Definir simb Como Caracter
	
	Escribir "Ingrese los numeros: "
	Leer num1, num2
	Escribir "Ingrese el simbolo de la operacion a realizar (+, -, *, /): " Sin Saltar
	Leer simb
	
	Segun simb Hacer
		"+": suma = num1+num2
			 Escribir "La suma es: ",suma
		"-": resta = num1-num2
			 Escribir "La resta es: ",resta
		 "*": multi = num1*num2 
			 Escribir "La multiplicacion es: ",multi
		 "/": Si num2 <> 0  Entonces
				 divi = num1/num2 
				 Escribir "La division es: ",divi
			 SiNo
				Escribir "No se puede dividir"	
			FinSi
		De Otro Modo:
			Escribir "¡¡¡¡¡Operacion incorrecta!!!!!"
	FinSegun
	

FinAlgoritmo
