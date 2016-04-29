package com.test.mongodb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.mongodb.dao.UserDao;
import com.test.mongodb.model.User;
import com.test.mongodb.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	@Override
	public int insertUser(User user) throws Exception {
		return userDao.insertUser(user);
	}
	@Override
	public User findUserById(String id) throws Exception {
		return userDao.findUserById(id);
	}
	@Override
	public int addOrUpdateUser(User user) throws Exception {
		return userDao.addOrUpdateUser(user);
	}
	@Override
	public int updateUser(User user) throws Exception {
		return userDao.updateUser(user);
	}
	@Override
	public int deleteUser(String id) throws Exception {
		return userDao.deleteUser(id);
	}
}
