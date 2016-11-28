package com.almaviva.dao;

import com.almaviva.bean.User;

public interface UserDAO 
{
	//metodo che cerca l'utente e se c'è lo ritorna. 
	public User searchUser(String username);
	
	public void insertUser(User user);
	
}
