<?php
$pago = filter_input(INPUT_POST, 'pago', FILTER_VALIDATE_FLOAT);
$entradaValida = $pago !== false && $pago !== null && $pago >= 0;

if ($entradaValida) {
    $seguro = $pago * 0.03;
    $pension = $pago * 0.05;
    $renta = $pago * 0.07;
    $pagoFinal = $pago - $seguro - $pension - $renta;
}
?>
<!doctype html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Resultado - Descuentos demostrativos</title>
    <link rel="stylesheet" href="estilos.css" />
  </head>
  <body>
    <main class="contenedor">
      <section class="tarjeta">
        <h1>Resultado del ejercicio 1</h1>
        <p class="descripcion"><strong>Chilete DevPath explica:</strong> PHP valida el dato recibido por POST y ejecuta los cálculos en el servidor. Los porcentajes son únicamente demostrativos.</p>
        <?php if ($entradaValida) { ?>
          <div class="resultado">
            <p><strong>Sueldo bruto:</strong> S/ <?php echo number_format($pago, 2); ?></p>
            <p><strong>Seguro social 3%:</strong> S/ <?php echo number_format($seguro, 2); ?></p>
            <p><strong>Pensión 5%:</strong> S/ <?php echo number_format($pension, 2); ?></p>
            <p><strong>Renta 7%:</strong> S/ <?php echo number_format($renta, 2); ?></p>
            <p class="total"><strong>Pago final:</strong> S/ <?php echo number_format($pagoFinal, 2); ?></p>
          </div>
        <?php } else { ?>
          <p class="resultado">El sueldo debe ser un número mayor o igual que cero.</p>
        <?php } ?>
        <a href="ejercicio_1.html" class="enlace">Volver al ejercicio 1</a><br />
        <a href="index.html" class="enlace">Volver al menú principal</a>
        <footer class="pie-ruta"><p>Práctica educativa desarrollada para Chilete DevPath.</p></footer>
      </section>
    </main>
  </body>
</html>
