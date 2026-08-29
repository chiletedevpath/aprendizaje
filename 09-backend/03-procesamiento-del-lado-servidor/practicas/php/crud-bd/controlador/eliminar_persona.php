<?php

include "../conexion.php";

if (isset($_GET["id"])) {

    $id = $_GET["id"];

    $sql = "DELETE FROM personas WHERE id = ?";

    $stmt = $conexion->prepare($sql);
    $stmt->bind_param("i", $id);

    if ($stmt->execute()) {
        header("Location: ../index.php");
        exit();
    } else {
        echo "Error al eliminar persona: " . $conexion->error;
    }

    $stmt->close();

} else {
    echo "ID no recibido.";
}

$conexion->close();

?>