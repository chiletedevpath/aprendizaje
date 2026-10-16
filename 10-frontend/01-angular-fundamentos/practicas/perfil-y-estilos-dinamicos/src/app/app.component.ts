import { Component } from '@angular/core';
import { NgClass, NgStyle } from '@angular/common';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [NgClass, NgStyle],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  nombreCompleto = 'Elena Torres';
  codigo = 'EST-001';
  carrera = 'Desarrollo de software';
  mihobby = 'Crear interfaces accesibles';
  destacado = true;

  cambiarPresentacion(): void {
    this.destacado = !this.destacado;
  }
}
