package com.almaviva.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.almaviva.bean.User;
import com.almaviva.service.UserServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userin="";
		String passin="";
		
		
		if(request.getParameter("username") != null){
			userin = request.getParameter("username");
		}
		
		if(request.getParameter("password") != null){
			passin= request.getParameter("password");
		}
		
		
		if( !userin.equals("") && !passin.equals(""))
		{
			User userclient = new User();
			userclient.setUsername(userin);
			userclient.setPassword(passin);
			UserServiceImpl usi = new UserServiceImpl();
			User useread = usi.searchUser(userin);
			
			if (useread.getUsername().equals(userclient.getUsername())
					&& useread.getPassword().equals(userclient.getPassword())) 
			{
				System.out.println("Benvenuto");
				
				
				//Redirect verso pagina di benvenuto (views/index)
				
				RequestDispatcher rd = request.getRequestDispatcher("view/index.jsp");
				
				request.setAttribute("displayname", useread.getUsername());
				
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
		else
		{
			System.out.println("campi obbligatori!");
		}
		doGet(request, response);
	}
		

}
