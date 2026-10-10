interface Libro {
  titulo: string;
  numeroPaginas: number;
}

const libros: Libro[] = [
  { titulo: "Fundamentos de algoritmos", numeroPaginas: 240 },
  { titulo: "Programación orientada a objetos", numeroPaginas: 380 },
  { titulo: "Estructuras de datos", numeroPaginas: 420 },
  { titulo: "Desarrollo web accesible", numeroPaginas: 290 },
];

console.table(libros.filter((libro) => libro.numeroPaginas > 300));
