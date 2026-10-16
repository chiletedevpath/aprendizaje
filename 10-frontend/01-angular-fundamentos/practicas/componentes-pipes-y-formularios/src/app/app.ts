import { Component } from '@angular/core';
import { ConversorMoneda } from './conversor-moneda/conversor-moneda';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [ConversorMoneda],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  estudiante = 'Elena Torres';
  matricula = 'EST-001';
  carrera = 'Desarrollo de software';
}
