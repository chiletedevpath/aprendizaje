const formulario = document.querySelector('#formulario');
const campoTema = document.querySelector('#tema');
const lista = document.querySelector('#lista');

formulario.addEventListener('submit', (event) => {
  // preventDefault evita que el formulario recargue la página al enviarse.
  event.preventDefault();

  const tema = campoTema.value.trim();
  if (!tema) return;

  const item = document.createElement('li');
  item.textContent = tema;
  lista.append(item);

  formulario.reset();
  campoTema.focus();
});
