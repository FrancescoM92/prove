package com.almaviva.service;

import com.almaviva.bean.User;
import com.almaviva.dao.UserDAOImpl;

public class UserServiceImpl implements UserService
{
	private UserDAOImpl ud = new UserDAOImpl();

	@Override
	public User searchUser(String username) 
	{
		return ud.searchUser(username);
	}

	@Override
	public void insertUser(User user) 
	{	
		ud.insertUser(user);
	}
	

	
	
}
