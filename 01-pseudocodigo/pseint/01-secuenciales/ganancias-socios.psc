Algoritmo Ganancias_Socios
	// Chilete DevPath · Etapa 01: Pseudocódigo
	// Tema: Secuencias, variables y expresiones
	// Objetivo: Practicar una solución secuencial: Ganancias socios.
	// Nota: ejecutar, probar y explicar el algoritmo en PSeInt.
//Una empresa que tiene tres socios: A, B y C. La empresa ha obtenido ciertas ganancias y necesitas repartir estas ganancias entre los socios
//de acuerdo a una tabla, como practicante de ingeniería económica, se te solicita construir un pseudocódigo que permita ingresar un monto de dinero
//y, luego, mostrar cuánto le toca a cada socio según la siguiente tabla: socio A: 30%; socio B: 20%; socio C: 50%.
// Por ejemplo, si el monto es 1000 soles: A recibe 300 soles; B recibe 200 soles; C recibe 500 soles

Definir monto, A, B, C Como Real

Escribir "*** Caso: Repartición de ganancias entre socios ***"
Escribir " "

Escribir "Ingrese la ganancia obtenida: " Sin Saltar
Leer monto

Escribir " "
A = (30 * monto) /100
Escribir "Al socio A le corresponde: ", A
B = (20 * monto) /100
Escribir "Al socio B le corresponde: ", B
C = (50 * monto) /100
Escribir "Al socio C le corresponde: ", C
FinAlgoritmo
