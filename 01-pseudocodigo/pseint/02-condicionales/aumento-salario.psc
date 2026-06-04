Algoritmo Aumento_Salario

Escribir "*****   AUMENTO DE SALARIO   *****"
Escribir " "

Definir nom Como Caracter
Definir eda, hij Como Entero 
Definir sal, aum1, aum2, montaum, salfinal Como Real

Escribir "Ingrese su nombre: " Sin Saltar
Leer nom
Escribir "Ingrese su edad: " Sin Saltar
Leer eda
Escribir "Ingrese su sueldo mensual: " Sin Saltar
Leer sal
Escribir "Cuantos hijos tiene: " Sin Saltar
Leer hij

Escribir " "

Si eda > 50 Y hij <> 0 Entonces
	aum1 = sal + 500
	aum2 = ((sal * 4)/100)
	salfinal = (aum1 + aum2)
	montaum = (500 + aum2)
	Escribir "¡¡¡ Aumento exitoso!!!"
	Escribir "Nombre del empleado: ",nom
	Escribir "Edad del empleado:", eda " años."
	Escribir "Sueldo mensual inicial: $", sal," nuevos soles."
	Escribir "Sueldo mensual final: $", salfinal," nuevos soles."
	Escribir "Se le realizo un aumento de: $",montaum " nuevos soles."
FinSi

FinAlgoritmo
