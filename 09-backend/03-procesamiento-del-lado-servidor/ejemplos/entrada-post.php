<?php
// $_POST contiene los campos enviados por un formulario con método POST.
$nombre = trim($_POST['nombre'] ?? '');
$correo = trim($_POST['correo'] ?? '');

if ($nombre === '' || !filter_var($correo, FILTER_VALIDATE_EMAIL)) {
    http_response_code(400);
    echo 'Datos inválidos';
    exit;
}

http_response_code(200);
echo "Registro recibido para " . htmlspecialchars($nombre, ENT_QUOTES, 'UTF-8');
