package com.ejemplo.thymeleaf.controller;

import com.ejemplo.thymeleaf.model.Estudiante;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Controller
public class EstudianteController {

    // Almacena registros en memoria; se borran al reiniciar la aplicación.
    private final List<Estudiante> listaEstudiantes = new CopyOnWriteArrayList<>();

    @GetMapping("/")
    public String inicio(Model model) {
        // El Model permite enviar datos del controlador hacia index.html.
        model.addAttribute("totalEstudiantes", listaEstudiantes.size());
        return "index";
    }

    @GetMapping("/formulario")
    public String mostrarFormulario(Model model) {
        // Thymeleaf vincula este objeto con th:object y th:field.
        model.addAttribute("estudiante", new Estudiante());
        return "formulario";
    }

    @PostMapping("/resultado")
    public String procesarFormulario(@ModelAttribute("estudiante") Estudiante estudiante, Model model) {
        // Spring convierte los datos enviados en un objeto Estudiante.
        listaEstudiantes.add(estudiante);
        model.addAttribute("estudiante", estudiante);
        return "resultado";
    }

    @GetMapping("/lista")
    public String mostrarLista(Model model) {
        // La vista usa th:each para recorrer los registros recibidos.
        model.addAttribute("estudiantes", listaEstudiantes);
        return "lista";
    }

    @GetMapping("/condicional")
    public String mostrarCondicional(Model model) {
        // Ejemplo fijo de la guía para demostrar th:if y th:unless.
        Estudiante ejemplo = new Estudiante("Ana López", "ana@correo.com", 17, "Ingenieria");
        model.addAttribute("estudiante", ejemplo);
        return "condicional";
    }
}
