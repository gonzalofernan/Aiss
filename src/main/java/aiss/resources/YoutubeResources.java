package aiss.resources;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



import org.restlet.resource.ClientResource;

import aiss.youtube.Item;
import aiss.youtube.Youtube;


public class YoutubeResources {
	private static final Logger log = Logger.getLogger(YoutubeResources.class.getName());
	

	
	public Youtube getVideo(String param) throws UnsupportedEncodingException {
		String query=URLEncoder.encode(param, "UTF-8");
		String URL_YOUTUBE = "https://www.googleapis.com/youtube/v3/search?part=id&q=Best+of+"+query+"&maxResults=1&type=video&key=AIzaSyBTuH030zvE6MU0IjYDJLMJ3lxECdOpHZw";
		ClientResource cr= new ClientResource(URL_YOUTUBE);
		Youtube yt = cr.get(Youtube.class);
		log.log(Level.FINE,"Busqueda realizada");
		return yt;
	}

}
