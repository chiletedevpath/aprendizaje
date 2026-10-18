package com.chiletedevpath.gestionpersonas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "Ingresa el nombre de la persona.")
    @Size(max = 80, message = "El nombre no debe superar los 80 caracteres.")
    private String nombre;

    @NotBlank(message = "Ingresa el número de teléfono.")
    @Pattern(regexp = "^[0-9+()\\-\\s]{6,20}$", message = "Ingresa un teléfono válido de 6 a 20 caracteres.")
    private String telefono;

    public Persona() {
    }

    public Persona(int id, String nombre, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
