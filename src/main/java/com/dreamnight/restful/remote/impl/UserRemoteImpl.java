package com.dreamnight.restful.remote.impl;

import com.dreamnight.restful.model.User;
import com.dreamnight.restful.remote.IUserRemote;

public class UserRemoteImpl implements IUserRemote{

	@Override
	public User getUserById(Long userId) {
		User u = new User();
		u.setId(1L);
		u.setEmail("test@test.com");
		u.setUserName("testName");
		u.setPhone("testPhone");
		return u;
	}

}
