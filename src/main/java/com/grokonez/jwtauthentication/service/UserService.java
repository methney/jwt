package com.grokonez.jwtauthentication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.grokonez.jwtauthentication.dao.IUserDAO;
import com.grokonez.jwtauthentication.model.User;

@Service
public class UserService implements IUserService {
	@Autowired
	private IUserDAO userDAO;
	
	
	@Override
	public User getUserByUsername(String username) {
		User obj = userDAO.getUserByUsername(username);
		return obj;
	}	
	@Override
	public List<User> getAllUsers(){
		return userDAO.getAllUsers();
	}
	
	
}
