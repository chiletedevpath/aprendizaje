import { Component, OnInit } from '@angular/core';
import { NgFor, NgIf } from '@angular/common';
import { FormsModule, NgForm } from '@angular/forms';
import { HttpErrorResponse } from '@angular/common/http';
import { Album } from '../modelos/album';
import { AlbumsService } from '../servicios/albums.service';

@Component({
  selector: 'app-albums',
  standalone: true,
  imports: [NgFor, NgIf, FormsModule],
  templateUrl: './albums.html',
  styleUrl: './albums.css'
})
export class Albums implements OnInit {
  readonly idReferencia = 37;
  readonly registrosPorPagina = 10;

  idBuscado: number | null = 37;
  albums: Album[] = [];
  albumEncontrado: Album | null = null;
  cargandoLista = false;
  cargandoBusqueda = false;
  errorLista = '';
  errorBusqueda = '';
  pagina = 1;

  constructor(private readonly albumsService: AlbumsService) {}

  ngOnInit(): void {
    this.obtenerAlbums();
    this.buscarAlbum();
  }

  obtenerAlbums(): void {
    this.cargandoLista = true;
    this.errorLista = '';

    this.albumsService.obtenerAlbums().subscribe({
      next: (albums) => {
        this.albums = albums;
        this.pagina = 1;
        this.cargandoLista = false;
      },
      error: () => {
        this.albums = [];
        this.cargandoLista = false;
        this.errorLista = 'No se pudo obtener el listado. Verifica tu conexión a Internet.';
      }
    });
  }

  buscarAlbum(formulario?: NgForm): void {
    if (formulario?.invalid || this.idBuscado === null ||
        !Number.isInteger(this.idBuscado) || this.idBuscado < 1) {
      return;
    }

    this.cargandoBusqueda = true;
    this.albumEncontrado = null;
    this.errorBusqueda = '';

    this.albumsService.buscarAlbum(this.idBuscado).subscribe({
      next: (album) => {
        this.albumEncontrado = album;
        this.cargandoBusqueda = false;
      },
      error: (error: HttpErrorResponse) => {
        this.cargandoBusqueda = false;
        this.errorBusqueda = error.status === 404
          ? 'No existe un álbum con el ID indicado.'
          : 'No se pudo realizar la búsqueda. Verifica tu conexión a Internet.';
      }
    });
  }

  buscarReferencia(): void {
    this.idBuscado = this.idReferencia;
    this.buscarAlbum();
  }

  get totalPaginas(): number {
    return Math.max(1, Math.ceil(this.albums.length / this.registrosPorPagina));
  }

  get albumsVisibles(): Album[] {
    const inicio = (this.pagina - 1) * this.registrosPorPagina;
    return this.albums.slice(inicio, inicio + this.registrosPorPagina);
  }

  cambiarPagina(direccion: number): void {
    const siguiente = this.pagina + direccion;
    if (siguiente >= 1 && siguiente <= this.totalPaginas) {
      this.pagina = siguiente;
    }
  }
}
