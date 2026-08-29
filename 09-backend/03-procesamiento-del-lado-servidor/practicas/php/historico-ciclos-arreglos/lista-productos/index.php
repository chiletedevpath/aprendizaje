<?php
$productos = [
    "Martillo",
    "Destornillador",
    "Alicate",
    "Taladro",
    "Llave inglesa",
    "Cinta métrica",
    "Serrucho",
    "Clavos",
    "Tornillos",
    "Pegamento"
];
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Ejercicio 9 - Lista de productos</title>
</head>
<body>

    <h1>Lista de productos</h1>

    <h2>Productos registrados</h2>

    <ul>
        <?php foreach ($productos as $producto) { ?>
            <li><?php echo $producto; ?></li>
        <?php } ?>
    </ul>

</body>
</html>