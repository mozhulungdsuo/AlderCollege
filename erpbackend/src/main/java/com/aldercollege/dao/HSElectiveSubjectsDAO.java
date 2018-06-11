package com.aldercollege.dao;

import com.aldercollege.model.HSElectiveSubjects;


public interface HSElectiveSubjectsDAO {
	public boolean addElective(HSElectiveSubjects elective);
	public boolean deleteElective(HSElectiveSubjects elective);
	public boolean updateElective(HSElectiveSubjects elective);
	public HSElectiveSubjects getElectiveList(String id);
}
