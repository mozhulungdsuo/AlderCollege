package com.aldercollege.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aldercollege.model.HigherSecondaryElectiveSubjects;

@Repository("higherSecondaryElectiveSubjectsDAO")
public class HigherSecondaryElectiveSubjectsImpl implements HigherSecondaryElectiveSubjectsDAO{
	@Autowired
	SessionFactory sessionFactory;
	@Override
	@Transactional
	public boolean addElective(HigherSecondaryElectiveSubjects elective) {
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
	public boolean deleteElective(HigherSecondaryElectiveSubjects elective) {
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
	public boolean updateElective(HigherSecondaryElectiveSubjects elective) {
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
	public HigherSecondaryElectiveSubjects getElectiveList(String id) {
		try{
			Session session=sessionFactory.openSession();

			HigherSecondaryElectiveSubjects elective=session.get(HigherSecondaryElectiveSubjects.class,id);
             session.close();
             
             return elective;		
		} catch (Exception e)
		{
			return null;
		}
	}

}
