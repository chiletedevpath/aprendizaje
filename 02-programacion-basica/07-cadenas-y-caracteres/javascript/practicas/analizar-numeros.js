// Busca secuencias de dígitos dentro de una cadena.
function analizarNumeros(texto) {
  const numeros = texto.match(/\d+/g);

  if (numeros) {
    console.log("Números encontrados:", numeros);
    console.log("Cantidad total:", numeros.length);
  } else {
    console.log("No se encontraron valores numéricos.");
  }
}

analizarNumeros("Adrian compró 3 productos por 120 soles y recibió 15 soles de descuento.");
