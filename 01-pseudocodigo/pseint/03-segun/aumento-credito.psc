Algoritmo Aumento_Credito
     // El banco "Préstamo fácil" ha decidido aumentar el límite de crédito de las tarjetas de sus clientes. Para
     // esto, se considera la siguiente información:
     // Si tiene tarjeta tipo 1, el aumento será de 20 %
     // Si tiene tipo 2, el aumento será de 30 %
     // Si tiene tipo 3 el aumento será de 40 %
	 // Para cualquier otro tipo, el aumento será de 45 %.
	 // Si la persona tiene deuda con el banco solo se le dará la mitad de incremento si es tipo 1 y 2, el resto de
	 // tipos de tarjeta no tendrá incremento si tiene deuda.
	 // ¿Qué hacer?
	 // Realice un pseudocódigo para determinar el nuevo límite de crédito que tendrá una persona en su tarjeta.
		
	 Definir tipo Como Entero
	 Definir deuda Como Logico
	 Definir cred, aume,nuevo_cred Como Real
	
	 Escribir "*****  Banco Prestamo Facil  *****"
	 Escribir " "
	
	 Escribir "Ingrese su tipo de tarjeta (1,2,3 u otra" Sin Saltar
	 Leer tipo
	 Escribir "¿Tiene deuda?" Sin Saltar
	 Leer deuda
	 Escribir "Ingrese su limite de credito" Sin Saltar
	 Leer cred
	
	Segun tipo Hacer
		1: Si deuda Entonces
				aume = 0.10
			SiNo
				aume = 0.20
			FinSi
		2: Si deuda Entonces
				aume = 0.15
			SiNo
				aume = 0.30
			FinSi
		3: Si deuda Entonces
				aume = 0.00
			SiNo
				aume = 0.40
			FinSi
		De Otro Modo:
			Si deuda Entonces
				aume = 0.00
			Sino 
				aume = 0.45
				
			FinSi
		
	FinSegun
	
	nuevo_cred = cred+(cred*aume)
	Escribir "El nuevo limite de credito es: S/.",nuevo_cred " nuevos soles"
	
	
FinAlgoritmo
