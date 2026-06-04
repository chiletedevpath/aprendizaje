Algoritmo Nombre_mes
     // Eres un programador y estás trabajando en una función que necesita convertir 
     //	un número de mes en el nombre del mes correspondiente para un sistema de gestión de ventas. 
     //	Necesitas crear un programa que tome como entrada el número del mes e imprima en pantalla 
     //	el nombre del mes correspondiente. Si el usuario ingresa un valor fuera del rango de [1-12], el 
     //	programa debe mostrar una advertencia  utiliza Condicional Múltiple.	
	
	 Definir mes Como Entero
	
	 Escribir "Ingrese el numero del mes: " Sin Saltar
	 Leer mes
	
	Si 1<= mes Entonces
		Segun mes Hacer
			1: Escribir " El nombre del mes es Enero"
			2: Escribir " El nombre del mes es Febrero"
			3: Escribir " El nombre del mes es Marzo"
			4: Escribir " El nombre del mes es Abril"
			5: Escribir " El nombre del mes es Mayo"
			6: Escribir " El nombre del mes es Junio"
			7: Escribir " El nombre del mes es Julio"
			8: Escribir " El nombre del mes es Agosto"
			9: Escribir " El nombre del mes es Setiembre"
			10: Escribir " El nombre del mes es Octumbre"
			11: Escribir " El nombre del mes es Noviembre"
			12: Escribir " El nombre del mes es Diciembre"
			De Otro Modo:
				Escribir "¡¡¡NUMERO DE MES NO EXISTE!!!"				
		 FinSegun
	 Sino 
		 Escribir "¡¡¡NUMERO DE MES NO EXISTE!!!"
	FinSi
FinAlgoritmo
