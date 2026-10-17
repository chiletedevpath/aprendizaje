<?php
$nombres = trim((string) filter_input(INPUT_GET, 'nombres'));
$apellidos = trim((string) filter_input(INPUT_GET, 'apellidos'));
$edad = filter_input(INPUT_GET, 'edad', FILTER_VALIDATE_INT, [
    'options' => ['min_range' => 1, 'max_range' => 120],
]);
$entradaValida = $nombres !== '' && $apellidos !== '' && $edad !== false && $edad !== null;
?>
<!doctype html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Resultado - Datos demostrativos</title>
    <link rel="stylesheet" href="estilos.css" />
  </head>
  <body>
    <main class="contenedor">
      <section class="tarjeta">
        <h1>Resultado del ejercicio 2</h1>
        <p class="descripcion"><strong>Chilete DevPath explica:</strong> PHP valida los parámetros GET y escapa el texto antes de incorporarlo a la respuesta para evitar interpretar entradas como HTML.</p>
        <?php if ($entradaValida) { ?>
          <div class="resultado">
            <p><strong>Participante:</strong> <?php echo htmlspecialchars($nombres . ' ' . $apellidos, ENT_QUOTES, 'UTF-8'); ?></p>
            <p><strong>Edad demostrativa:</strong> <?php echo $edad; ?> años</p>
          </div>
        <?php } else { ?>
          <p class="resultado">Completa nombres, apellidos y una edad válida entre 1 y 120.</p>
        <?php } ?>
        <a href="ejercicio_2.html" class="enlace">Volver al ejercicio 2</a><br />
        <a href="index.html" class="enlace">Volver al menú principal</a>
        <footer class="pie-ruta"><p>Práctica educativa desarrollada para Chilete DevPath.</p></footer>
      </section>
    </main>
  </body>
</html>
