Proceso Calcular_Minutos
//Te han contratado para trabajar en una fábrica de chocolate empacando los productos. La empresa, brinda el monto de pago,
//pero no por horas o días, sino por minutos. Por ello, necesitas calcular el número de minutos que hay en un determinado 
//número de días.Se te solicita construir un pseudocódigo que calcule y muestre el número de minutos que hay en un determinado 
//número de días.
//Por ejemplo, si se indica 2 días, debe mostrar que hay 2880 minutos.

Definir dias Como Entero
Definir cantminut Como Entero	

Escribir "*** PAGO ***"
Escribir " "

Escribir "Ingrese sus dias trabajados: " Sin Saltar
Leer dias
Escribir " "

cantminut=(dias*(60*24))

Escribir "Los minutos trabajados son: ", cantminut

FinProceso
