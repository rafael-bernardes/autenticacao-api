package br.com.autenticacao.api.rest;

import java.io.Serializable;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("autenticacao")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AutenticacaoResource implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@GET
	public Response autenticar(@QueryParam("nome-api") String nomeAPI) {
		StringBuilder resposta = new StringBuilder();
		
		resposta.append(nomeAPI);
		resposta.append(" ");
		resposta.append("autenticado");
			
		return Response.ok(resposta.toString()).build();
	}
}