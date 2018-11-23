package aiss.resources;

import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;
import aiss.football.*;
public class FootballResources {
	private static final Logger log = Logger.getLogger(FootballResources.class.getName());
	private static final String URL_TABLA = "http://www.football-data.org/v1/competitions/455/leagueTable";
	private static final String URL_EQUIPO= "http://api.football-data.org/v1/teams/%QUERY";
	private static final String URL_JUGADORES="http://api.football-data.org/v1/teams/%QUERY/players";

	public  static LeagueTable getTabla() throws UnsupportedEncodingException {
		ClientResource cr= new ClientResource(URL_TABLA);
		LeagueTable res= cr.get(LeagueTable.class);
		log.log(Level.FINE, "Solicitud de tabla realizada");
		return res;
	}
	public Team getEquipo(String id) throws UnsupportedEncodingException {
		String query = id;
		ClientResource cr= new ClientResource(URL_EQUIPO.replace("%QUERY", query));
		Team res= cr.get(Team.class);
		log.log(Level.FINE, "Solicitud de tabla realizada");
		return res;
	}
	public Players getJugadores(String id) throws UnsupportedEncodingException{
		String query = id;
		ClientResource cr= new ClientResource(URL_JUGADORES.replace("%QUERY", query));
		Players res= cr.get(Players.class);
		log.log(Level.FINE, "Solicitud de jugadores realizada");
		return res;
	}

}
