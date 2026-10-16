package com.ejemplo.mascotas.model;

public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    private String estadoSalud;

    // Spring utiliza el constructor vacío al recibir el formulario.
    public Mascota() {
    }

    public Mascota(String nombre, String especie, int edad, String estadoSalud) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.estadoSalud = estadoSalud;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getEstadoSalud() { return estadoSalud; }
    public void setEstadoSalud(String estadoSalud) { this.estadoSalud = estadoSalud; }
}
