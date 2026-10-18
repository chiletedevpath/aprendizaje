import { Component } from '@angular/core';
import { Usuarios } from './usuarios/usuarios';
import { Estilos } from './estilos/estilos';
import { Alumnos } from './alumnos/alumnos';
import { Albums } from './albums/albums';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [Usuarios, Estilos, Alumnos, Albums],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  readonly ruta = 'Chilete DevPath';
  readonly enfoque = 'Servicios HTTP, formularios y APIs';
}
