package com.ejemplo.mascotas.controller;

import com.ejemplo.mascotas.model.Mascota;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Controller
public class MascotaController {

    // Los registros permanecen en memoria mientras el servidor esté encendido.
    private final List<Mascota> mascotas = new CopyOnWriteArrayList<>();

    @GetMapping("/")
    public String inicio(Model model) {
        model.addAttribute("total", mascotas.size());
        model.addAttribute("disponibles", mascotas.stream()
                .filter(m -> "Bueno".equals(m.getEstadoSalud())).count());
        return "inicio";
    }

    @GetMapping("/mascota/nueva")
    public String nueva(Model model) {
        model.addAttribute("mascota", new Mascota());
        return "formulario";
    }

    @PostMapping("/mascota/guardar")
    public String guardar(@ModelAttribute("mascota") Mascota mascota, Model model) {
        // Se aceptan únicamente los tres estados de salud definidos para el refugio.
        boolean saludValida = List.of("Bueno", "Regular", "Critico")
                .contains(mascota.getEstadoSalud());
        boolean datosValidos = mascota.getNombre() != null && !mascota.getNombre().isBlank()
                && mascota.getEspecie() != null && !mascota.getEspecie().isBlank()
                && mascota.getEdad() >= 0 && mascota.getEdad() <= 50
                && saludValida;

        if (!datosValidos) {
            model.addAttribute("error", "Revisa los datos y vuelve a intentarlo.");
            return "formulario";
        }

        mascota.setNombre(mascota.getNombre().trim());
        mascota.setEspecie(mascota.getEspecie().trim());
        mascotas.add(mascota);
        model.addAttribute("mascota", mascota);
        model.addAttribute("indice", mascotas.size() - 1);
        return "detalle";
    }

    @GetMapping("/mascota/lista")
    public String listar(Model model) {
        // Thymeleaf recorre esta lista con th:each y evalúa cada fila con th:if.
        model.addAttribute("mascotas", mascotas);
        model.addAttribute("total", mascotas.size());
        return "lista";
    }

    @GetMapping("/mascota/estado")
    public String mostrarEstado(@RequestParam(name = "indice", required = false) Integer indice, Model model) {
        model.addAttribute("mascotas", mascotas);

        if (mascotas.isEmpty()) {
            // Solo se presenta un caso ilustrativo cuando aún no hay registros.
            model.addAttribute("mascota", new Mascota("Luna", "Gato", 0, "Regular"));
            model.addAttribute("ejemplo", true);
        } else {
            // Sin índice se consulta el registro más reciente.
            int seleccionado = indice != null && indice >= 0 && indice < mascotas.size()
                    ? indice : mascotas.size() - 1;
            model.addAttribute("mascota", mascotas.get(seleccionado));
            model.addAttribute("indiceSeleccionado", seleccionado);
            model.addAttribute("ejemplo", false);
        }

        return "estado";
    }
}
