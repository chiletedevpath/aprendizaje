# Glosario de patrones de diseno

Este glosario resume conceptos usados en los ejercicios de `08-patrones`.

| Termino | Significado practico |
|---|---|
| Patron de diseno | Solucion reutilizable para un problema comun de diseno. |
| SOLID | Conjunto de principios para organizar codigo orientado a objetos. |
| Responsabilidad unica | Idea de que una clase debe tener un motivo principal para cambiar. |
| Abierto/cerrado | Codigo abierto a extension y cerrado a modificacion innecesaria. |
| Sustitucion de Liskov | Una clase hija debe poder usarse donde se espera la clase padre. |
| Acoplamiento | Dependencia entre componentes. Menos acoplamiento facilita cambios. |
| Cohesion | Relacion entre las responsabilidades internas de una clase. |
| Factory | Patron que centraliza la creacion de objetos. |
| Abstract Factory | Patron que crea familias de objetos relacionados. |
| Builder | Patron para construir objetos paso a paso. |
| Singleton | Patron que restringe una clase a una unica instancia controlada. |
| Prototype | Patron que crea objetos copiando una instancia base. |
| Adapter | Patron que adapta una interfaz externa a un contrato interno. |
| Bridge | Patron que separa una abstraccion de su implementacion para que ambas evolucionen sin depender directamente. |
| Facade | Patron que simplifica el acceso a un subsistema complejo. |
| Proxy | Patron que usa un intermediario para controlar el acceso a un objeto real. |
| Observer | Patron donde varios observadores reaccionan a cambios de un sujeto. |
| State | Patron que permite cambiar el comportamiento de un objeto segun su estado interno. |
| Command | Patron que encapsula una accion como objeto para ejecutarla, reemplazarla o almacenarla. |
| Memento | Patron que guarda y restaura el estado de un objeto sin exponer sus detalles internos. |

## Criterio de uso

Un patron suma valor cuando reduce complejidad real. Si solo agrega clases sin aclarar el problema, no debe aplicarse.
