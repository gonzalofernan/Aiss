package aiss.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.football.Player;
import aiss.resources.FootballResources;

/**
 * Servlet implementation class TeamController
 */
public class TeamController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeamController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=null;
		String id= request.getParameter("id");
		FootballResources f = new FootballResources();
		List<Player> listaJugadores =f.getJugadores(id).getPlayers();
		String nombreEquipo= f.getEquipo(id).getName();
		request.setAttribute("nombreEquipo", nombreEquipo);
		request.setAttribute("infoJugadores", listaJugadores);
		if (listaJugadores!=null) {
			rd=request.getRequestDispatcher("/vistaEquipo.jsp");
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
