package com.springboot.dao;

import java.util.List;

import com.springboot.entity.User;

public interface IUsersDAO {

	List<User> getAllUsers();
	User getUserById(int id);
	void addUser(User user);
	void updateUser(User user);
	void deleteUser(int id);
	boolean isUserPresent(String username);
	
}
