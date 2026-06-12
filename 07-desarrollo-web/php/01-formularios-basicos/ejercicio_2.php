<?php

$nombres = $_GET['nombres'];
$apellidos = $_GET['apellidos'];
$edad = $_GET['edad'];

echo "<h1>Resultado del ejercicio 2</h1>";

echo "Bienvenido al curso, " . $nombres . " " . $apellidos . "<br>";
echo "Veo que tienes " . $edad . " años.";

echo "<br><br>";
echo "<a href='ejercicio_2.html'>Volver al ejercicio 2</a>";
echo "<br>";
echo "<a href='index.html'>Volver al menú principal</a>";

?>