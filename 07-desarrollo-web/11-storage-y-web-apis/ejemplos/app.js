const selector = document.querySelector('#modo');

// localStorage conserva texto entre sesiones del mismo origen.
const modoGuardado = localStorage.getItem('modo');
if (modoGuardado) selector.value = modoGuardado;

selector.addEventListener('change', () => {
  localStorage.setItem('modo', selector.value);
});
