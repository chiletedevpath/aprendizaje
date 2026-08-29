function formatearLikes(cantidad) {
  if (!Number.isFinite(cantidad) || cantidad < 0) {
    throw new TypeError("La cantidad de likes debe ser un número no negativo.");
  }

  if (cantidad < 1_000) {
    return cantidad.toString();
  }

  if (cantidad < 1_000_000) {
    return `${Math.floor(cantidad / 1_000)}K`;
  }

  return `${Math.floor(cantidad / 1_000_000)}M`;
}

console.log(formatearLikes(1_400));
console.log(formatearLikes(34_567));
console.log(formatearLikes(7_456_345));
console.log(formatearLikes(850));
