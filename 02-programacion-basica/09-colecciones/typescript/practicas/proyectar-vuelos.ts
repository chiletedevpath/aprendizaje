interface Aeropuerto {
  ciudad: string;
  codigo: string;
  vuelosProgramados: number;
}

const aeropuertos: Aeropuerto[] = [
  { ciudad: "Ciudad Norte", codigo: "CTN", vuelosProgramados: 120 },
  { ciudad: "Ciudad Centro", codigo: "CTC", vuelosProgramados: 80 },
  { ciudad: "Ciudad Sur", codigo: "CTS", vuelosProgramados: 60 },
];

console.table(
  aeropuertos.map((aeropuerto) => ({
    ...aeropuerto,
    vuelosProyectados: Math.round(aeropuerto.vuelosProgramados * 1.2),
  })),
);
