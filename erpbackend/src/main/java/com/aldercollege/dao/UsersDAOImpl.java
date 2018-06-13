package com.aldercollege.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aldercollege.model.AddOnCourses;
import com.aldercollege.model.Users;
@Repository("usersDAO")
public class UsersDAOImpl implements UsersDAO{
	@Autowired
	SessionFactory sessionFactory;
	@Override
	@Transactional
	public boolean addUsers(Users user) {
		try
		{
			
			sessionFactory.getCurrentSession().save(user);
			return true;			
		
		}catch(Exception e)
		{e.printStackTrace();
		  return false;
		}
	}

	@Override
	@Transactional
	public boolean deleteUsers(Users user) {
		try
		{
			sessionFactory.getCurrentSession().delete(user);			
		return true;
		}catch(Exception e)
		{
		      return false;
		}
	}

	@Override
	@Transactional
	public boolean updateUsers(Users user) {
		try
		{
			sessionFactory.getCurrentSession().update(user);	
			
		    return true;
		}catch(Exception e)
		{
			return false;
		}
	}

	@Override
	@Transactional
	public Users getUsers(String userid) {
		try{
			Session session=sessionFactory.openSession();

			Users user=session.get(Users.class,userid);
             session.close();
             
             return user;		
		} catch (Exception e)
		{
			return null;
		}
	}

}
