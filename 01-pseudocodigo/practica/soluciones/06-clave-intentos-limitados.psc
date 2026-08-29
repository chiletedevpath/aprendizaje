Algoritmo Clave_Intentos_Limitados
	// Chilete DevPath · Etapa 01: Pseudocódigo
	// Tema: Reto de práctica autónoma
	// Objetivo: Solución de referencia: 06 clave intentos limitados.
	// Nota: ejecutar, probar y explicar el algoritmo en PSeInt.
	// Solucion de referencia del reto 6.

	Definir clave, intentos Como Entero

	intentos = 0

	Repetir
		Escribir "Ingrese la clave: " Sin Saltar
		Leer clave
		intentos = intentos + 1
	Hasta Que clave = 2468 O intentos = 3

	Si clave = 2468 Entonces
		Escribir "Acceso concedido."
	SiNo
		Escribir "Acceso bloqueado."
	FinSi
FinAlgoritmo
