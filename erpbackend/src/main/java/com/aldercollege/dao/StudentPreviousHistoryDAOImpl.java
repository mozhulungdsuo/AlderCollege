package com.aldercollege.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aldercollege.model.HSElectiveSubjects;
import com.aldercollege.model.StudentPreviousHistory;
@Repository("studentPreviousHistoryDAO")
public class StudentPreviousHistoryDAOImpl implements StudentPreviousHistoryDAO {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	@Transactional
	public boolean addPreviousAcademicHistory(StudentPreviousHistory previous) {
		try
		{
			
			sessionFactory.getCurrentSession().save(previous);
			return true;			
		
		}catch(Exception e)
		{e.printStackTrace();
		  return false;
		}
	}

	@Override
	public boolean deletePreviousAcademicHistory(StudentPreviousHistory previous) {
		try
		{
			sessionFactory.getCurrentSession().delete(previous);			
		return true;
		}catch(Exception e)
		{
		      return false;
		}
	}

	@Override
	public boolean updatePreviousAcademicHistory(StudentPreviousHistory previous) {
		try
		{
			sessionFactory.getCurrentSession().update(previous);	
			
		    return true;
		}catch(Exception e)
		{
			return false;
		}
	}

	@Override
	public StudentPreviousHistory getPreviousAcademicHistory(String id) {
		try{
			Session session=sessionFactory.openSession();

			StudentPreviousHistory previous=session.get( StudentPreviousHistory.class,id);
             session.close();
             
             return previous;		
		} catch (Exception e)
		{
			return null;
		}
	}

}
