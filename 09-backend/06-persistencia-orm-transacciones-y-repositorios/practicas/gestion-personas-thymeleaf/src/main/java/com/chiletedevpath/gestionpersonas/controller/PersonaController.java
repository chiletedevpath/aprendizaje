package com.chiletedevpath.gestionpersonas.controller;

import com.chiletedevpath.gestionpersonas.model.Persona;
import com.chiletedevpath.gestionpersonas.service.PersonaService;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class PersonaController {

    private final PersonaService service;

    public PersonaController(PersonaService service) {
        this.service = service;
    }

    @GetMapping({"/", "/listar"})
    public String listar(Model model) {
        List<Persona> personas = service.listar();
        model.addAttribute("personas", personas);
        return "index";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("persona", new Persona());
        return "formulario";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model, RedirectAttributes redirect) {
        Optional<Persona> persona = service.listarId(id);
        if (persona.isEmpty()) {
            redirect.addFlashAttribute("error", "No se encontró la persona solicitada.");
            return "redirect:/listar";
        }
        model.addAttribute("persona", persona.get());
        return "formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@Valid @ModelAttribute("persona") Persona persona,
                          BindingResult resultado,
                          RedirectAttributes redirect) {
        if (resultado.hasErrors()) {
            return "formulario";
        }

        boolean esNuevo = persona.getId() == 0;
        if (!esNuevo && service.listarId(persona.getId()).isEmpty()) {
            redirect.addFlashAttribute("error", "No se puede actualizar: la persona ya no existe.");
            return "redirect:/listar";
        }

        service.save(persona);
        redirect.addFlashAttribute("mensaje", esNuevo
                ? "Persona registrada correctamente."
                : "Persona actualizada correctamente.");
        return "redirect:/listar";
    }

    @PostMapping("/eliminar/{id}")
    public String eliminar(@PathVariable int id, RedirectAttributes redirect) {
        if (service.listarId(id).isEmpty()) {
            redirect.addFlashAttribute("error", "La persona que intentas eliminar no existe.");
        } else {
            service.delete(id);
            redirect.addFlashAttribute("mensaje", "Persona eliminada correctamente.");
        }
        return "redirect:/listar";
    }
}
