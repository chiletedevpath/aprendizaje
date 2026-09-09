// Introducción al comportamiento LIFO mediante push, pop y consulta del último elemento.

const tareas = [];

tareas.push("Revisar ejercicios");
tareas.push("Documentar resultados");
tareas.push("Actualizar el seguimiento");

const tareaActual = tareas.at(-1) ?? "No hay tareas pendientes";
const tareaRetirada = tareas.pop() ?? "No se retiró ninguna tarea";

console.log("Tareas registradas:", [...tareas, tareaRetirada]);
console.log("Última tarea antes de retirar:", tareaActual);
console.log("Tarea retirada:", tareaRetirada);
console.log("Tareas restantes:", tareas);
