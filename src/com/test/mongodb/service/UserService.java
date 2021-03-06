package com.test.mongodb.service;

import com.test.mongodb.model.User;

public interface UserService {
	int insertUser(User user)throws Exception;
	User findUserById(String id)throws Exception;
	int addOrUpdateUser(User user)throws Exception;
	int updateUser(User user)throws Exception;
	int deleteUser(String id)throws Exception;
}
