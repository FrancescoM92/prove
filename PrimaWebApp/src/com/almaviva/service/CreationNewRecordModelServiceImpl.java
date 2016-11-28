package com.almaviva.service;

import com.almaviva.bean.Anagrafica;
import com.almaviva.bean.User;
import com.almaviva.dao.CreationNewRecordModelDAOImpl;

public class CreationNewRecordModelServiceImpl implements CreationNewRecordModelService 
{
	private CreationNewRecordModelDAOImpl cnrmdi = new CreationNewRecordModelDAOImpl();
	
	@Override
	public void insertNewUtenza(User user, Anagrafica anagrafica) 
	{
		cnrmdi.insertNewUtenza(user, anagrafica);
	}

}
