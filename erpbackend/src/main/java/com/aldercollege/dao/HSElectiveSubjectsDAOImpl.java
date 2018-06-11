package com.aldercollege.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aldercollege.model.HSElectiveSubjects;

@Repository("hSElectiveSubjectsDAO")
public class HSElectiveSubjectsDAOImpl implements HSElectiveSubjectsDAO{
	@Autowired
	SessionFactory sessionFactory;
	@Override
	@Transactional
	public boolean addElective(HSElectiveSubjects elective) {
		try
		{
			
			sessionFactory.getCurrentSession().save(elective);
			return true;			
		
		}catch(Exception e)
		{e.printStackTrace();
		  return false;
		}
	}

	@Override
	@Transactional
	public boolean deleteElective(HSElectiveSubjects elective) {
		try
		{
			sessionFactory.getCurrentSession().delete(elective);			
		return true;
		}catch(Exception e)
		{
		      return false;
		}
	}

	@Override
	@Transactional
	public boolean updateElective(HSElectiveSubjects elective) {
		try
		{
			sessionFactory.getCurrentSession().update(elective);	
			
		    return true;
		}catch(Exception e)
		{
			return false;
		}
	}

	@Override
	@Transactional
	public HSElectiveSubjects getElectiveList(String id) {
		try{
			Session session=sessionFactory.openSession();

			HSElectiveSubjects elective=session.get(HSElectiveSubjects.class,id);
             session.close();
             
             return elective;		
		} catch (Exception e)
		{
			return null;
		}
	}

}
