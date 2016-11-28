package com.almaviva.dao;

import com.almaviva.bean.Anagrafica;

public interface AnagraficaDAO 
{
	public Anagrafica searchAnagrafica(String username);
	
	public void insertAnagrafica(Anagrafica anagrafica);
}
