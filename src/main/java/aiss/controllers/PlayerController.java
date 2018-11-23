package aiss.controllers;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.resources.YoutubeResources;
import aiss.youtube.Youtube;

/**
 * Servlet implementation class PlayerController
 */
public class PlayerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PlayerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=null;
		String nombre=request.getParameter("name");
		String posicion=request.getParameter("posicion");
		String numero=request.getParameter("numero");
		String fechaNacimiento=request.getParameter("fechaDeNacimiento");
		String nacionalidad=request.getParameter("nacionalidad");
		YoutubeResources yt= new YoutubeResources();
		Youtube embed= yt.getVideo(nombre);
		request.setAttribute("nombre", nombre);
		request.setAttribute("posicion", posicion);
		request.setAttribute("numero", numero);
		request.setAttribute("fechaNacimiento", fechaNacimiento);
		request.setAttribute("embed", embed);
		request.setAttribute("nacionalidad", nacionalidad);
		if(embed!=null) {
			rd=request.getRequestDispatcher("/vistaJugador.jsp");
		}else {
			rd=request.getRequestDispatcher("/error.html");
		}
		rd.forward(request, response);
	}
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
