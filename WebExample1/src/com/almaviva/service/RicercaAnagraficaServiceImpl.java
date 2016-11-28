package com.almaviva.service;

import com.almaviva.dao.RicercaAnagraficaModelDAOImpl;
import com.almaviva.model.RicercaAnagraficaModel;

public class RicercaAnagraficaServiceImpl implements RicercaAnagraficaService
{
	private RicercaAnagraficaModelDAOImpl radi = new RicercaAnagraficaModelDAOImpl();

	@Override
	public RicercaAnagraficaModel ricercaDati(String username) 
	{		
		return radi.ricercaDati(username);
	}

}
