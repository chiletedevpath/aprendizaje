package com.chiletedevpath.productos.validator;

import com.chiletedevpath.productos.model.ProductoForm;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ProductoValidatorTest {

    private ProductoValidator validator;

    @BeforeEach
    void iniciar() {
        validator = new ProductoValidator();
    }

    private ProductoForm valido() {
        ProductoForm form = new ProductoForm();
        form.setNombre("Monitor LED");
        form.setCategoria("TECNOLOGIA");
        form.setPrecio(new BigDecimal("850.00"));
        form.setPrecioOferta(new BigDecimal("700.00"));
        form.setStock(15);
        return form;
    }

    private Errors validar(ProductoForm form) {
        Errors errors = new BeanPropertyBindingResult(form, "productoForm");
        validator.validate(form, errors);
        return errors;
    }

    @Test
    void aceptaProductoCorrecto() {
        assertFalse(validar(valido()).hasErrors());
        assertTrue(validator.supports(ProductoForm.class));
    }

    @Test
    void rechazaNombreConNumeros() {
        ProductoForm form = valido();
        form.setNombre("Monitor 24");
        assertTrue(validar(form).hasFieldErrors("nombre"));
    }

    @Test
    void rechazaNombreVacio() {
        ProductoForm form = valido();
        form.setNombre("  ");
        assertTrue(validar(form).hasFieldErrors("nombre"));
    }

    @Test
    void rechazaPrecioCero() {
        ProductoForm form = valido();
        form.setPrecio(BigDecimal.ZERO);
        assertTrue(validar(form).hasFieldErrors("precio"));
    }

    @Test
    void rechazaOfertaMayorOIgualAlPrecio() {
        ProductoForm form = valido();
        form.setPrecioOferta(new BigDecimal("850.00"));
        assertTrue(validar(form).hasFieldErrors("precioOferta"));
    }

    @Test
    void rechazaStockExcesivoTecnologia() {
        ProductoForm form = valido();
        form.setStock(101);
        assertTrue(validar(form).hasFieldErrors("stock"));
    }

    @Test
    void rechazaStockExcesivoAlimentos() {
        ProductoForm form = valido();
        form.setCategoria("ALIMENTOS");
        form.setStock(501);
        assertTrue(validar(form).hasFieldErrors("stock"));
    }

    @Test
    void aceptaRopaConStockSuperiorACien() {
        ProductoForm form = valido();
        form.setCategoria("ROPA");
        form.setStock(200);
        assertFalse(validar(form).hasErrors());
    }

    @Test
    void rechazaCategoriaVaciaYStockNegativo() {
        ProductoForm form = valido();
        form.setCategoria("");
        form.setStock(-1);
        Errors errors = validar(form);
        assertTrue(errors.hasFieldErrors("categoria"));
        assertTrue(errors.hasFieldErrors("stock"));
    }

    @Test
    void aceptaOfertaVacia() {
        ProductoForm form = valido();
        form.setPrecioOferta(null);
        assertFalse(validar(form).hasErrors());
    }
}
