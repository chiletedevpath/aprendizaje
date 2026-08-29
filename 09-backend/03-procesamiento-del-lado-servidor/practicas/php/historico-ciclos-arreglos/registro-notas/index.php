<?php
$notas = [15, 18, 14, 17, 16];

$suma = 0;
$cantidadNotas = count($notas);

foreach ($notas as $nota) {
    $suma += $nota;
}

$promedio = $suma / $cantidadNotas;
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Ejercicio 10 - Registro de notas</title>
</head>
<body>

    <h1>Registro de notas</h1>

    <h2>Notas registradas</h2>

    <ul>
        <?php foreach ($notas as $nota) { ?>
            <li><?php echo $nota; ?></li>
        <?php } ?>
    </ul>

    <hr>

    <h2>Promedio final</h2>
    <p>Promedio: <?php echo $promedio; ?></p>

</body>
</html>