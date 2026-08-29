<?php

include "../conexion.php";

if (isset($_POST["btnActualizar"])) {

    $id = $_POST["id"];
    $nombres = trim($_POST["nombres"]);
    $apellidos = trim($_POST["apellidos"]);
    $dni = trim($_POST["dni"]);
    $correo = trim($_POST["correo"]);
    $telefono = trim($_POST["telefono"]);

    if (!empty($id) && !empty($nombres) && !empty($apellidos) && !empty($dni) && !empty($correo) && !empty($telefono)) {

        $sql = "UPDATE personas 
                SET nombres = ?, apellidos = ?, dni = ?, correo = ?, telefono = ?
                WHERE id = ?";

        $stmt = $conexion->prepare($sql);
        $stmt->bind_param("sssssi", $nombres, $apellidos, $dni, $correo, $telefono, $id);

        if ($stmt->execute()) {
            header("Location: ../index.php");
            exit();
        } else {
            echo "Error al actualizar persona: " . $conexion->error;
        }

        $stmt->close();

    } else {
        echo "Todos los campos son obligatorios.";
    }
}

$conexion->close();

?>