import { Component } from '@angular/core';
import { NgFor, NgIf } from '@angular/common';
import { FormsModule, NgForm } from '@angular/forms';
import { NombreMayusculaPipe } from '../nombre-mayuscula.pipe';

interface Usuario {
  id: number;
  nombre: string;
  rol: string;
  activo: boolean;
}

@Component({
  selector: 'app-usuarios',
  standalone: true,
  imports: [NgFor, NgIf, FormsModule, NombreMayusculaPipe],
  templateUrl: './usuarios.html',
  styleUrl: './usuarios.css'
})
export class Usuarios {
  usuarios: Usuario[] = [
    { id: 1, nombre: 'Elena Torres', rol: 'Estudiante', activo: true },
    { id: 2, nombre: 'Maria Lopez', rol: 'Usuario', activo: true },
    { id: 3, nombre: 'Carlos Perez', rol: 'Invitado', activo: false }
  ];

  mostrarInactivos = true;
  nuevoNombre = '';
  nuevoRol = 'Usuario';
  nuevoActivo = true;

  agregarUsuario(formulario: NgForm): void {
    const nombre = this.nuevoNombre.trim();
    if (formulario.invalid || nombre.length < 3) return;

    this.usuarios.push({
      id: Math.max(...this.usuarios.map(usuario => usuario.id), 0) + 1,
      nombre,
      rol: this.nuevoRol,
      activo: this.nuevoActivo
    });

    formulario.resetForm({ nombre: '', rol: 'Usuario', activo: true });
  }
}
