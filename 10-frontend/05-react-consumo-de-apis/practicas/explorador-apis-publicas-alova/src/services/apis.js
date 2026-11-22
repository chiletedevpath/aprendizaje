import { createAlova } from "alova";
import ReactHook from "alova/react";
import adapterFetch from "alova/fetch";

async function procesarRespuesta(respuesta) {
  const datos = await respuesta.json().catch(() => null);

  if (!respuesta.ok) {
    if (respuesta.status === 404) {
      throw new Error("No se encontró el recurso solicitado.");
    }
    if (respuesta.status === 403 || respuesta.status === 429) {
      throw new Error("Se alcanzó el límite temporal de consultas. Intenta más tarde.");
    }
    throw new Error(datos?.message || `Error HTTP ${respuesta.status}`);
  }

  return datos;
}

export const githubApi = createAlova({
  baseURL: "https://api.github.com",
  statesHook: ReactHook,
  requestAdapter: adapterFetch(),
  responded: procesarRespuesta,
});

export const dummyApi = createAlova({
  baseURL: "https://dummyjson.com",
  statesHook: ReactHook,
  requestAdapter: adapterFetch(),
  responded: procesarRespuesta,
});

export function obtenerRepositorios(usuario, pagina) {
  return githubApi.Get(
    `/users/${encodeURIComponent(usuario)}/repos?per_page=20&page=${pagina}&sort=updated`,
    { cacheFor: 0 }
  );
}

export function obtenerDetalleRepositorio(propietario, nombre) {
  return githubApi.Get(
    `/repos/${encodeURIComponent(propietario)}/${encodeURIComponent(nombre)}`,
    { cacheFor: 0 }
  );
}

export function buscarUsuarioDummy(usuario) {
  return dummyApi.Get(
    `/users/filter?key=username&value=${encodeURIComponent(usuario)}`,
    { cacheFor: 0 }
  );
}
