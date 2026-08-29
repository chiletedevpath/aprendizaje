<?php
$nombre = trim($_POST['nombre'] ?? '');
$correo = trim($_POST['correo'] ?? '');
$errores = [];

if ($nombre === '') {
    $errores[] = 'El nombre es obligatorio.';
}
if (!filter_var($correo, FILTER_VALIDATE_EMAIL)) {
    $errores[] = 'El correo no tiene un formato válido.';
}

if ($errores !== []) {
    http_response_code(422);
    header('Content-Type: application/json');
    echo json_encode(['errores' => $errores]);
    exit;
}

http_response_code(201);
header('Content-Type: application/json');
echo json_encode(['nombre' => $nombre, 'correo' => $correo]);
