import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Alumno, NuevoAlumno } from '../modelos/alumno';

@Injectable({ providedIn: 'root' })
export class AlumnosService {
  private readonly url = 'http://localhost:3000/alumnos';

  constructor(private readonly http: HttpClient) {}

  obtenerAlumnos(): Observable<Alumno[]> {
    return this.http.get<Alumno[]>(this.url);
  }

  buscarPorMatricula(matricula: string): Observable<Alumno[]> {
    const params = new HttpParams().set('matricula', matricula);
    return this.http.get<Alumno[]>(this.url, { params });
  }

  agregarAlumno(alumno: NuevoAlumno): Observable<Alumno> {
    return this.http.post<Alumno>(this.url, alumno);
  }
}
