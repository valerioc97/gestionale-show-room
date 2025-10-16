package org.valrio.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import org.valrio.models.Persona;

@ApplicationScoped
@Transactional
public class PersonaRepository implements PanacheRepository<Persona> {

}
