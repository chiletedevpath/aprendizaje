const comentario =
  "Una persona realizó 3 compras, calificó el servicio con 4.5 y esperó 12 minutos.";

function extraerNumeros(texto) {
  return texto.match(/\d+(?:[.,]\d+)?/g) ?? [];
}

const numeros = extraerNumeros(comentario);

document.querySelector("#texto-analizado").textContent = `Texto: ${comentario}`;
document.querySelector("#numeros-encontrados").textContent = numeros.length
  ? `Números encontrados: ${numeros.join(", ")}`
  : "No se encontraron valores numéricos.";
document.querySelector("#cantidad-encontrada").textContent =
  `Cantidad total: ${numeros.length}`;
