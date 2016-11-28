/* pacchetto bean contiene 
 * tutti i ban, la classe user 
 * è il bean dell' entità user del db*/

package com.almaviva.bean;

public class User 
{
	private String username;
	private String password;
	private int role;				//descrizione ruolo utente aggiunto in seguito
	
	public String getUsername() 
	{
		return username;
	}
	public void setUsername(String username) 
	{
		this.username = username;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	public int getRole() 
	{
		return role;
	}
	public void setRole(int role) 
	{
		this.role = role;
	}

	
	
	
	
}
