<?php
$resultado = "";
$numero = "";

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $numero = $_POST["numero"];

    if ($numero !== "") {
        if ($numero < 0) {
            $resultado = "<p class='error'>Debe ingresar un número mayor o igual a 0.</p>";
        } else {
            $contador = $numero;

            $resultado = "<h2>Cuenta regresiva desde $numero hasta 0</h2>";

            while ($contador >= 0) {
                $resultado .= "<p>$contador</p>";
                $contador--;
            }
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
    <title>Ejercicio 5 - Contador descendente</title>
</head>
<body>

    <h1>Contador descendente</h1>

    <form method="POST">
        <label for="numero">Ingrese un número:</label>

        <input
            type="number"
            name="numero"
            id="numero"
            value="<?php echo $numero; ?>"
            required
        >

        <button type="submit">Iniciar contador</button>
    </form>

    <hr>

    <?php echo $resultado; ?>

</body>
</html>