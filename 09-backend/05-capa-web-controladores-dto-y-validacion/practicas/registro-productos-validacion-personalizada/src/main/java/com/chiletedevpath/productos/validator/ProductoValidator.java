package com.chiletedevpath.productos.validator;

import com.chiletedevpath.productos.model.ProductoForm;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.math.BigDecimal;
import java.util.Set;

@Component
public class ProductoValidator implements Validator {

    private static final Set<String> CATEGORIAS = Set.of("TECNOLOGIA", "ALIMENTOS", "ROPA");

    @Override
    public boolean supports(Class<?> clazz) {
        return ProductoForm.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ProductoForm form = (ProductoForm) target;

        String nombre = form.getNombre();
        if (nombre == null || nombre.isBlank()) {
            if (!errors.hasFieldErrors("nombre")) {
                errors.rejectValue("nombre", "nombre.vacio", "El nombre del producto es obligatorio");
            }
        } else if (nombre.matches(".*\\d.*")) {
            if (!errors.hasFieldErrors("nombre")) {
                errors.rejectValue("nombre", "nombre.numeros", "El nombre no puede contener números");
            }
        } else if (nombre.trim().length() > 100) {
            if (!errors.hasFieldErrors("nombre")) {
                errors.rejectValue("nombre", "nombre.longitud", "El nombre no debe superar 100 caracteres");
            }
        }

        String categoria = form.getCategoria();
        if (categoria == null || !CATEGORIAS.contains(categoria)) {
            if (!errors.hasFieldErrors("categoria")) {
                errors.rejectValue("categoria", "categoria.invalida", "Selecciona una categoría válida");
            }
        }

        BigDecimal precio = form.getPrecio();
        if (precio == null || precio.signum() <= 0) {
            if (!errors.hasFieldErrors("precio")) {
                errors.rejectValue("precio", "precio.invalido", "El precio debe ser mayor a 0");
            }
        }

        BigDecimal oferta = form.getPrecioOferta();
        if (oferta != null) {
            if (oferta.signum() <= 0) {
                if (!errors.hasFieldErrors("precioOferta")) {
                    errors.rejectValue("precioOferta", "oferta.positiva", "La oferta debe ser mayor a 0");
                }
            } else if (precio != null && precio.signum() > 0 && oferta.compareTo(precio) >= 0) {
                errors.rejectValue("precioOferta", "oferta.invalida", "La oferta debe ser menor que el precio normal");
            }
        }

        Integer stock = form.getStock();
        if (stock == null) {
            if (!errors.hasFieldErrors("stock")) {
                errors.rejectValue("stock", "stock.obligatorio", "Indica el stock disponible");
            }
        } else if (stock < 0) {
            if (!errors.hasFieldErrors("stock")) {
                errors.rejectValue("stock", "stock.negativo", "El stock no puede ser negativo");
            }
        } else if ("TECNOLOGIA".equals(categoria) && stock > 100) {
            errors.rejectValue("stock", "stock.tecnologia", "En TECNOLOGÍA el stock máximo es 100");
        } else if ("ALIMENTOS".equals(categoria) && stock > 500) {
            errors.rejectValue("stock", "stock.alimentos", "En ALIMENTOS el stock máximo es 500");
        }
    }
}
