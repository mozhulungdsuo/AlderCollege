package com.aldercollege.dao;

import com.aldercollege.model.HigherSecondaryElectiveSubjects;


public interface HigherSecondaryElectiveSubjectsDAO {
	public boolean addElective(HigherSecondaryElectiveSubjects elective);
	public boolean deleteElective(HigherSecondaryElectiveSubjects elective);
	public boolean updateElective(HigherSecondaryElectiveSubjects elective);
	public HigherSecondaryElectiveSubjects getElectiveList(String id);
}
