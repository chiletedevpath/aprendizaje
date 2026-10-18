import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'nombreMayuscula',
  standalone: true
})
export class NombreMayusculaPipe implements PipeTransform {
  transform(nombre: string): string {
    return nombre.toLocaleUpperCase('es-PE');
  }
}
