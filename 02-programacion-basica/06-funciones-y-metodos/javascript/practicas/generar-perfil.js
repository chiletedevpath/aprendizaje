// Genera una tarjeta digital a partir de los datos de un estudiante.
function generarPerfil(nombre, carrera, ciclo, promedio) {
  const perfil = `
Tarjeta Digital del Estudiante

Nombre: ${nombre}
Carrera: ${carrera}
Ciclo: ${ciclo}
Promedio: ${promedio}
Nivel: ${promedio >= 14 ? "Estudiante destacado" : "Estudiante regular"}
`;

  console.log(perfil);
}

generarPerfil("Adrian Pisco", "Ing. Sistemas", 6, 20);
