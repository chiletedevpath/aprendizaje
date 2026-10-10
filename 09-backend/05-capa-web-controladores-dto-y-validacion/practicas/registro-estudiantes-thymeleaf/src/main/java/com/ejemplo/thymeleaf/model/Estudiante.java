package com.ejemplo.thymeleaf.model;

// Modelo: representa los datos que se capturan en el formulario.
public class Estudiante {
    private String nombre;
    private String correo;
    private Integer edad;
    private String carrera;

    // Thymeleaf y Spring utilizan este constructor para crear el objeto vacío.
    public Estudiante() {
    }

    public Estudiante(String nombre, String correo, Integer edad, String carrera) {
        this.nombre = nombre;
        this.correo = correo;
        this.edad = edad;
        this.carrera = carrera;
    }

    // Los getters y setters permiten leer y asignar datos desde las vistas.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
