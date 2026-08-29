// Función para formatear la cantidad de likes
function likes(numero) {
  if (!Number.isFinite(numero) || numero < 0) {
    throw new TypeError("La cantidad de likes debe ser un número no negativo.");
  }

  // Si es menor a 1000, devolver el mismo número como texto
  if (numero < 1000) {
    return numero.toString();

    // Si es menor a un millón, convertir a miles
  } else if (numero < 1000000) {
    return Math.floor(numero / 1000) + "K";

    // Si es un millón o más, convertir a millones
  } else {
    return Math.floor(numero / 1000000) + "M";
  }
}

// Pruebas de la función
console.log(likes(1400)); // 1K
console.log(likes(34567)); // 34K
console.log(likes(7456345)); // 7M
console.log(likes(850)); // 850
