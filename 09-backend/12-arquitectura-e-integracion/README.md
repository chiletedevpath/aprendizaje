# 12 · Arquitectura e integración

La arquitectura organiza responsabilidades y dependencias. Una arquitectura más compleja solo se justifica cuando resuelve una necesidad real.

**Aprenderás:** capas, dominio, aplicación, infraestructura, puertos/adaptadores y comparación entre arquitectura por capas y hexagonal.

## Modelado UML aplicado

`ejemplos/modelado-uml` reúne un caso genérico con tres perspectivas complementarias:

- diagrama de clases para estructura y relaciones del dominio;
- diagramas de robustez para separar actor, frontera, control y entidad;
- diagramas de secuencia y comunicación para estudiar el orden y la colaboración de los mensajes.

Los diagramas explican decisiones; no sustituyen las reglas escritas ni justifican por sí solos una arquitectura.

**Reto integrador:** diseña una API de gestión de capacitaciones con reglas de negocio, persistencia, seguridad, pruebas e integración externa simulada. Justifica la arquitectura elegida.
