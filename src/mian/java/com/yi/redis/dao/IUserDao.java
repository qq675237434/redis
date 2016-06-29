package com.yi.redis.dao;

import com.yi.redis.domian.User;

public interface IUserDao {

	User save(User user);
	
	void update(User user);
	
	void delete(Long id);
	
	User get(Long id);
}
