Algoritmo Aumento_Salario
	// Chilete DevPath · Etapa 01: Pseudocódigo
	// Tema: Decisiones con Si
	// Objetivo: Practicar decisiones y validaciones: Aumento salario.
	// Nota: ejecutar, probar y explicar el algoritmo en PSeInt.

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
	Escribir "Aumento aplicado correctamente"
	Escribir "Nombre del empleado: ",nom
	Escribir "Edad del empleado:", eda " años."
	Escribir "Sueldo mensual inicial: S/ ", sal
	Escribir "Sueldo mensual final: S/ ", salfinal
	Escribir "Monto del aumento: S/ ",montaum
SiNo
	Escribir "El empleado no cumple los criterios para recibir el aumento."
FinSi

FinAlgoritmo
