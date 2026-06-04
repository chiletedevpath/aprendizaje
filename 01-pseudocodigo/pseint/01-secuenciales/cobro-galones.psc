Proceso Cobro_Galones
//Construir un pseudocódigo para una gasolinera cuya bomba surtidora registra la compra en galones, pero el precio de la 
//gasolina está fijado en S/10.50 el litro. El pseudocódigo debe calcular y mostrar cuánto hay que cobrarle al cliente si 
//consume una cierta cantidad de galones. Dónde: 1 Galón = 3.785 lts.
//Por ejemplo, si se compra 10 galones, se convierte a litros cuyo valor sería 37.85 y luego se multiplica por el precio 
//de 10.50 obteniendo 397,425
	
Definir galones Como Entero
Definir preciogalon Como Real
Definir montopagar  Como Real
	
Escribir "*** Compra de gasolina ***"
Escribir " "
	
preciogalon = 10.50*3.785
Escribir "Ingrese la cantidad de galones a comprar: " Sin Saltar
Leer galones
Escribir " "
	
montopagar = (galones*preciogalon)
Escribir "Monto a pagar: ", montopagar " nuevos soles"
	
FinProceso
