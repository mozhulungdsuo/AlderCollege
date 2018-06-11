package com.aldercollege.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aldercollege.model.StudentPicture;
@Repository("studentPictureDAO")
public class StudentPictureDAOImpl implements StudentPictureDAO{
	@Autowired
	SessionFactory sessionFactory;
	@Override
	@Transactional
	public void save(StudentPicture picture) {
		   Session session=sessionFactory.getCurrentSession();			
	     session.saveOrUpdate(picture);
		
	}

	@Override
	@Transactional
	public StudentPicture getPicture(String id) {
		Session session=sessionFactory.getCurrentSession();
		StudentPicture picture=(StudentPicture)session.get(StudentPicture.class, id);
		return picture;
	}

}
