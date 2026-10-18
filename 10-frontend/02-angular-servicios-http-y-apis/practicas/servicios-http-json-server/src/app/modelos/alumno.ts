export interface Alumno {
  id: number;
  matricula: string;
  nombres: string;
  apellidos: string;
}

export type NuevoAlumno = Omit<Alumno, 'id'>;
