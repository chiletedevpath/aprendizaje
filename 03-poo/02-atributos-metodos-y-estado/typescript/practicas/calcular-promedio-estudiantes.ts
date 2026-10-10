class Estudiante {
  constructor(
    public readonly nombre: string,
    private readonly notas: readonly number[],
  ) {}

  calcularPromedio(): number {
    if (this.notas.length === 0) return 0;
    return this.notas.reduce((total, nota) => total + nota, 0) / this.notas.length;
  }
}

const estudiantes: Estudiante[] = [
  new Estudiante("Elena Torres", [16, 18, 17]),
  new Estudiante("María Rojas", [14, 15, 16]),
  new Estudiante("Carlos Vega", [18, 19, 17]),
];

console.table(
  estudiantes.map((estudiante) => ({
    estudiante: estudiante.nombre,
    promedio: estudiante.calcularPromedio().toFixed(2),
  })),
);
