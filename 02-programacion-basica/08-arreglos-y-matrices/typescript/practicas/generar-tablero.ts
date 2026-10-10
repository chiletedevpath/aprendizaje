function generarTablero(filas: number, columnas: number): number[][] {
  return Array.from({ length: filas }, () =>
    Array.from({ length: columnas }, () => Math.floor(Math.random() * 5) + 1),
  );
}

console.log("Tablero de juego 3 x 3");
generarTablero(3, 3).forEach((fila) => console.log(fila.join("  ")));
