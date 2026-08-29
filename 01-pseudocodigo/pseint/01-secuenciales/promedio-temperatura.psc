Algoritmo CalcularPromedioDeTemperatura
	// Chilete DevPath · Etapa 01: Pseudocódigo
	// Tema: Secuencias, variables y expresiones
	// Objetivo: Practicar una solución secuencial: Promedio temperatura.
	// Nota: ejecutar, probar y explicar el algoritmo en PSeInt.

Definir lun, mar, mie, jue, vie Como Entero
Definir promediotemp Como real

Escribir "*****  ALERTA DE TEMPERATURA  *****"
Escribir " "
Escribir "NOTA: La temperatura es medida en grados celsius"
Escribir " "
Escribir "Ingrese la temperatura del día lunes" Sin Saltar
Leer lun

Escribir "Ingrese la temperatura del día martes" Sin Saltar
Leer mar

Escribir "Ingrese la temperatura del día miercoles" Sin Saltar
Leer mie

Escribir "Ingrese la temperatura del día jueves" Sin Saltar
Leer jue

Escribir "Ingrese la temperatura del día viernes" Sin Saltar
Leer vie

promediotemp = (lun+mar+mie+jue+vie)/5

Si promediotemp>18 Entonces
	Escribir "ALERTA por ola de calor"
SiNo
	Escribir "Temperatura normal"
FinSi

FinAlgoritmo
