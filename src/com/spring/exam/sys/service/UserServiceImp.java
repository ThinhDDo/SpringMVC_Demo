package com.spring.exam.sys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.spring.exam.sys.dao.UserDAO;
import com.spring.exam.sys.model.User;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public User getUserById(String id) {
		return userDAO.getUserById(id);
	}

	@Override
	public List<User> getUsers() {
		return userDAO.getUsers();
	}
}
