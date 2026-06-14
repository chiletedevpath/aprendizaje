<?php
$resultado = "";
$palabra = "";

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $palabra = $_POST["palabra"];

    if ($palabra !== "") {
        $contadorVocales = 0;
        $palabraMinuscula = strtolower($palabra);

        for ($i = 0; $i < strlen($palabraMinuscula); $i++) {
            $letra = $palabraMinuscula[$i];

            if (
                $letra == "a" ||
                $letra == "e" ||
                $letra == "i" ||
                $letra == "o" ||
                $letra == "u"
            ) {
                $contadorVocales++;
            }
        }

        $resultado = "<h2>Resultado</h2>";
        $resultado .= "<p>Palabra ingresada: $palabra</p>";
        $resultado .= "<p>Cantidad de vocales: $contadorVocales</p>";
    } else {
        $resultado = "<p class='error'>Debe ingresar una palabra.</p>";
    }
}
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Ejercicio 8 - Contador de vocales</title>
</head>
<body>

    <h1>Contador de vocales</h1>

    <form method="POST">
        <label for="palabra">Ingrese una palabra:</label>

        <input
            type="text"
            name="palabra"
            id="palabra"
            value="<?php echo $palabra; ?>"
            required
        >

        <button type="submit">Contar vocales</button>
    </form>

    <hr>

    <?php echo $resultado; ?>

</body>
</html>