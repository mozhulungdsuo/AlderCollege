package com.aldercollege.dao;

import com.aldercollege.model.AddOnCourses;


public interface AddOnCoursesDAO {
	public boolean addADDonCourse(AddOnCourses course);
	public boolean deleteAddOnCourses(AddOnCourses course);
	public boolean updateAddOnCourses(AddOnCourses course);
	public AddOnCourses getCourse(String id);
}
