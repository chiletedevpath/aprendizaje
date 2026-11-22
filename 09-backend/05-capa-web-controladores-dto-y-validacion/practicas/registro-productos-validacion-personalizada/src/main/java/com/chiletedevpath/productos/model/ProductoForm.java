package com.chiletedevpath.productos.model;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public class ProductoForm {

    @NotBlank(message = "El nombre del producto es obligatorio")
    @Size(max = 100, message = "El nombre no debe superar 100 caracteres")
    private String nombre;

    @NotBlank(message = "Selecciona una categoría")
    @Pattern(regexp = "TECNOLOGIA|ALIMENTOS|ROPA", message = "Selecciona una categoría válida")
    private String categoria;

    @NotNull(message = "Indica el precio normal")
    @DecimalMin(value = "0.01", message = "El precio debe ser mayor a 0")
    @Digits(integer = 10, fraction = 2, message = "Usa como máximo 10 enteros y 2 decimales")
    private BigDecimal precio;

    @DecimalMin(value = "0.01", message = "El precio de oferta debe ser mayor a 0")
    @Digits(integer = 10, fraction = 2, message = "Usa como máximo 10 enteros y 2 decimales")
    private BigDecimal precioOferta;

    @NotNull(message = "Indica el stock disponible")
    @Min(value = 0, message = "El stock no puede ser negativo")
    private Integer stock;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public BigDecimal getPrecioOferta() {
        return precioOferta;
    }

    public void setPrecioOferta(BigDecimal precioOferta) {
        this.precioOferta = precioOferta;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
