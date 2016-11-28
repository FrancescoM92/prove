package com.almaviva.model;

import com.almaviva.bean.Anagrafica;
import com.almaviva.bean.User;

public class CreationNewRecordModel 
{
	private User user;
	private Anagrafica anagrafca;
	
	public User getUser() 
	{
		return user;
	}
	public void setUser(User user) 
	{
		this.user = user;
	}
	public Anagrafica getAnagrafca() 
	{
		return anagrafca;
	}
	public void setAnagrafca(Anagrafica anagrafca) 
	{
		this.anagrafca = anagrafca;
	}
	
}
