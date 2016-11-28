package com.almaviva.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.almaviva.bean.Anagrafica;
import com.almaviva.bean.User;
import com.almaviva.model.RicercaAnagraficaModel;
import com.almaviva.utility.DBConnectionMysql;

public class RicercaAnagraficaModelDAOImpl implements RicercaAnagraficaModelDAO 
{

	@Override
	public RicercaAnagraficaModel ricercaDati(String username) {
		DBConnectionMysql dbcn = new DBConnectionMysql();
		Connection conn = dbcn.openConnection();
		String query = "SELECT u.username, u.role, a.Nome, a.Cognome, a.indirizzo "
				+ "FROM user as u, anagrafica as a "
				+ "WHERE u.username = a.username "
				+ "AND a.username = '" + username + "';";
		User u = null;
		Anagrafica a = null;
		RicercaAnagraficaModel ram = null;
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			if(rs.next())
			{
				u = new User();
				u.setUsername(rs.getString("username"));
				u.setRole(rs.getInt("role"));
				
				a = new Anagrafica();
				a.setNome(rs.getString("Nome"));
				a.setCognome(rs.getString("Cognome"));
				a.setIndirizzo(rs.getString("indirizzo"));
				
				ram = new RicercaAnagraficaModel();
				ram.setUser(u);
				ram.setAnagrafica(a);
				
			}
			else
			{
				u = new User();
				u.setUsername("");
				u.setRole(0);
				
				a = new Anagrafica();
				a.setNome("");
				a.setCognome("");
				a.setIndirizzo("");
				
				ram = new RicercaAnagraficaModel();
				ram.setUser(u);
				ram.setAnagrafica(a);
			}
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			dbcn.closeConnection(conn);
		}
		return ram;
	}

}
