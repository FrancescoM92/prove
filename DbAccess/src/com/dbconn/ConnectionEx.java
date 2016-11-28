package com.dbconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

/*inizializzo connessine 
 * statica locale, è solo una prova,
 * mai mettere credenziali nel codice 
 * non potrei cambiarle*/

public class ConnectionEx 
{
	public static void main(String arg[])
	{
		String username = "root";
		String password = "Alex6630";
		String url = "jdbc:mysql://localhost:3306/db_user";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn ;
			conn = DriverManager.getConnection(url, username, password);
			
			Statement st = conn.createStatement();
			String query = "SELECT * FROM user;";
			ResultSet rs = st.executeQuery(query);
			if (rs.next() != false)
			{
				String userread = rs.getString("username");
				String passread = rs.getString("password");
				System.out.println(userread + " " + passread);
			}
			
			String input = JOptionPane.showInputDialog("inserire username");
			String query1 = "SELECT * FROM user WHERE username = '" + input +"';";
			ResultSet rs1 = st.executeQuery(query1);
			if(rs1.next() != false)
			{
				String userread1 = rs1.getString("username");
				String passread1 = rs1.getString("password");
				System.out.println(userread1 + " " + passread1);
			}
			else
				System.out.println("nome non presente");
			
			conn.close();
			
		} 
		catch (ClassNotFoundException e) 
		{
			System.out.println("Driver Non Trovati");
			e.printStackTrace();
		} 
		catch (SQLException e) {
			System.out.println("errore sql");
			e.printStackTrace();
		}
	}

}
