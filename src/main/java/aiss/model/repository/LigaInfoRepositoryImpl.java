package aiss.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import aiss.model.Equipos;
import aiss.model.Jugadores;

import aiss.model.Videos;




public class LigaInfoRepositoryImpl implements LigaInfoRepository {
	Map<String, Equipos> equiposMap;
	Map<String, Jugadores> jugadoresMap;
	private static LigaInfoRepositoryImpl instance=null;
	private int index = 0;
		
	
	public static LigaInfoRepositoryImpl getInstance() {
		
		if (instance==null) {
			instance = new LigaInfoRepositoryImpl();
			instance.init();
		}
		
		return instance;
	}
	
	public void init() {
		
		equiposMap = new HashMap<String,Equipos>();
		jugadoresMap = new HashMap<String,Jugadores>();
		
	//Crear Videos
		
	    Videos nolov = new Videos();
	    nolov.setTitle("Nolito skills");
	    nolov.setUrl("https://youtu.be/wve3ZEBQYRU");
	    
	    Videos mesav = new Videos();
	    mesav.setTitle("Mesa skills");
	    mesav.setUrl("https://youtu.be/EuVDIee55ME");
	    
	    Videos navasv = new Videos();
	    navasv.setTitle("Navas skills");
	    navasv.setUrl("https://youtu.be/d3X7KYMhCkY");
	  
	    Videos javiv = new Videos();
	    javiv.setTitle("Javi García skills");
	    javiv.setUrl("https://youtu.be/HtLL0W5e_cc");
	    
	    Videos barraganv = new Videos();
	    barraganv.setTitle("Antonio Barragan skills");
	    barraganv.setUrl("https://youtu.be/IejTUClZCcc");
	    
	    Videos guardadov = new Videos();
	    guardadov.setTitle("Navas skills");
	    guardadov.setUrl("https://youtu.be/IerwjrwrcWE");
	   
	    
	    //Crear Jugadores
	    
		Jugadores nolo = new Jugadores();
		nolo.setNombre("Nolito");
		nolo.setNacionalidad("Spain");
		nolo.setNumeroDorsal(24);
		nolo.setFechaNacimiento("1988-10-15");
		nolo.setPosicion("Left Wing");
		nolo.setVideo(nolov);
		addJugador(nolo);
		
		  

        Jugadores mesa = new Jugadores();
		mesa.setNombre("Roque Mesa");
		mesa.setNacionalidad("Spain");
		mesa.setNumeroDorsal(20);
		mesa.setFechaNacimiento("1986-3-34");
		mesa.setPosicion("Midfielder");
		mesa.setVideo(mesav);
		addJugador(mesa);       
		
		  
		Jugadores navas = new Jugadores();
		navas.setNombre("Jesus Navas");
		navas.setNacionalidad("Spain");
		navas.setNumeroDorsal(16);
		navas.setFechaNacimiento("1988-11-15");
		navas.setPosicion("Left Wing");
		navas.setVideo(navasv);
		addJugador(navas);
		
		  
		Jugadores javi = new Jugadores();
		javi.setNombre("Javi García");
		javi.setNacionalidad("Spain");
		javi.setNumeroDorsal(19);
		javi.setFechaNacimiento("1990-4-15");
		javi.setPosicion("Midfielder");
		javi.setVideo(javiv);
		addJugador(javi);	
		
		  
		Jugadores barragan = new Jugadores();
		barragan.setNombre("Antonio Barragán");
		barragan.setNacionalidad("Spain");
		barragan.setNumeroDorsal(26);
		barragan.setFechaNacimiento("1988-4-30");
		barragan.setPosicion("Left Wing");
		barragan.setVideo(barraganv);
		addJugador(barragan);			

		
		  
		Jugadores guardado = new Jugadores();
		guardado.setNombre("Andrés Guardado");
		guardado.setNacionalidad("Mexico");
		guardado.setNumeroDorsal(10);
		guardado.setFechaNacimiento("1986-6-1");
		guardado.setPosicion("Midfielder");
		guardado.setVideo(guardadov);
		addJugador(guardado);			



        //Crear Equipos
		
		Equipos sevilla = new Equipos();
	    sevilla.setNombre("Sevilla");
	    addEquipo(sevilla);
	    
	    Equipos betis = new Equipos();
	    betis.setNombre("Real Betis");
	    addEquipo(betis);
	    
	    
	    //Añadir Jugadores a Equipo
	    
	    addJugador(sevilla.getId(),nolo.getId());
	    addJugador(sevilla.getId(),navas.getId());
	    addJugador(sevilla.getId(),mesa.getId());
	    
	    addJugador(betis.getId(),barragan.getId());
	    addJugador(betis.getId(),javi.getId());
	    addJugador(betis.getId(),guardado.getId());
	    
	    
	
	
	}
	
	//Metodos Equipo
	public Collection<Equipos> getAllEquipos() {
		return equiposMap.values();
}
    public Equipos getEquipos(String equipoId) {
	    return equiposMap.get(equipoId);
}
    public Collection<Jugadores> getAllJugadores(String equipoId) {
		return getEquipos(equipoId).getJugadores();
	}
    	public void addEquipo(Equipos t) {
		String id = "p" + index++;	
		t.setId(id);
		equiposMap.put(id,t);
		
	}
    
    	public void addJugador(String equipoId, String jugadorId) {
    		Equipos equipo= getEquipos(equipoId);
    		equipo.addJugador(jugadoresMap.get(jugadorId));	
    	}
    		
     
    	//Metodos Jugadores
    	
	public Collection<Jugadores> getAllJugadores() {
		return jugadoresMap.values();
}
    public Jugadores getJugadores(String jugadorId) {
	    return jugadoresMap.get(jugadorId);
}

	
	public void addJugador(Jugadores j) {
		String id = "p" + index++;	
		j.setId(id);
		jugadoresMap.put(id,j);
		
		
	}




	



	
	

	
}

