package com.spring.service;

import com.spring.dao.UserDAO;

public class UserBizImpl implements UserBiz {
	UserBizImpl userDAOImpl;
	public void setUserDAO(UserBizImpl userBizImpl){
		this.userDAOImpl=userDAOImpl;
	}
	public boolean login(String username,String password){
		return userDAOImpl.login(username, password);
	}
	
	
	
}
