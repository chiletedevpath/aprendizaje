package com.chiletedevpath.gestionpersonas.service;

import com.chiletedevpath.gestionpersonas.model.Persona;
import com.chiletedevpath.gestionpersonas.repository.PersonaRepository;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements PersonaService {

    private final PersonaRepository repository;

    public PersonaServiceImpl(PersonaRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Persona> listar() {
        List<Persona> personas = new ArrayList<>();
        repository.findAll().forEach(personas::add);
        personas.sort(Comparator.comparingInt(Persona::getId));
        return personas;
    }

    @Override
    public Optional<Persona> listarId(int id) {
        return repository.findById(id);
    }

    @Override
    public int save(Persona p) {
        return repository.save(p).getId();
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
