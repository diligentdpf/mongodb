package com.test.mongodb.dao.impl;

import static org.springframework.data.mongodb.core.query.Update.update;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import com.test.mongodb.dao.UserDao;
import com.test.mongodb.model.User;

@Component
public class UserDaoImpl implements UserDao{
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public int insertUser(User user) throws Exception {
		mongoTemplate.save(user, "user");
		return 0;
	}

	@Override
	public User findUserById(String id) throws Exception {
		return mongoTemplate.findById(id, User.class);
	}

	@Override
	public int addOrUpdateUser(User user) throws Exception {
		mongoTemplate.save(user);
		return 0;
	}

	@Override
	public int updateUser(User user) throws Exception {
		mongoTemplate.upsert(Query.query(Criteria.where("id").is(user.getId())),update("age", user.getAge()).set("name", user.getName()), User.class);
		return 0;
	}
	@Override
	public int deleteUser(String id)throws Exception{
		//mongoTemplate.remove(id, "user");或者
		User user = new User();
		user.setId(id);
		return mongoTemplate.remove(user).getN();
		
	}
}
