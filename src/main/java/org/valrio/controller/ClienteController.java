package org.valrio.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.valrio.models.Persona;
import org.valrio.service.PersonaService;

import java.util.List;

@Path("cliente")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ClienteController {
    @Inject
    private PersonaService personaService;


    @Path("/saveClient")
    @POST
    public void saveClient(Persona persona) {

        personaService.persistPersona(persona);

    }

    @Path("/getClients")
    @GET
    public List<Persona> getClients(){
        return personaService.getPersone();
    }

    @Path("{id}")
    @GET
    public Persona getClient(@PathParam("id") Long id){
        return personaService.getPersona(id);
    }

    @Path("{id}")
    public void editClient(Persona persona){

    }
}
