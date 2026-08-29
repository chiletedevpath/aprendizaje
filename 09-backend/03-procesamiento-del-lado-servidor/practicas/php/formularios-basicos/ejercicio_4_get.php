<?php
/*
Ingresar el nombre, precio y cantidad de un producto.
Calcular subtotal, IGV y total a pagar usando el método GET.
*/

$nombre = $_GET['nombre'];
$precio = $_GET['precio'];
$cantidad = $_GET['cantidad'];

$subtotal = $precio * $cantidad;
$igv = $subtotal * 0.18;
$total = $subtotal + $igv;
?>

<!doctype html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Resultado - Método GET</title>
    <link rel="stylesheet" href="estilos.css" />
  </head>
  <body>
    <main class="contenedor">
      <section class="tarjeta">
        <h1>Resultado con método GET</h1>

        <div class="resultado">
          <p><strong>Producto:</strong> <?php echo $nombre; ?></p>
          <p><strong>Precio unitario:</strong> S/ <?php echo number_format($precio, 2); ?></p>
          <p><strong>Cantidad:</strong> <?php echo $cantidad; ?></p>
          <p><strong>Subtotal:</strong> S/ <?php echo number_format($subtotal, 2); ?></p>
          <p><strong>IGV 18%:</strong> S/ <?php echo number_format($igv, 2); ?></p>
          <p class="total"><strong>Total a pagar:</strong> S/ <?php echo number_format($total, 2); ?></p>
        </div>

        <br />

        <a href="ejercicio_4_get.html" class="enlace">Volver al ejercicio GET</a>
        <br />
        <a href="index.html" class="enlace">Volver al menú principal</a>
      </section>
    </main>
  </body>
</html>