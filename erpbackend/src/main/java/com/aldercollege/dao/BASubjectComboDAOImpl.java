package com.aldercollege.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aldercollege.model.BASubjectCombo;


@Repository(" bASubjectComboDAO")
public class BASubjectComboDAOImpl implements BASubjectComboDAO {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	@Transactional
	public boolean addBAStudentSubjectCombination(BASubjectCombo subjects) {
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
	public boolean deleteBAStudentSubjectCombination(BASubjectCombo subjects) {
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
	public boolean updateBAStudentSubjectCombinatione(BASubjectCombo subjects) {
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
	public BASubjectCombo getBAStudentSubjectCombinationList(String id) {
		try{
			Session session=sessionFactory.openSession();

			BASubjectCombo subjects=session.get(BASubjectCombo.class,id);
             session.close();
             
             return subjects;		
		} catch (Exception e)
		{
			return null;
		}
	}

}
