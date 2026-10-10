// Ejecutamos el código cuando el navegador termina de cargar el HTML.
document.addEventListener('DOMContentLoaded', function () {
    console.info('Registro de Estudiantes: interfaz cargada con Thymeleaf.');

    // El formulario envía sus datos por POST al controlador de Spring Boot.
    const formulario = document.querySelector('form');
    if (formulario) {
        formulario.addEventListener('submit', function () {
            console.info('Enviando datos del estudiante al controlador...');
        });
    }
});
