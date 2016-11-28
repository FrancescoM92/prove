package com.almaviva.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.almaviva.bean.User;
import com.almaviva.utility.DBConnectionMysql;

public class UserDAOImpl implements UserDAO
{

	@Override
	public User searchUser(String username) 
	{
		String querysearch = "SELECT * FROM user WHERE "+ "username = '" + username + "';";
		
		DBConnectionMysql dbc = new DBConnectionMysql();
		Connection conn = dbc.openConnection();
		Statement st;
		User user = null;
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(querysearch);
			if(rs.next())
			{
				user = new User();
				String userread = rs.getString("username");
				String passread = rs.getString("password");
				int role = rs.getInt("role");
				
				user.setUsername(userread);
				user.setPassword(passread);	
				user.setRole(role);
			}
			
			// potrei anche lasciare vuota la parte successiva e far ritornare user null
			else
			{
				user = new User();
				user.setUsername("");
				user.setPassword("");
				user.setRole(0);
			}
			return user;
			
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dbc.closeConnection(conn);
		return null;
	}

	@Override
	public void insertUser(User user) 
	{
		String query = "INSERT INTO user (username, password, role) " +
				"VALUES ('" + user.getUsername() + "', '" + 
				user.getPassword() + "', '" +
				user.getRole() + "');";
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
			dbc.closeConnection(conn);
		}
	}
	
	
	
}
