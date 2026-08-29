<?php

include "../conexion.php";

if (isset($_POST["btnRegistrar"])) {

    $nombres = trim($_POST["nombres"]);
    $apellidos = trim($_POST["apellidos"]);
    $dni = trim($_POST["dni"]);
    $correo = trim($_POST["correo"]);
    $telefono = trim($_POST["telefono"]);

    if (!empty($nombres) && !empty($apellidos) && !empty($dni) && !empty($correo) && !empty($telefono)) {

        $sql = "INSERT INTO personas (nombres, apellidos, dni, correo, telefono) 
                VALUES (?, ?, ?, ?, ?)";

        $stmt = $conexion->prepare($sql);
        $stmt->bind_param("sssss", $nombres, $apellidos, $dni, $correo, $telefono);

        if ($stmt->execute()) {
            header("Location: ../index.php");
            exit();
        } else {
            echo "Error al registrar persona: " . $conexion->error;
        }

        $stmt->close();

    } else {
        echo "Todos los campos son obligatorios.";
    }
}

$conexion->close();

?>