<?php
$resultado = "";
$numero = "";

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $numero = $_POST["numero"];

    if ($numero !== "") {
        if ($numero < 5) {
            $resultado = "<p class='error'>Debe ingresar un número mayor o igual a 5.</p>";
        } else {
            $contador = 5;

            $resultado = "<h2>Múltiplos de 5 hasta $numero</h2>";

            do {
                $resultado .= "<p>$contador</p>";
                $contador += 5;
            } while ($contador <= $numero);
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
    <title>Ejercicio 7 - Múltiplos de 5</title>
</head>
<body>

    <h1>Múltiplos de 5</h1>

    <form method="POST">
        <label for="numero">Ingrese un número:</label>

        <input
            type="number"
            name="numero"
            id="numero"
            value="<?php echo $numero; ?>"
            required
        >

        <button type="submit">Mostrar múltiplos</button>
    </form>

    <hr>

    <?php echo $resultado; ?>

</body>
</html>