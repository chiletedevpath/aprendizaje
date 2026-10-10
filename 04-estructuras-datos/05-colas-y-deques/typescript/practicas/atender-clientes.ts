const colaClientes: string[] = ["Cliente 1", "Cliente 2", "Cliente 3", "Cliente 4"];

function atenderSiguiente(cola: string[]): string | undefined {
  return cola.shift();
}

console.log("Cola inicial:", [...colaClientes]);
console.log("Primer cliente atendido:", atenderSiguiente(colaClientes));
console.log("Segundo cliente atendido:", atenderSiguiente(colaClientes));
console.log("Cola pendiente:", colaClientes);
