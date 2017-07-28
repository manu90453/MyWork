package com.spring.app.dao;

import com.spring.app.model.Login;
import com.spring.app.model.User;

public interface UserDao {
	
	void register(User user);
	
	User validateUser(Login login);

}
