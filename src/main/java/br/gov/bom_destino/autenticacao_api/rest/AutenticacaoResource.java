package br.gov.bom_destino.autenticacao_api.rest;

import java.io.Serializable;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.gov.bom_destino.autenticacao_api.entities.Credencial;

@Path("autenticacao")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AutenticacaoResource implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@POST
	public Response autenticar(Credencial credencial) {
		StringBuilder resposta = new StringBuilder();
		
		resposta.append(credencial.getNomeCliente());
		resposta.append(" ");
		resposta.append("autenticado");
			
		return Response.ok(resposta.toString()).build();
	}
}