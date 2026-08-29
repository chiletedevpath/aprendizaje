Algoritmo Presupuesto_Hospital
	// Chilete DevPath · Etapa 01: Pseudocódigo
	// Tema: Secuencias, variables y expresiones
	// Objetivo: Practicar una solución secuencial: Presupuesto hospital.
	// Nota: ejecutar, probar y explicar el algoritmo en PSeInt.

Definir presupuesto,gine,traumo,pedia Como Real

Escribir "Ingrese el presupuesto anual del hospital S/: " Sin Saltar
Leer presupuesto

//presupuesto de area = (presupuesto*porcentaje)/100
gine = presupuesto*0.4
Escribir "El area de Ginecología recibira: S/",gine

traumo = presupuesto*0.3
Escribir "El area de Traumotologia recibira: S/",traumo

pedia = presupuesto*0.3
Escribir "El area de Pediatria recibira: S/",pedia

FinAlgoritmo
