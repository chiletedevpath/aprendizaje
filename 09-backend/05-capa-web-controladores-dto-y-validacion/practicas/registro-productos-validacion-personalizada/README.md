# Registro de productos con validación personalizada

Práctica de Chilete DevPath para unir formulario web, validación por capas, persistencia JPA y renderizado con Thymeleaf. El objetivo no es construir un CRUD completo, sino comprender el recorrido de una entrada desde el navegador hasta MySQL y su regreso a una vista.

## Qué se practica

- DTO de formulario separado de la entidad de base de datos.
- Jakarta Bean Validation para reglas de campo.
- `ProductoValidator` para reglas cruzadas entre precio, oferta, categoría y stock.
- controlador MVC, patrón Post/Redirect/Get y mensajes temporales.
- repositorio Spring Data JPA y plantillas Thymeleaf.
- `BigDecimal` para importes monetarios.

## Requisitos

- Java 17 o superior.
- MySQL 8 o MariaDB compatible.
- puerto `8081` disponible.

## Preparación

1. Ejecuta `database/crear_base_datos.sql` en MySQL.
2. Si tu conexión no coincide con los valores predeterminados, define `DB_URL`, `DB_USER` y `DB_PASSWORD` en el entorno. No guardes credenciales reales en el repositorio.
3. Desde esta carpeta ejecuta:

```powershell
.\mvnw.cmd spring-boot:run
```

4. Abre `http://localhost:8081/productos/lista`.

La conexión predeterminada usa `jdbc:mysql://127.0.0.1:3306/chilete_productos`. JPA crea o actualiza únicamente la tabla del ejercicio.

## Recorrido sugerido

1. Registra `Monitor LED`, categoría Tecnología, precio `850`, oferta `700` y stock `15`.
2. Prueba un nombre con números y observa el error del validador personalizado.
3. Usa una oferta igual o mayor al precio normal.
4. Supera 100 unidades en Tecnología o 500 en Alimentos.
5. Vuelve al listado y relaciona el controlador, el repositorio y la iteración de Thymeleaf.

## Pruebas

```powershell
.\mvnw.cmd test
```

Los diez casos unitarios verifican las reglas personalizadas sin necesitar una base de datos en ejecución. La conexión MySQL se requiere para ejecutar la aplicación completa.

Contenido creado para Chilete DevPath con apoyo de IA para estructuración y revisión. El criterio, selección y validación final corresponden a Adrian Pisco, autor de Chilete DevPath.
