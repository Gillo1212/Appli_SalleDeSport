package com.uniquedevelopper.registration;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("username");
		String motpass = request.getParameter("password");
		String urole = request.getParameter("role");
		
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher = null;
		Connection con = null;
		
		
		try {
			// Chargement du driver JDBC
            Class.forName("com.mysql.jdbc.Driver");
            
            // Connexion à la base de données
            String url = "jdbc:mysql://localhost:3306/appsalledesport";
            String user = "root";
            String password = "";
             con = DriverManager.getConnection(url, user, password);
 			
          // Exécuter une requête SQL
			PreparedStatement pst = con.prepareStatement("select * from utilisateurs where email = ? and motDePasse = ? role = ?");
			
			 // Parcourir les résultats
			pst.setString(1, uname);
			pst.setString(2, motpass);
			pst.setString(3, urole);
			
		 ResultSet rs = pst.executeQuery();
		 if(rs.next()) {
			 
			 session.setAttribute("email", rs.getString("uname"));
			 dispatcher = request.getRequestDispatcher("EspaceClient.jsp");
			 
		 }else {
			 
			 request.setAttribute("status", "Echec de connexion");
			 dispatcher = request.getRequestDispatcher("login.jsp");
		 }
			
		 dispatcher.forward(request, response);
		 
		}catch(Exception e) {
			
			
		}
	}

}
