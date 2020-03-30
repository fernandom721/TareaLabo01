package com.uca.capas.servlets;

import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainServelt
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
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
		// TODO Auto-generated method stub
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		
		PrintWriter out = response.getWriter();
		
		if(user.equals("root") && pass.equals("12345")) {
			out.println("<html>");
			out.println("<body>");
			out.println("<h1>" + "Authorized Access" +"</h1>");
			out.println("</body>");
			out.println("</html>");
		}
		else {
			out.println("<html>");
			out.println("<body>");
			out.println("<h1>"+ "Access Denied" +"</h1>");
			out.println("</body>");
			out.println("</html>");
		}
		//doGet(request, response);
				
	}

}
