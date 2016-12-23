package com.spring.dao;

public class UserDaoImpl implements UserDAO {
	public boolean login(String username,String password){
		if(username.equals("admin")&&password.equals("12345")){
			return true;
		}
		return false;
	}
	

}
