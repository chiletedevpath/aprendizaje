import { createAlova } from "alova";
import ReactHook from "alova/react";
import adapterFetch from "alova/fetch";

export const api = createAlova({
  baseURL: "https://jsonplaceholder.typicode.com",
  statesHook: ReactHook,
  requestAdapter: adapterFetch(),
  responded: async (respuesta) => {
    if (respuesta.status === 404) return null;
    if (!respuesta.ok) throw new Error("No se pudo consultar el servicio.");
    return respuesta.json();
  },
});
