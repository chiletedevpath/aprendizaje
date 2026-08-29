const estado = document.querySelector('#estado');
const lista = document.querySelector('#lista');

async function cargarTemas() {
  try {
    // fetch inicia una petición HTTP y devuelve una Promise con la respuesta.
    const respuesta = await fetch('./datos.json');

    // response.ok permite detectar estados HTTP fuera del rango exitoso.
    if (!respuesta.ok) throw new Error(`HTTP ${respuesta.status}`);

    const temas = await respuesta.json();
    temas.forEach(({ tema, estado: progreso }) => {
      const item = document.createElement('li');
      item.textContent = `${tema}: ${progreso}`;
      lista.append(item);
    });
    estado.textContent = 'Datos cargados.';
  } catch (error) {
    estado.textContent = 'No se pudieron cargar los datos.';
    console.error(error);
  }
}

cargarTemas();
