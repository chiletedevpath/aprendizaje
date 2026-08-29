<?php
$resultado = "";
$base = "";
$exponente = "";

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $base = $_POST["base"];
    $exponente = $_POST["exponente"];

    if ($base !== "" && $exponente !== "") {
        if ($exponente < 0) {
            $resultado = "<p class='error'>El exponente debe ser mayor o igual a 0.</p>";
        } else {
            $potencia = 1;

            for ($i = 1; $i <= $exponente; $i++) {
                $potencia *= $base;
            }

            $resultado = "<h2>Resultado de la potencia</h2>";
            $resultado .= "<p>$base elevado a $exponente = $potencia</p>";
        }
    } else {
        $resultado = "<p class='error'>Debe ingresar la base y el exponente.</p>";
    }
}
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Ejercicio 6 - Potencias</title>
</head>
<body>

    <h1>Potencias</h1>

    <form method="POST">
        <label for="base">Ingrese la base:</label>

        <input
            type="number"
            name="base"
            id="base"
            value="<?php echo $base; ?>"
            required
        >

        <br><br>

        <label for="exponente">Ingrese el exponente:</label>

        <input
            type="number"
            name="exponente"
            id="exponente"
            value="<?php echo $exponente; ?>"
            required
        >

        <br><br>

        <button type="submit">Calcular potencia</button>
    </form>

    <hr>

    <?php echo $resultado; ?>

</body>
</html>