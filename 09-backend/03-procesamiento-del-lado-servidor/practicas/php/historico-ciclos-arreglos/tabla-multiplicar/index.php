<?php
$resultado = "";
$numero = "";

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $numero = $_POST["numero"];

    if ($numero !== "") {
        $resultado = "<h2>Tabla de multiplicar del $numero</h2>";

        for ($i = 1; $i <= 12; $i++) {
            $multiplicacion = $numero * $i;
            $resultado .= "<p>$numero x $i = $multiplicacion</p>";
        }
    } else {
        $resultado = "<p class='error'>Debe ingresar un número.</p>";
    }
}
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Ejercicio 1 - Tabla de multiplicar</title>
</head>
<body>

    <h1>Tabla de multiplicar</h1>

    <form method="POST">
        <label for="numero">Ingrese un número:</label>

        <input
            type="number"
            name="numero"
            id="numero"
            value="<?php echo $numero; ?>"
            required
        >

        <button type="submit">Calcular</button>
    </form>

    <hr>

    <?php echo $resultado; ?>

</body>
</html>
