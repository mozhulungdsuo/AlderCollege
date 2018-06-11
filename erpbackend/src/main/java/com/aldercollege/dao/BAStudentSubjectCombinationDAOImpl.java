package com.aldercollege.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aldercollege.model.BAStudentSubjectCombination;
import com.aldercollege.model.HigherSecondaryElectiveSubjects;

@Repository(" bAStudentSubjectCombinationDAO")
public class BAStudentSubjectCombinationDAOImpl implements BAStudentSubjectCombinationDAO {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	@Transactional
	public boolean addBAStudentSubjectCombination(BAStudentSubjectCombination subjects) {
		try
		{
			
			sessionFactory.getCurrentSession().save(subjects);
			return true;			
		
		}catch(Exception e)
		{e.printStackTrace();
		  return false;
		}
	}

	@Override
	@Transactional
	public boolean deleteBAStudentSubjectCombination(BAStudentSubjectCombination subjects) {
		try
		{
			sessionFactory.getCurrentSession().delete(subjects);			
		return true;
		}catch(Exception e)
		{
		      return false;
		}
	}

	@Override
	@Transactional
	public boolean updateBAStudentSubjectCombinatione(BAStudentSubjectCombination subjects) {
		try
		{
			sessionFactory.getCurrentSession().update(subjects);	
			
		    return true;
		}catch(Exception e)
		{
			return false;
		}
	}

	@Override
	@Transactional
	public BAStudentSubjectCombination getBAStudentSubjectCombinationList(String id) {
		try{
			Session session=sessionFactory.openSession();

			BAStudentSubjectCombination subjects=session.get(BAStudentSubjectCombination.class,id);
             session.close();
             
             return subjects;		
		} catch (Exception e)
		{
			return null;
		}
	}

}
