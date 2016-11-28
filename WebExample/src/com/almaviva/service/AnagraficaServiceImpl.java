package com.almaviva.service;

import com.almaviva.bean.Anagrafica;
import com.almaviva.dao.AnagraficaDAOImpl;

public class AnagraficaServiceImpl implements AnagraficaService
{
	private AnagraficaDAOImpl ad = new AnagraficaDAOImpl();
	
	@Override
	public Anagrafica searchAnagrafica(String username) 
	{
		return ad.searchAnagrafica(username);
	}

}
