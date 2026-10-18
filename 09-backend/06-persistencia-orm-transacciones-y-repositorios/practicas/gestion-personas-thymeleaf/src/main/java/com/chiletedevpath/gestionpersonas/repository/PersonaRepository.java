package com.chiletedevpath.gestionpersonas.repository;

import com.chiletedevpath.gestionpersonas.model.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends CrudRepository<Persona, Integer> {
}
