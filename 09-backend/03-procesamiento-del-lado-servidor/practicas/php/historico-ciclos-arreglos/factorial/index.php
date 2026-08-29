<?php
$resultado = "";
$numero = "";

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $numero = $_POST["numero"];

    if ($numero !== "") {
        if ($numero < 0) {
            $resultado = "<p class='error'>El factorial no existe para números negativos.</p>";
        } else {
            $factorial = 1;

            for ($i = 1; $i <= $numero; $i++) {
                $factorial *= $i;
            }

            $resultado = "<h2>Factorial de $numero</h2>";
            $resultado .= "<p>$numero! = $factorial</p>";
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
    <title>Ejercicio 3 - Factorial</title>
</head>
<body>

    <h1>Factorial</h1>

    <form method="POST">
        <label for="numero">Ingrese un número:</label>

        <input
            type="number"
            name="numero"
            id="numero"
            value="<?php echo $numero; ?>"
            required
        >

        <button type="submit">Calcular factorial</button>
    </form>

    <hr>

    <?php echo $resultado; ?>

</body>
</html>