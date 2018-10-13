package org.wsrestful.colecaopaises.controller;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.wsrestful.colecaopaises.modelo.Pais;
import org.wsrestful.colecaopaises.service.Servico;


@Path("/paises")
public class Controller {
	Servico pServico= new Servico();
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
	public List<Pais> getPaises(){
		List<Pais> lista = pServico.getPaises();
		return lista;
	}

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
	public Pais getIdPais(@PathParam("id") int id){
		return pServico.getPais(id);
	}
   
    @POST
    @Produces(MediaType.APPLICATION_JSON)
	public Pais addPais(Pais pais){
		return pServico.addPais(pais);
	}

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
	public Pais updatePais(Pais pais){
		return pServico.updatePais(pais);
		
	}
	
    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
	public void deletePais(@PathParam("id") int id){
		 pServico.deletePais(id);
		
	}
	
}
