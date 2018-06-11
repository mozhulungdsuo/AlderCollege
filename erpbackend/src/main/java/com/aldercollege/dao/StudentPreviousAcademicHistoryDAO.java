package com.aldercollege.dao;


import com.aldercollege.model.StudentPreviousAcademicHistory;

public interface StudentPreviousAcademicHistoryDAO {
	public boolean addPreviousAcademicHistory (StudentPreviousAcademicHistory previous);
	public boolean deletePreviousAcademicHistory (StudentPreviousAcademicHistory previous);
	public boolean updatePreviousAcademicHistory (StudentPreviousAcademicHistory previous);
	public StudentPreviousAcademicHistory getPreviousAcademicHistory (String id);
}
