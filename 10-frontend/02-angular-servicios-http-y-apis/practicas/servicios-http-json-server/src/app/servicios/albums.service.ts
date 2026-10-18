import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Album } from '../modelos/album';

@Injectable({ providedIn: 'root' })
export class AlbumsService {
  private readonly apiUrl = 'https://jsonplaceholder.typicode.com/albums';

  constructor(private readonly http: HttpClient) {}

  obtenerAlbums(): Observable<Album[]> {
    return this.http.get<Album[]>(this.apiUrl);
  }

  buscarAlbum(id: number): Observable<Album> {
    return this.http.get<Album>(`${this.apiUrl}/${id}`);
  }
}
