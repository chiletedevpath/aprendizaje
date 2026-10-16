document.addEventListener('DOMContentLoaded', () => {
    const formulario = document.querySelector('#formulario-mascota');
    if (!formulario) return;

    // Evita registrar accidentalmente datos sin revisar.
    formulario.addEventListener('submit', (evento) => {
        if (!formulario.checkValidity()) return;
        if (!window.confirm('¿Deseas guardar los datos de esta mascota?')) {
            evento.preventDefault();
        }
    });
});
