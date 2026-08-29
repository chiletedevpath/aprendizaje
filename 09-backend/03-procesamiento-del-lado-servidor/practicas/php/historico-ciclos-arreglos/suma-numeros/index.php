<?php
$resultado = "";
$numero = "";

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $numero = $_POST["numero"];

    if ($numero !== "") {
        if ($numero < 1) {
            $resultado = "<p class='error'>Debe ingresar un número mayor o igual a 1.</p>";
        } else {
            $suma = 0;
            $contador = 1;

            while ($contador <= $numero) {
                $suma += $contador;
                $contador++;
            }

            $resultado = "<h2>Suma desde 1 hasta $numero</h2>";
            $resultado .= "<p>Resultado: $suma</p>";
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
    <title>Ejercicio 4 - Suma de números</title>
</head>
<body>

    <h1>Suma de números</h1>

    <form method="POST">
        <label for="numero">Ingrese un número:</label>

        <input
            type="number"
            name="numero"
            id="numero"
            value="<?php echo $numero; ?>"
            required
        >

        <button type="submit">Calcular suma</button>
    </form>

    <hr>

    <?php echo $resultado; ?>

</body>
</html>