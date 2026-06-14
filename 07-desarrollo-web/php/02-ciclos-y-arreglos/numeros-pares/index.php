<?php
$resultado = "";
$numero = "";

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $numero = $_POST["numero"];

    if ($numero !== "") {
        $resultado = "<h2>Números pares desde 1 hasta $numero</h2>";

        for ($i = 1; $i <= $numero; $i++) {
            if ($i % 2 == 0) {
                $resultado .= "<p>$i</p>";
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
    <title>Ejercicio 2 - Números pares</title>
</head>
<body>

    <h1>Números pares</h1>

    <form method="POST">
        <label for="numero">Ingrese un número:</label>

        <input
            type="number"
            name="numero"
            id="numero"
            value="<?php echo $numero; ?>"
            required
        >

        <button type="submit">Mostrar pares</button>
    </form>

    <hr>

    <?php echo $resultado; ?>

</body>
</html>