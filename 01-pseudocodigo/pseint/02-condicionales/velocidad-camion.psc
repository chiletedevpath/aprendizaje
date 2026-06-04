Algoritmo Velocidad_Camion
//Eres un desarrollador de software para una empresa de logística y estás trabajando en un sistema de seguimiento de vehículos. 
//Por ello, se requiere crear un pseudocódigo que tome como entrada la velocidad de un camión, muestre un mensaje indicando 
//"Velocidad normal" si su velocidad es de 70Km/h o menor, o un mensaje indicando "Reducir velocidad" e indicar en cuánto debe 
//reducir su velocidad para ser de 70Km/h en caso contrario. Este algoritmo podría ser útil en un sistema de seguimiento de 
//vehículos para alertar a los conductores cuando están excediendo la velocidad segura.
	
	Escribir "   ***   ALERTA DE VELOCIDAD   ***   "
	Escribir " "
	
	Definir vel, red Como Real
	
	Escribir "NOTA: La velocidad de los vehiculos es medida en KM/H"
	Escribir " "
	Escribir "Ingrese la velocidad de su vehiculo" Sin Saltar
	Leer vel
	
	Si vel <= 70 O 70 > vel Entonces
		Escribir "Velocidad normal"
	SiNo
		red = vel - 70
		Escribir "Reducir velocidad: ", red " Km/H"
	FinSi
		
FinAlgoritmo
