package com.aldercollege.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aldercollege.model.GuardianInfo;
import com.aldercollege.model.HSElectiveSubjects;
@Repository("guardianInfoDAO")
public class GuardianInfoDAOImpl implements GuardianInfoDAO {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	@Transactional
	public boolean addGuardian(GuardianInfo guardian) {
		try
		{
			
			sessionFactory.getCurrentSession().save(guardian);
			return true;			
		
		}catch(Exception e)
		{e.printStackTrace();
		  return false;
		}
	}

	@Override
	@Transactional
	public boolean deleteGuardian(GuardianInfo guardian) {
		try
		{
			sessionFactory.getCurrentSession().delete(guardian);			
		return true;
		}catch(Exception e)
		{
		      return false;
		}
	}

	@Override
	@Transactional
	public boolean updateGuardian(GuardianInfo guardian) {
		try
		{
			sessionFactory.getCurrentSession().update(guardian);	
			
		    return true;
		}catch(Exception e)
		{
			return false;
		}
	}

	@Override
	@Transactional
	public GuardianInfo getGuardian(String id) {
		try{
			Session session=sessionFactory.openSession();

			GuardianInfo guardian=session.get(GuardianInfo.class,id);
             session.close();
             
             return guardian;		
		} catch (Exception e)
		{
			return null;
		}
	}

}
