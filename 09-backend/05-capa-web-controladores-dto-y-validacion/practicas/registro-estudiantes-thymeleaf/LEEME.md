# Registro de Estudiantes — Spring Boot + Thymeleaf

Práctica del curso **Marcos de Desarrollo Web**, basada en la guía «Ejemplo Tymeleaf.docx» del docente.

## 1. ¿Qué hace la práctica?

- Muestra una página inicial y el número de registros de la sesión.
- Registra **nombre, correo, edad y carrera** en un formulario HTML.
- Recibe los valores con un controlador Spring Boot (`POST /resultado`).
- Muestra los datos recibidos con `th:text`.
- Presenta la lista de estudiantes con `th:each`.
- Demuestra `th:if` y `th:unless` con Ana López, un ejemplo fijo de 17 años.
- Integra CSS y JavaScript desde la carpeta `static`.

**Importante:** la lista se guarda **en memoria**, sin base de datos. Los registros desaparecen cuando se reinicia la aplicación. La guía no exige persistencia permanente.

## 2. Cómo abrirlo en Visual Studio Code (Windows)

1. Descomprime el archivo ZIP en una carpeta de tu equipo.
2. Abre **Visual Studio Code > File > Open Folder** y selecciona **registro-estudiantes-thymeleaf** (la carpeta que contiene `pom.xml`).
3. Verifica que esté instalado **JDK 17 o superior**. En la terminal de VS Code ejecuta: `java -version`.
4. Instala las extensiones recomendadas por VS Code cuando aparezca el aviso, o busca estas extensiones en el panel Extensions:
   - **Extension Pack for Java** (Microsoft).
   - **Spring Boot Extension Pack** (VMware).
5. Espera a que Java cargue y Maven resuelva las dependencias. La primera vez requiere **Internet**.
6. Abre una terminal en VS Code (**Terminal > New Terminal**) y ejecuta:

   ```powershell
   .\mvnw.cmd spring-boot:run
   ```

   El script `mvnw.cmd` descarga Apache Maven 3.9.9 dentro de `.mvn/` si todavía no está allí. No requiere que Maven esté instalado globalmente, pero necesita Internet en el primer uso. Si ya tienes Maven instalado, también puedes ejecutar `mvn spring-boot:run`.

7. Espera el mensaje **Started ThymeleafDemoApplication**. Entra en:

   **http://localhost:8080/**

**Otra forma de iniciar:** abre `ThymeleafDemoApplication.java` y selecciona **Run Java** encima del método `main`, después de que VS Code haya importado el proyecto Maven.

**Para detener el servidor:** presiona `Ctrl + C` en la terminal donde está ejecutándose.

## 3. Estructura del proyecto

```text
Registro_Estudiantes_Thymeleaf/
├── pom.xml                           Dependencias Maven
├── mvnw.cmd                          Arranque desde Windows
├── mvnw                              Arranque desde Linux/macOS
├── .vscode/                          Extensiones y ejecución en VS Code
├── src/main/java/com/ejemplo/thymeleaf/
│   ├── ThymeleafDemoApplication.java  Clase principal
│   ├── controller/
│   │   └── EstudianteController.java  Rutas y procesamiento
│   └── model/
│       └── Estudiante.java            Campos del estudiante
└── src/main/resources/
    ├── application.properties         Configuración
    ├── templates/                    Vistas de Thymeleaf
    │   ├── index.html
    │   ├── formulario.html
    │   ├── resultado.html
    │   ├── lista.html
    │   └── condicional.html
    └── static/
        ├── css/estilos.css
        └── js/script.js
```

## 4. Rutas que puedes mostrar al docente

| Método | Ruta | Vista | Función |
|---|---|---|---|
| GET | `/` | `index.html` | Página inicial |
| GET | `/formulario` | `formulario.html` | Formulario de registro |
| POST | `/resultado` | `resultado.html` | Captura y presenta datos |
| GET | `/lista` | `lista.html` | Muestra registros |
| GET | `/condicional` | `condicional.html` | Demuestra condiciones |

La ruta `/resultado` solo se utiliza al **enviar el formulario (POST)**. No debes abrirla directamente en la barra del navegador mediante GET.

## 5. Pruebas para la demostración

1. Abre `/lista`: aparece el mensaje **Todavía no hay estudiantes registrados**.
2. Entra en **Registrar**, completa los cuatro campos y pulsa **Guardar estudiante**.
3. Se abre la página **Estudiante registrado** con los datos enviados.
4. Pulsa **Ver todos los estudiantes** y comprueba que el registro figura en la tabla.
5. Repite el formulario con un segundo estudiante y comprueba que aparecen dos filas.
6. Abre **Condicionales**: Ana López (17 años) debe mostrar **Es menor de edad: requiere autorización** y **Pendiente**.
7. Abre la página principal: el contador indica la cantidad de estudiantes registrados.

## 6. Conceptos para sustentar

- **Modelo (`Estudiante.java`)**: clase que agrupa los datos del estudiante y sus getters/setters.
- **Controlador (`EstudianteController.java`)**: atiende las peticiones HTTP, procesa el formulario y entrega datos a las vistas mediante `Model`.
- **Vista (`templates/*.html`)**: muestra el contenido procesado por Thymeleaf.
- **`@GetMapping`**: abre páginas de consulta. **`@PostMapping`**: recibe datos del formulario.
- **`@ModelAttribute`**: convierte los campos enviados por el formulario en un objeto `Estudiante`.
- **`th:object`**: vincula el formulario con un objeto Java.
- **`th:field`**: relaciona un `<input>` con una propiedad de ese objeto.
- **`th:action`**: define la ruta del formulario.
- **`th:text`**: muestra los valores enviados desde Java en el HTML.
- **`th:each`**: repite filas de la tabla para cada estudiante.
- **`th:if` / `th:unless`**: muestran contenido según una condición verdadera o falsa.
- **`th:href` / `th:src`**: crean enlaces y rutas a recursos estáticos.
- **`static`**: carpeta de CSS y JavaScript. **`templates`**: carpeta de vistas procesadas por Thymeleaf.

## 7. Diferencias puntuales respecto a la guía

- Se unificó el paquete Java en `com.ejemplo.thymeleaf` para evitar la inconsistencia entre la imagen y los códigos del documento.
- `edad` utiliza `Integer` en lugar de `int`, para que el formulario empiece vacío y no muestre `0`.
- La lista utiliza `CopyOnWriteArrayList`, segura frente a modificaciones concurrentes en esta pequeña demo, con el mismo comportamiento básico de lista en memoria.
- Se renovó el diseño visual y se añadió la adaptación a pantallas móviles, manteniendo las funcionalidades originales.
- `script.js` se enlaza también en la página del formulario, donde realmente existe el elemento `<form>`.

## 8. Alcance

Es un **ejercicio académico**, no un sistema productivo. No incluye autenticación, base de datos, edición, eliminación ni validación completa en el servidor. La comprobación básica de campos obligatorios y formatos se realiza mediante atributos HTML (`required`, `type="email"`, etc.).

Se conserva Spring Boot **3.2.5** para coincidir con la guía del docente. En proyectos nuevos o productivos conviene utilizar una versión de Spring Boot con soporte y actualizaciones de seguridad vigentes.
