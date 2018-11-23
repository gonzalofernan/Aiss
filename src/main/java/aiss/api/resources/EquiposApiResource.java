package aiss.api.resources;

import java.util.Collection;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.jboss.resteasy.spi.NotFoundException;

import aiss.model.Equipos;

import aiss.model.repository.LigaInfoRepository;
import aiss.model.repository.LigaInfoRepositoryImpl;


@Path("/equipos")
public class EquiposApiResource {
	

	/* Singleton */
		private static EquiposApiResource _instance=null;
		LigaInfoRepository repository;
		
		private  EquiposApiResource() {
			repository=LigaInfoRepositoryImpl.getInstance();

		}
		
		public static EquiposApiResource getInstance()
		{
			if(_instance==null)
					_instance=new EquiposApiResource();
			return _instance;
		}
		@GET
		@Produces("application/json")
		public Collection<Equipos> getAll()
		{
			return repository.getAllEquipos();
		}
		
		
		@GET
		@Path("/{id}")
		@Produces("application/json")
		public Equipos get(@PathParam("id") String id)
		{
			Equipos list = repository.getEquipos(id);
			
			if (list == null) {
				throw new NotFoundException("The Equipo with id="+ id +" was not found");			
			}
			
			return list;
		}
		

}
