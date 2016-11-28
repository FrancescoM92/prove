package com.almaviva.dao;

import com.almaviva.bean.Anagrafica;
import com.almaviva.bean.User;

public class CreationNewRecordModelDAOImpl implements CreationNewRecordModelDAO 
{

	@Override
	public void insertNewUtenza(User user, Anagrafica anagrafica) 
	{
		UserDAOImpl udi = new UserDAOImpl();
		udi.insertUser(user);
		
		AnagraficaDAOImpl adi = new AnagraficaDAOImpl();
		adi.insertAnagrafica(anagrafica);
		
	}

}
