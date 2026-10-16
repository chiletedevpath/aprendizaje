import { Component } from '@angular/core';
import { FormsModule, NgForm } from '@angular/forms';
import { ConvertirmonedaPipe } from '../convertirmoneda-pipe';

@Component({
  selector: 'app-conversor-moneda',
  standalone: true,
  imports: [FormsModule, ConvertirmonedaPipe],
  templateUrl: './conversor-moneda.html',
  styleUrl: './conversor-moneda.css'
})
export class ConversorMoneda {
  monto: number | null = 100;
  readonly tasaEjemplo = 3.80;
  mostrarResultado = false;

  convertir(formulario: NgForm): void {
    this.mostrarResultado = formulario.valid === true && this.monto !== null && this.monto > 0;
  }

  limpiar(formulario: NgForm): void {
    formulario.resetForm({ monto: 100 });
    this.mostrarResultado = false;
  }
}
