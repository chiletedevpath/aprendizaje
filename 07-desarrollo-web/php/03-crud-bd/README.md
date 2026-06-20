# CRUD con PHP y MySQL

Practica de desarrollo web con PHP, MySQL, Bootstrap y operaciones CRUD sobre una tabla de personas.

## Objetivo

Practicar la conexion entre una interfaz web, formularios HTML, controladores PHP y una base de datos MySQL.

## Funcionalidades

- Registrar personas.
- Listar registros.
- Editar registros mediante modal.
- Eliminar registros.
- Usar consultas preparadas para operaciones con base de datos.

## Estructura

| Ruta | Proposito |
|---|---|
| `index.php` | Vista principal del CRUD. |
| `conexion.php` | Conexion a MySQL usando variables de entorno o valores locales por defecto. |
| `controlador/` | Acciones de registrar, actualizar y eliminar. |
| `css/estilos.css` | Estilos propios del ejercicio. |
| `assets/` | Recurso visual de marca usado en la practica. |
| `database.sql` | Script base para crear la base de datos y la tabla. |

## Variables de entorno

| Variable | Valor local sugerido |
|---|---|
| `DB_HOST` | `localhost` |
| `DB_USER` | `root` |
| `DB_PASSWORD` | vacio en entorno local |
| `DB_NAME` | `bd_crud_php` |
| `DB_PORT` | `3307` |

## Ejecucion local

1. Crear la base de datos usando `database.sql`.
2. Configurar un servidor local compatible con PHP y MySQL.
3. Ajustar variables de entorno si tu puerto, usuario o base de datos son distintos.
4. Abrir `index.php` desde el servidor local.

## Dependencias externas

Este ejercicio usa Bootstrap y Bootstrap Icons mediante CDN.

## Criterio Chilete DevPath

Los datos ingresados deben ser ficticios. No usar DNI, correos ni telefonos reales en practicas publicas.

## Nota de autoria

Ejercicio desarrollado por Adrian Pisco como parte de su aprendizaje en desarrollo web con PHP y MySQL.
