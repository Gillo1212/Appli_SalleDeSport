package com.uniquedevelopper.registration;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Servlet implementation class InscriptionServelet
 */

@WebServlet("/inscription")
public class InscriptionServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nom = request.getParameter("name");
		String uemail = request.getParameter("email");
		String motpass = request.getParameter("pass");
		String ucontact = request.getParameter("contact");
		String role = request.getParameter("role");
		
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
			PreparedStatement pst = con.prepareStatement("insert into utilisateurs (nom_comp,email,motDePasse,contact,role) values (?,?,?,?,?)");
			
			 // Parcourir les résultats
			pst.setString(1, nom);
			pst.setString(2, uemail);
			pst.setString(3, motpass);
			pst.setString(4, ucontact);
			pst.setString(5, role);
			
			int rowCount = pst.executeUpdate();
			dispatcher = request.getRequestDispatcher("inscription.jsp");
			
			if(rowCount > 0) {	 
				request.setAttribute("status", "succes");
				
			}else {
				request.setAttribute("status", "failed");
			}
			dispatcher.forward(request, response);
			
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
