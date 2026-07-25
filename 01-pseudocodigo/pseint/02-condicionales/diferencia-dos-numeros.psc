Algoritmo Diferencia_Dos_Numeros
	//Eres un programador y estás trabajando en una función que necesita calcular la diferencia entre dos números.
	//Por ello, se requiere crear un pseudocódigo que tome como entrada dos números enteros y muestre la diferencia
	//entre el mayor y el menor. Este algoritmo podría ser útil, por ejemplo, en una aplicación de finanzas para
	//calcular la diferencia entre dos cantidades de dinero.
	Escribir "**** DIFERENCIA ENTRE DOS NUMEROS ****"
	Escribir " "

	Definir num1, num2, resu, resu1 Como Real

	Escribir "Ingrese el numero 1: "Sin Saltar
	Leer num1
	Escribir "Ingrese el numero 2: "Sin Saltar
	Leer num2

	Escribir " "

	Si num1 > num2 Entonces
		resu = num1 - num2
		Escribir "¡¡ Diferencia entre el numero mayor y menor !!"
		Escribir "El numero mayor es: ", num1
		Escribir "El numero menor es: ", num2
		Escribir "La diferencia entre los dos numeros es: ", resu
	SiNo
		Si num2 > num1 Entonces
			resu1 = num2 - num1
			Escribir "Diferencia entre el numero mayor y menor"
			Escribir "El numero mayor es: ", num2
			Escribir "El numero menor es: ", num1
			Escribir "La diferencia entre los dos numeros es: ", resu1
		SiNo
			Escribir "Los numeros son iguales. La diferencia es 0."
		FinSi
	FinSi

FinAlgoritmo
