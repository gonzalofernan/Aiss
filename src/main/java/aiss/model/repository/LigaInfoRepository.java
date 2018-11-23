package aiss.model.repository;

import java.util.Collection;

import aiss.model.Equipos;
import aiss.model.Jugadores;



public interface LigaInfoRepository {
	
	public Collection<Jugadores> getAllJugadores();
	public Jugadores getJugadores(String jugadorId);
	public void addJugador(Jugadores j);
	
	
	public Collection<Equipos> getAllEquipos();
	public Equipos getEquipos(String equipoId);
	public Collection<Jugadores> getAllJugadores( String equipoId);
	public void addEquipo(Equipos t);
	public void addJugador(String equipoId, String jugadorId);
}
