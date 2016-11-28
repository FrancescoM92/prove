package com.almaviva.service;

import com.almaviva.bean.User;

public interface UserService 
{
	public User searchUser(String username);
	public void insertUser(User user);
}
