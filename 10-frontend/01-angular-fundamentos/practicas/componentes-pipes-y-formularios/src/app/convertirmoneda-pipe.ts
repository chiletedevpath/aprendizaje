import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'convertirmoneda',
  standalone: true
})
export class ConvertirmonedaPipe implements PipeTransform {
  transform(montoSoles: number | null, tasa: number): string {
    if (montoSoles === null || !Number.isFinite(montoSoles) || tasa <= 0) {
      return 'Monto no válido';
    }

    const montoDolares = montoSoles / tasa;
    return new Intl.NumberFormat('es-PE', {
      style: 'currency', currency: 'USD', minimumFractionDigits: 2,
      maximumFractionDigits: 2
    }).format(montoDolares);
  }
}
