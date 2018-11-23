package aiss.model;

import java.util.ArrayList;
import java.util.List;

public class Equipos {
	private String nombre;
	private String id;
	private List<Jugadores> jugadores;
	
	public Equipos(){}

	public Equipos(String nombre, String id, List<Jugadores> jugadores) {
		
		this.nombre = nombre;
		this.id = id;
		this.jugadores = jugadores;
	}

	public Equipos(String nombre, List<Jugadores> jugadores) {
		
		this.nombre = nombre;
		this.jugadores = jugadores;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Jugadores> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Jugadores> jugadores) {
		this.jugadores = jugadores;
	}

	public void addJugador(Jugadores j) {
		if (jugadores==null)
			jugadores= new ArrayList<Jugadores>();
		jugadores.add(j);
	
		
	}
	
	

}
