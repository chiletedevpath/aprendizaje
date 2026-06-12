<?php
/*
Diseñar una aplicación que permita calcular el sueldo neto
en base a días trabajados, horas por día y costo por hora,
aplicando un impuesto a la renta del 10% del total.
*/

$dias = $_POST['dias'];
$horas = $_POST['horas'];
$costo = $_POST['costo'];

// Proceso secuencial
$totalHoras = $dias * $horas;
$sueldoBruto = $totalHoras * $costo;
$impuestoRenta = $sueldoBruto * 0.10;
$sueldoNeto = $sueldoBruto - $impuestoRenta;
?>

<!doctype html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Resultado - Sueldo Neto</title>
    <link rel="stylesheet" href="estilos.css" />
  </head>
  <body>
    <main class="contenedor">
      <section class="tarjeta">
        <h1>Resultado del ejercicio 3</h1>

        <div class="resultado">
          <p><strong>Días trabajados:</strong> <?php echo $dias; ?></p>
          <p><strong>Horas por día:</strong> <?php echo number_format($horas, 2); ?></p>
          <p><strong>Costo por hora:</strong> S/ <?php echo number_format($costo, 2); ?></p>
          <p><strong>Total de horas trabajadas:</strong> <?php echo number_format($totalHoras, 2); ?></p>
          <p><strong>Sueldo bruto:</strong> S/ <?php echo number_format($sueldoBruto, 2); ?></p>
          <p><strong>Impuesto a la renta 10%:</strong> S/ <?php echo number_format($impuestoRenta, 2); ?></p>
          <p class="total"><strong>Sueldo neto:</strong> S/ <?php echo number_format($sueldoNeto, 2); ?></p>
        </div>

        <br />

        <a href="ejercicio_3.html" class="enlace">Volver al ejercicio 3</a>
        <br />
        <a href="index.html" class="enlace">Volver al menú principal</a>
      </section>
    </main>
  </body>
</html>