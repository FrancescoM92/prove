package com.almaviva.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.almaviva.bean.Anagrafica;
import com.almaviva.bean.User;
import com.almaviva.service.AnagraficaServiceImpl;
import com.almaviva.service.CreationNewRecordModelServiceImpl;
import com.almaviva.service.UserServiceImpl;

/**
 * Servlet implementation class RegServlet
 */
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RegServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String userin = "";
		String passin = "";
		String nomein = "";
		String cognomein = "";
		String indirizzoin ="";
		
		if(request.getParameter("username") != null){
			userin = request.getParameter("username");
		}
		
		if(request.getParameter("password") != null){
			userin = request.getParameter("password");
		}
		
		if(request.getParameter("nome") != null){
			userin = request.getParameter("nome");
		}
		
		if(request.getParameter("cognome") != null){
			userin = request.getParameter("cognome");
		}
		
		if(request.getParameter("indirizzo") != null){
			userin = request.getParameter("indirizzo");
		}
		
		if( !userin.equals("") && !passin.equals("") && !nomein.equals("") && !cognomein.equals("") && !indirizzoin.equals(""))
		{
			User userclient = new User();
			userclient.setUsername(userin);
			userclient.setPassword(passin);
			
			Anagrafica anagclient = new Anagrafica();
			anagclient.setNome(nomein);
			anagclient.setCognome(cognomein);
			anagclient.setIndirizzo(indirizzoin);
			
			CreationNewRecordModelServiceImpl cnrmsi = new CreationNewRecordModelServiceImpl();
			
			cnrmsi.insertNewUtenza(userclient, anagclient);
			
			RequestDispatcher rd = request.getRequestDispatcher("view/index.jsp");
			
			request.setAttribute("displayname", userclient.getUsername());
			
			rd.forward(request, response);
			
		}
		else
		{
			//credenziali non valide
			System.out.println("utenza errata");
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);
		}
	}

}
