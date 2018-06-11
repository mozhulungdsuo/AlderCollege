package com.aldercollege.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aldercollege.model.HigherSecondaryElectiveSubjects;
import com.aldercollege.model.StudentPreviousAcademicHistory;
@Repository("studentPreviousAcademicHistoryDAO")
public class StudentPreviousAcademicHistoryDAOImpl implements StudentPreviousAcademicHistoryDAO {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	@Transactional
	public boolean addPreviousAcademicHistory(StudentPreviousAcademicHistory previous) {
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
	public boolean deletePreviousAcademicHistory(StudentPreviousAcademicHistory previous) {
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
	public boolean updatePreviousAcademicHistory(StudentPreviousAcademicHistory previous) {
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
	public StudentPreviousAcademicHistory getPreviousAcademicHistory(String id) {
		try{
			Session session=sessionFactory.openSession();

			StudentPreviousAcademicHistory previous=session.get( StudentPreviousAcademicHistory.class,id);
             session.close();
             
             return previous;		
		} catch (Exception e)
		{
			return null;
		}
	}

}
