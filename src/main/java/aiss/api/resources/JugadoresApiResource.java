package aiss.api.resources;

import java.util.Collection;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.jboss.resteasy.spi.NotFoundException;

import aiss.model.Equipos;
import aiss.model.Jugadores;
import aiss.model.repository.LigaInfoRepository;
import aiss.model.repository.LigaInfoRepositoryImpl;


@Path("/jugadores")
public class JugadoresApiResource {
	
	/* Singleton */
		
		
		
		public static  JugadoresApiResource _instance=null;
		LigaInfoRepository repository;
		
		private  JugadoresApiResource() {
			
		
			repository=LigaInfoRepositoryImpl.getInstance();
		}
		
		public static JugadoresApiResource getInstance()
		{
			if(_instance==null)
				_instance=new  JugadoresApiResource();
			return _instance; 
		}
		
		@GET
		@Produces("application/json")
		public Collection<Jugadores> getAll()
		{
			return repository.getAllJugadores();
		}
		
		
		@GET
		@Path("/{id}")
		@Produces("application/json")
		public Jugadores get(@PathParam("id") String jugadorId)
		{
		Jugadores list = repository.getJugadores(jugadorId);
			
			if (list == null) {
				throw new NotFoundException("The Jugador with id="+ jugadorId +" was not found");			
			}
			
			return list;
		}
	}


