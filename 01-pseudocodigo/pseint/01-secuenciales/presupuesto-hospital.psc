Proceso Presupuesto_Hospital
	
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
	
FinProceso
