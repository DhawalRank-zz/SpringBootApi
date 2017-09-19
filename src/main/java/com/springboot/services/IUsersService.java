package com.springboot.services;
import java.util.List;

import com.springboot.entity.User;
public interface IUsersService {
	
	List<User> getAllUsers();
	User getUserById(int id);
	boolean addUser(User user);
	void updateUser(User user);
	void deleteUser(int id);
}
