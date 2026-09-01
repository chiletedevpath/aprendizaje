// Integra cadenas, arreglos, objetos, recorridos y funciones.
function analizarTexto(texto) {
  if (!texto.includes(".")) {
    return { error: "El texto debe contener al menos un punto." };
  }

  const palabras = texto
    .trim()
    .split(/\s+/)
    .map((palabra) => palabra.toLowerCase().replace(/[.,;:!?¿¡]/g, ""))
    .filter(Boolean);

  if (palabras.length === 0) {
    return { error: "El texto debe contener al menos una palabra." };
  }

  const frecuencias = {};
  let palabraMasFrecuente = "";
  let mayorFrecuencia = 0;

  palabras.forEach((palabra) => {
    frecuencias[palabra] = (frecuencias[palabra] || 0) + 1;

    if (frecuencias[palabra] > mayorFrecuencia) {
      mayorFrecuencia = frecuencias[palabra];
      palabraMasFrecuente = palabra;
    }
  });

  return {
    totalPalabras: palabras.length,
    palabraMasFrecuente
  };
}

console.log(analizarTexto("JavaScript es genial. JavaScript es muy útil."));
