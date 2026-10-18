package com.chiletedevpath.gestionpersonas.service;

import com.chiletedevpath.gestionpersonas.model.Persona;
import java.util.List;
import java.util.Optional;

public interface PersonaService {

    List<Persona> listar();

    Optional<Persona> listarId(int id);

    int save(Persona p);

    void delete(int id);
}
