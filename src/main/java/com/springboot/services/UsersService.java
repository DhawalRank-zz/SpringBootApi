package com.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.IUsersDAO;
import com.springboot.entity.User;

@Service
public class UsersService implements IUsersService {

	@Autowired
	private IUsersDAO usersDAO;
	
	@Override
	public List<User> getAllUsers() {
		return usersDAO.getAllUsers();
	}

	@Override
	public User getUserById(int id) {
		return usersDAO.getUserById(id);
	}

	@Override
	public synchronized boolean addUser(User user) {
		if(usersDAO.isUserPresent(user.getUsername())){
			return false;
		} else{
			usersDAO.addUser(user);
			return true;
		}		
	}

	@Override
	public void updateUser(User user) {
		usersDAO.updateUser(user);
	}

	@Override
	public void deleteUser(int id) {
		usersDAO.deleteUser(id);
	}

}
