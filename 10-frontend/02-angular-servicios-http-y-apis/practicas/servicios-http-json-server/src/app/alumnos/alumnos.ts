import { Component, OnInit } from '@angular/core';
import { NgFor, NgIf } from '@angular/common';
import { FormsModule, NgForm } from '@angular/forms';
import { Alumno, NuevoAlumno } from '../modelos/alumno';
import { AlumnosService } from '../servicios/alumnos.service';

@Component({
  selector: 'app-alumnos',
  standalone: true,
  imports: [NgFor, NgIf, FormsModule],
  templateUrl: './alumnos.html',
  styleUrl: './alumnos.css'
})
export class Alumnos implements OnInit {
  alumnos: Alumno[] = [];
  matriculaBuscada = '';
  nuevoAlumno: NuevoAlumno = { matricula: '', nombres: '', apellidos: '' };
  cargando = false;
  guardando = false;
  busquedaActiva = false;
  mensaje = '';
  error = '';

  constructor(private readonly alumnosService: AlumnosService) {}

  ngOnInit(): void {
    this.obtenerAlumnos();
  }

  obtenerAlumnos(): void {
    this.cargando = true;
    this.busquedaActiva = false;
    this.error = '';

    this.alumnosService.obtenerAlumnos().subscribe({
      next: (alumnos) => {
        this.alumnos = alumnos;
        this.cargando = false;
      },
      error: () => {
        this.alumnos = [];
        this.cargando = false;
        this.error = 'No se pudo conectar con el servidor. Ejecuta npm run backend.';
      }
    });
  }

  buscarAlumno(): void {
    const matricula = this.matriculaBuscada.trim();
    if (!matricula) {
      this.obtenerAlumnos();
      return;
    }

    this.cargando = true;
    this.busquedaActiva = true;
    this.error = '';
    this.mensaje = '';

    this.alumnosService.buscarPorMatricula(matricula).subscribe({
      next: (alumnos) => {
        this.alumnos = alumnos;
        this.cargando = false;
      },
      error: () => {
        this.alumnos = [];
        this.cargando = false;
        this.error = 'No fue posible realizar la búsqueda. Verifica json-server.';
      }
    });
  }

  agregarAlumno(formulario: NgForm): void {
    if (formulario.invalid || this.guardando) return;

    const datos: NuevoAlumno = {
      matricula: this.nuevoAlumno.matricula.trim(),
      nombres: this.nuevoAlumno.nombres.trim(),
      apellidos: this.nuevoAlumno.apellidos.trim()
    };

    if (!datos.matricula || !datos.nombres || !datos.apellidos) return;

    this.guardando = true;
    this.error = '';
    this.mensaje = '';

    this.alumnosService.agregarAlumno(datos).subscribe({
      next: (alumno) => {
        this.guardando = false;
        this.mensaje = `Alumno registrado correctamente con ID ${alumno.id}.`;
        this.matriculaBuscada = '';
        formulario.resetForm({ matricula: '', nombres: '', apellidos: '' });
        this.obtenerAlumnos();
      },
      error: () => {
        this.guardando = false;
        this.error = 'No fue posible registrar al alumno. Verifica json-server.';
      }
    });
  }
}
