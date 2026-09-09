// Encapsula las notas y el cálculo del promedio en una clase.

class Estudiante {
  constructor(nombre, notas) {
    this.nombre = nombre;
    this.notas = [...notas];
  }

  calcularPromedio() {
    if (this.notas.length === 0) {
      return 0;
    }

    const suma = this.notas.reduce((acumulado, nota) => acumulado + nota, 0);
    return suma / this.notas.length;
  }
}

const estudiantes = [
  new Estudiante("Elena", [18, 16, 17, 19]),
  new Estudiante("Marco", [14, 15, 13, 16]),
  new Estudiante("Lucía", [17, 18, 19, 16]),
];

const promedios = estudiantes.map((estudiante) => ({
  nombre: estudiante.nombre,
  promedio: Number(estudiante.calcularPromedio().toFixed(2)),
}));

console.table(promedios);
