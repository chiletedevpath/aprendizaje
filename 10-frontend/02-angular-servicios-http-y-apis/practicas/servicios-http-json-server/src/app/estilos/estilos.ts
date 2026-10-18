import { Component } from '@angular/core';
import { NgStyle } from '@angular/common';

@Component({
  selector: 'app-estilos',
  standalone: true,
  imports: [NgStyle],
  templateUrl: './estilos.html',
  styleUrl: './estilos.css'
})
export class Estilos {
  resaltado = false;

  cambiarApariencia(): void {
    this.resaltado = !this.resaltado;
  }
}
