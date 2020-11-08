package com.iiht.evaluation.eloan.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String loginid = request.getParameter("UserID");
		String Password = request.getParameter("Password");
		String RelationShip = request.getParameter("BankRelationship");		
		PrintWriter writer=response.getWriter();
		if (RelationShip.contentEquals("User"))
		{
			if (loginid.contentEquals("koti") && Password.contentEquals("koti"))
			{
				response.sendRedirect("userhome1.jsp");
			}
			else
			{
				response.sendRedirect("errorPage.jsp");
			}
		}
		else if (RelationShip.contentEquals("Admin"))
		{
			if (loginid.contentEquals("admin") && Password.contentEquals("admin"))
			{
				response.sendRedirect("adminhome1.jsp");
			}
			else
			{
				response.sendRedirect("errorPage.jsp");
			}
		}
		else
		{			
			response.sendRedirect("errorPage.jsp");
		}		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
