package com.aldercollege.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aldercollege.model.StudentProfile;

@Repository("studentDAO")
public class StudentProfileDAOImpl implements StudentProfileDAO {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	@Transactional
	public boolean addStudent(StudentProfile student) {
		try
		{
			
			sessionFactory.getCurrentSession().save(student);
			return true;			
		
		}catch(Exception e)
		{e.printStackTrace();
		  return false;
		}
	}

	@Override
	@Transactional
	public boolean deleteStudent(StudentProfile student) {
		try
		{
			sessionFactory.getCurrentSession().delete(student);			
		return true;
		}catch(Exception e)
		{
		      return false;
		}
		
	}

	@Override
	@Transactional
	public boolean updateStudent(StudentProfile student) {
		try
		{
			sessionFactory.getCurrentSession().update(student);	
			
		    return true;
		}catch(Exception e)
		{
			return false;
		}
	}

	@Override
	@Transactional
	public StudentProfile getStudent(String id) {
		try{
			Session session=sessionFactory.openSession();

             StudentProfile student=session.get(StudentProfile.class,id);
             session.close();
             
             return student;		
		} catch (Exception e)
		{
			return null;
		}
	}

}
