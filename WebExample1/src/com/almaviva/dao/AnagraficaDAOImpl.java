package com.almaviva.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.almaviva.bean.Anagrafica;
import com.almaviva.utility.DBConnectionMysql;

public class AnagraficaDAOImpl implements AnagraficaDAO 
{

	@Override
	public Anagrafica searchAnagrafica(String username) 
	{
		DBConnectionMysql dbc = new DBConnectionMysql();
		
		String querysearch = "SELECT * FROM anagrafica WHERE username = '" + username + "';";
		Connection conn = dbc.openConnection();
		Statement st;
		Anagrafica an = null;
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(querysearch);
			if(rs.next())
			{
				an = new Anagrafica();
				String nome = rs.getString("Nome");
				String cognome = rs.getString("Cognome");
				String indirizzo = rs.getString("indirizzo");
				String usernameread = rs.getString("username");
				
				an.setNome(nome);
				an.setCognome(cognome);
				an.setIndirizzo(indirizzo);
				an.setUsername(usernameread);
				return an;
				
			}
			
			// potrei anche lasciare vuota la parte successiva e far ritornare user null
			else
			{
				an = new Anagrafica();
				an.setNome("");
				an.setCognome("");
				an.setIndirizzo("");
				an.setUsername("");			
			}
			return an;
			
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dbc.closeConnection();
		return null;
	}

	@Override
	public void insertAnagrafica(Anagrafica anagrafica) 
	{
		String query = "INSERT INTO anagrafica (nome, cognome, indirizzo, username) " +
				"VALUES ('" + anagrafica.getNome() + "', '" + 
				anagrafica.getCognome() + "', '" +
				anagrafica.getIndirizzo() + "', '" + 
				anagrafica.getUsername() + "');";
		System.out.println(query);
		
		DBConnectionMysql dbc = new DBConnectionMysql();
		Connection conn = dbc.openConnection();
		
		try 
		{
			Statement st = conn.createStatement();
			st.executeUpdate(query);
			
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			dbc.closeConnection();
		}
	}
	
}
