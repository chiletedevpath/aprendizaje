package com.chiletedevpath.gestionpersonas.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.chiletedevpath.gestionpersonas.model.Persona;
import com.chiletedevpath.gestionpersonas.repository.PersonaRepository;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class PersonaServiceImplTest {

    @Mock
    private PersonaRepository repository;

    @InjectMocks
    private PersonaServiceImpl service;

    @Test
    void listarDevuelveLasPersonas() {
        Persona persona = new Persona(1, "Ana Pérez", "987654321");
        when(repository.findAll()).thenReturn(List.of(persona));

        assertThat(service.listar()).containsExactly(persona);
    }

    @Test
    void listarIdConsultaElRepositorio() {
        Persona persona = new Persona(2, "Luis Soto", "912345678");
        when(repository.findById(2)).thenReturn(Optional.of(persona));

        assertThat(service.listarId(2)).contains(persona);
    }

    @Test
    void saveDevuelveElIdPersistido() {
        Persona persona = new Persona(7, "María Díaz", "998877665");
        when(repository.save(persona)).thenReturn(persona);

        assertThat(service.save(persona)).isEqualTo(7);
    }

    @Test
    void deleteEliminaPorId() {
        service.delete(3);
        verify(repository).deleteById(3);
    }
}
