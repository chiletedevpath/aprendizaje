<?php

$host = getenv("DB_HOST") ?: "localhost";
$usuario = getenv("DB_USER") ?: "root";
$clave = getenv("DB_PASSWORD") ?: "";
$baseDatos = getenv("DB_NAME") ?: "bd_crud_php";
$puerto = (int) (getenv("DB_PORT") ?: 3307);

$conexion = new mysqli($host, $usuario, $clave, $baseDatos, $puerto);

if ($conexion->connect_error) {
    die("Error de conexion a la base de datos: " . $conexion->connect_error);
}

$conexion->set_charset("utf8mb4");

?>
