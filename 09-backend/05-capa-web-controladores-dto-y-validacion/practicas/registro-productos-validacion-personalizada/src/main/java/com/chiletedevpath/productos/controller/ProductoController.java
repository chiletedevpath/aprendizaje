package com.chiletedevpath.productos.controller;

import com.chiletedevpath.productos.entity.Producto;
import com.chiletedevpath.productos.model.ProductoForm;
import com.chiletedevpath.productos.repository.ProductoRepository;
import com.chiletedevpath.productos.validator.ProductoValidator;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/productos")
public class ProductoController {

    private final ProductoValidator productoValidator;
    private final ProductoRepository productoRepository;

    public ProductoController(ProductoValidator productoValidator, ProductoRepository productoRepository) {
        this.productoValidator = productoValidator;
        this.productoRepository = productoRepository;
    }

    @GetMapping("/nuevo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("productoForm", new ProductoForm());
        return "formulario-producto";
    }

    @PostMapping("/guardar")
    public String guardar(@Valid @ModelAttribute("productoForm") ProductoForm productoForm, BindingResult result,
                          RedirectAttributes redirectAttributes) {

        productoValidator.validate(productoForm, result);
        if (result.hasErrors()) {
            return "formulario-producto";
        }

        Producto producto = new Producto();
        producto.setNombre(productoForm.getNombre().trim());
        producto.setCategoria(productoForm.getCategoria());
        producto.setPrecio(productoForm.getPrecio());
        producto.setPrecioOferta(productoForm.getPrecioOferta());
        producto.setStock(productoForm.getStock());
        productoRepository.save(producto);

        redirectAttributes.addFlashAttribute("mensaje", "El producto se registró correctamente.");
        return "redirect:/productos/lista";
    }

    @GetMapping("/lista")
    public String listar(Model model) {
        model.addAttribute("productos", productoRepository.findAll());
        return "lista-productos";
    }
}
