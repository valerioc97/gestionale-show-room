package org.valrio.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.valrio.models.Persona;
import org.valrio.repository.PersonaRepository;

import java.util.List;

@ApplicationScoped
public class PersonaService {
    @Inject
    private PersonaRepository personaRepository;

    public void persistPersona(Persona persona){
        personaRepository.persist(persona);
    }
    public List<Persona> getPersone(){
        return personaRepository.findAll().stream().toList();
    }
    public Persona getPersona(Long id){
        return personaRepository.findById(id);
    }
}
