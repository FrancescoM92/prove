package com.almaviva.model;

import com.almaviva.bean.Anagrafica;
import com.almaviva.bean.User;

public class RicercaAnagraficaModel 
{
	private User user;
	private Anagrafica anagrafica;
	
	public User getUser() 
	{
		return user;
	}
	public void setUser(User user) 
	{
		this.user = user;
	}
	public Anagrafica getAnagrafica() 
	{
		return anagrafica;
	}
	public void setAnagrafica(Anagrafica anagrafica) 
	{
		this.anagrafica = anagrafica;
	}
	
}
