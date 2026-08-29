<?php
$pdo = new PDO(
    'mysql:host=localhost;dbname=academia;charset=utf8mb4',
    getenv('DB_USERNAME') ?: 'root',
    getenv('DB_PASSWORD') ?: ''
);

// La consulta preparada separa la instrucción SQL de los datos recibidos.
$stmt = $pdo->prepare('SELECT id, nombre FROM cursos WHERE estado = :estado');
$stmt->execute(['estado' => 'ACTIVO']);
$cursos = $stmt->fetchAll(PDO::FETCH_ASSOC);
