# Gestion de pedidos con notificaciones

Caso integrador en Java para practicar principios SOLID y patrones de diseno dentro de un mismo flujo de negocio.

## Proposito

Modelar el registro de pedidos y ejecutar acciones automaticas cuando se crea un nuevo pedido, manteniendo bajo acoplamiento entre la logica principal y los mecanismos de notificacion.

## Conceptos aplicados

| Concepto | Uso en el caso |
|---|---|
| Singleton | Mantiene una unica instancia del gestor de pedidos. |
| Observer | Permite ejecutar varias acciones cuando se registra un pedido. |
| Adapter | Integra un servicio externo de mensajeria sin modificar su clase original. |
| SRP | Separa modelo, gestion de pedidos, observadores y adaptador. |
| OCP | Permite agregar nuevas acciones sin cambiar la logica central del gestor. |

## Estructura

| Carpeta | Responsabilidad |
|---|---|
| `model` | Define la entidad `Pedido`. |
| `service` | Contiene la gestion principal de pedidos. |
| `observer` | Agrupa las acciones que reaccionan al registro de pedidos. |
| `adapter` | Adapta el servicio externo al contrato interno de notificacion. |

## Como ejecutar

Desde la carpeta `08-patrones`:

```bash
javac -encoding UTF-8 -d out casos-integradores/java/gestion-pedidos-notificaciones/**/*.java
java -cp out edu.pe.utp.patrones_diseno.casos_integradores.gestion_pedidos_notificaciones.Principal
```

En PowerShell, si el comodin recursivo no esta habilitado:

```powershell
$files = Get-ChildItem .\casos-integradores\java\gestion-pedidos-notificaciones -Recurse -Filter *.java | ForEach-Object FullName
javac -encoding UTF-8 -d out $files
java -cp out edu.pe.utp.patrones_diseno.casos_integradores.gestion_pedidos_notificaciones.Principal
```

## Criterio Chilete DevPath

Este caso puede convertirse en una guia para comunidad si se explica con palabras propias: problema, decisiones de diseno, patrones usados y posibles extensiones. No debe publicarse como enunciado academico ni como material institucional.
