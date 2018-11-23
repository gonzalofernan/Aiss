package aiss.api;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import aiss.api.resources.EquiposApiResource;
import aiss.api.resources.JugadoresApiResource;


public class LigaInfoAplication extends Application {
	private Set<Object> items = new HashSet<Object>();
	private Set<Class<?>> classes = new HashSet<Class<?>>();

	public LigaInfoAplication() {
		items.add(EquiposApiResource.getInstance());
		items.add(JugadoresApiResource.getInstance());
		
		
	}

	public Set<Class<?>> getClasses() {
		return classes;
	}

	public Set<Object> getSingletons() {
		return items;
	}

}
