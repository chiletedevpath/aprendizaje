<?php
/*
Solicitar al usuario su sueldo mensual, luego devolver los descuentos de:
Seguro social 3%, pensión 5%, renta 7% y el sueldo final habiendo aplicado los descuentos.
*/

$pago = $_POST['pago'];

$seguro = $pago * 0.03;
$pension = $pago * 0.05;
$renta = $pago * 0.07;

$pagoFinal = $pago - $seguro - $pension - $renta;

echo "<h1>Resultado del ejercicio 1</h1>";

echo "Sueldo Bruto: S/ " . number_format($pago, 2) . "<br>";
echo "Pago Seguro Social: S/ " . number_format($seguro, 2) . "<br>";
echo "Pago Pensión: S/ " . number_format($pension, 2) . "<br>";
echo "Pago Renta: S/ " . number_format($renta, 2) . "<br>";
echo "Pago Final: S/ " . number_format($pagoFinal, 2) . "<br>";

echo "<br>";
echo "<a href='ejercicio_1.html'>Volver al ejercicio 1</a>";
echo "<br>";
echo "<a href='index.html'>Volver al menú principal</a>";
?>