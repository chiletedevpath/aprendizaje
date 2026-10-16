# Huellas — Registro de mascotas

Aplicación para registrar mascotas de un refugio y consultar su disponibilidad para adopción según el estado de salud.

## Requisitos

- Java 17 o superior.
- Visual Studio Code con las extensiones Java y Spring Boot.
- Conexión a Internet durante la primera ejecución para resolver dependencias de Maven.

## Iniciar en Windows

1. Abrir la carpeta `refugio-mascotas-thymeleaf` en Visual Studio Code.
2. Abrir una terminal PowerShell dentro de esa carpeta.
3. Ejecutar:

```powershell
java -version
.\mvnw.cmd spring-boot:run
```

4. Entrar a http://localhost:8080/

El iniciador `mvnw.cmd` descarga Apache Maven 3.9.9 la primera vez si todavía no se encuentra en `.mvn`.

**Puerto ocupado:** si otro servidor utiliza el puerto 8080, detenlo con `Ctrl + C` antes de iniciar Huellas.

## Rutas disponibles

| Ruta | Método | Vista | Función |
| --- | --- | --- | --- |
| `/` | GET | `inicio.html` | Inicio y resumen |
| `/mascota/nueva` | GET | `formulario.html` | Registro |
| `/mascota/guardar` | POST | `detalle.html` | Guardar y evaluar |
| `/mascota/lista` | GET | `lista.html` | Todos los ingresos |
| `/mascota/estado` | GET | `estado.html` | Consulta individual; admite `?indice=0` |

## Pruebas recomendadas

1. Registra **Rocky** (Perro, 2, Bueno). Debe indicar *Disponible para adopción*.
2. Registra **Luna** (Gato, 3, Regular). Debe indicar *En tratamiento*.
3. Registra **Max** (Perro, 5, Critico). Debe indicar *No disponible (en observación)*.
4. Registra **Nala** (Gato, 0, Bueno). Debe indicar *Disponible para adopción* y *Es cachorro*.
5. Comprueba en el listado las cuatro condiciones. Abre el estado de cada mascota usando **Ver estado**.

La sección Estado muestra el registro más reciente si no se indica uno específico. Antes de que exista el primer registro, presenta una ficha inicial ilustrativa. Tras registrar una mascota, se consulta y evalúa el dato real seleccionado.

Los registros se almacenan temporalmente en una lista de Java. Al reiniciar el servidor se eliminan. No hay base de datos ni carga de fotografías reales de mascotas.

## Etiquetas utilizadas

- `th:object`, `th:field`, `th:action`: relación formulario–modelo.
- `th:text`: valores dinámicos seguros.
- `th:each`: recorrido de mascotas registradas.
- `th:if` y `th:unless`: evaluación individual del estado de salud y edad.
- Operador ternario: presentación de textos según los datos.
- `th:href`: rutas internas de la aplicación.

## Recursos visuales

La práctica usa tres ilustraciones SVG propias y locales en `src/main/resources/static/img`. No depende de fotografías externas, servicios de imágenes ni licencias de terceros.

## Autoría

Diseño y desarrollo: [Chilete DevPath](https://chiletedevpath.com/).
