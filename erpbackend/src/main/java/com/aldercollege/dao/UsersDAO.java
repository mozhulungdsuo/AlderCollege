package com.aldercollege.dao;


import com.aldercollege.model.Users;

public interface UsersDAO {
	public boolean addUsers(Users user);
	public boolean deleteUsers(Users user);
	public boolean updateUsers(Users user);
	public Users getUsers(String userid);
}
