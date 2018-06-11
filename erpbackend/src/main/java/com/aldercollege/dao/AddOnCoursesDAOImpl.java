package com.aldercollege.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aldercollege.model.AddOnCourses;

@Repository("addOnCoursesDAO")
public class AddOnCoursesDAOImpl implements AddOnCoursesDAO{
	@Autowired
	SessionFactory sessionFactory;
	@Override
	@Transactional
	public boolean addADDonCourse(AddOnCourses course) {
		try
		{
			
			sessionFactory.getCurrentSession().save(course);
			return true;			
		
		}catch(Exception e)
		{e.printStackTrace();
		  return false;
		}
	}

	@Override
	public boolean deleteAddOnCoursest(AddOnCourses course) {
		try
		{
			sessionFactory.getCurrentSession().delete(course);			
		return true;
		}catch(Exception e)
		{
		      return false;
		}
	}

	@Override
	public boolean updateAddOnCourses(AddOnCourses course) {
		try
		{
			sessionFactory.getCurrentSession().update(course);	
			
		    return true;
		}catch(Exception e)
		{
			return false;
		}
	}

	@Override
	public AddOnCourses getCourse(String id) {
		try{
			Session session=sessionFactory.openSession();

			AddOnCourses course=session.get(AddOnCourses.class,id);
             session.close();
             
             return course;		
		} catch (Exception e)
		{
			return null;
		}
	}

}
